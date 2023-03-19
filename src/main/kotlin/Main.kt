import controllers.*
import dataSet.Route
import usersView.*
import java.io.File
import java.util.*
import di.koinModule
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin


fun main() {

    startKoin {
        modules(koinModule)
    }

    val writeToConsole: AnswerToUser = AnswerToUser()
    val workWithCollection = WorkWithCollectionHelper().returnWorkWithCollection()
    val tokenizator: Tokenizator = Tokenizator()
    val scannerJsonFile: ScannerJsonFile = ScannerJsonFile()

    scannerJsonFile.scanFile()

    writeToConsole.writeToConsoleLn("Для получения списка команд введите: help")


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

class WorkWithCollectionHelper: KoinComponent{
    val workWithCollection: CollectionMainCommands by inject()

    fun returnWorkWithCollection(): CollectionMainCommands{
        return workWithCollection
    }
}