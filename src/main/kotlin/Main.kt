import controllers.*
import dataSet.Route
import workCommandsList.*
import usersView.*
import java.io.File
import java.io.FileReader
import java.util.*
import di.koinModule
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import org.koin.core.component.KoinComponent

fun main() {

    startKoin {
        modules(koinModule)
    }

    val writeToConsole: AnswerToUser = AnswerToUser()
    val workWithCollection: WorkWithCollection = WorkWithCollection()
    val tokenizator: Tokenizator = Tokenizator()



    writeToConsole.writeToConsoleLn("Для получения списка команд введите: help")


    val workWithFile: WorkWithFile = WorkWithFile()
    val pathToFile: String = System.getenv("DataOfCollection")
    var fileReader: FileReader = FileReader(pathToFile)
    val serializer: Serializer = Serializer()
    if (!workWithFile.checkFile(pathToFile)){
        val list = serializer.deserialize(workWithFile.readFile(File(pathToFile)))
        val collection: PriorityQueue<Route> = workWithCollection.listToCollection(list)
        var maxId: Int = 0
        for(i in list.indices){
            if (collection.element().id > maxId){
                maxId = collection.element().id.toInt()
            }
            workWithCollection.addElementToCollection(collection.toList().get(i))
        }
        workWithCollection.idManager = maxId.toLong()
    }

    while (true){
        writeToConsole.writeToConsole("> ")
        val getCommandFromUser: List<String> = ((readln().lowercase()) + " 1").split(" ")
        val getCommand = tokenizator.getCommand(getCommandFromUser[0])
        if (getCommand != null){
            workWithCollection.historyUpdate(getCommandFromUser[0])
            tokenizator.tokenizator(getCommand, getCommandFromUser)
        }else{
            writeToConsole.writeToConsoleLn("Введена неверная команда. Используйте help для просмотра команд")
        }
    }
}