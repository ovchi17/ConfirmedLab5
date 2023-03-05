package workCommandsList

import controllers.Tokenizator
import controllers.WorkWithCollection
import org.jetbrains.kotlin.konan.file.File
import usersView.ConsoleWriter
import java.io.FileNotFoundException

class ExecuteScript: Command {

    var fileLink = File("")
    var consoleWriter = ConsoleWriter()
    var stopRecursion = 5
    var checkerRecursion = 0
    var tokenizator = Tokenizator()
    var addChecker = 0
    var params = ""
    var specialForAdd = ""


    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {


        try {
            fileLink = File(str[0] as String)
        } catch (e: FileNotFoundException) {
            consoleWriter.printToConsoleLn("noFile")
            return
        }

        try {
            if (stopRecursion >= checkerRecursion) {
                val commandFromFile = fileLink.readStrings()
                for (line in commandFromFile) {
                    val args = line.split(" ")
                    if (args[0] == "execute_script") {
                        checkerRecursion++
                        var sendList = mutableListOf<Any>()
                        sendList.add(args[1])
                        execute(sendList, workWithCollection)
                    }else if (args[0] == "add" || args[0] == "add_if_max"){
                        addChecker = 10
                        specialForAdd = args[0]
                    }else{
                        if (addChecker > 0){
                            params = params + line + " "
                            addChecker -= 1
                            if (addChecker == 0){
                                var addList = mutableListOf<String>()
                                addList.add(specialForAdd)
                                addList.add(params)
                                tokenizator.tokenizatorHelper(specialForAdd, addList, workWithCollection)
                            }
                        }else{
                            tokenizator.tokenizatorHelper(args[0], args, workWithCollection)
                        }
                    }
                }
            }else{
                consoleWriter.printToConsoleLn("recursion")
            }
        } catch (e: FileNotFoundException) {
            consoleWriter.printToConsoleLn("noFile")
            return
        }

        checkerRecursion -= 1
        if (checkerRecursion == 0) {
            consoleWriter.printToConsoleLn("success")
        }

    }
}

