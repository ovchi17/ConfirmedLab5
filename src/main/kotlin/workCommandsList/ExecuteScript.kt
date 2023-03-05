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
                    if (args[0] != "execute_script") {
                        tokenizator.tokenizatorHelper(args[0], args, workWithCollection)
                    }else{
                        checkerRecursion++
                        var sendList = mutableListOf<Any>()
                        sendList.add(args[1])
                        execute(sendList, workWithCollection)
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

