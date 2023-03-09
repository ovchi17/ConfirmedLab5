import controllers.*
import dataSet.Route
import workCommandsList.*
import usersView.*
import java.io.File
import java.io.FileReader
import java.util.*


fun main() {

// pattern command!!
// сдлеать вначале ввода >
// три ветки
// junit5 module tests
// сильные разветвления по файлам

    val writeToConsole: AnswerToUser = AnswerToUser()
    val workWithCollection: WorkWithCollection = WorkWithCollection()
    val tokenizator: Tokenizator = Tokenizator()

    val help: Help = Help()
    val info: Info = Info()
    val show: Show = Show()
    val add: Add = Add()
    val updateId: UpdateId = UpdateId()
    val removeById: RemoveById = RemoveById()
    val clear: Clear = Clear()
    val save: Save = Save()
    val executeScript: ExecuteScript = ExecuteScript()
    val exit: Exit = Exit()
    val removeFirst: RemoveFirst = RemoveFirst()
    val addIfMax: AddIfMax = AddIfMax()
    val history: History = History()
    val removeAllByDistance: RemoveAllByDistance = RemoveAllByDistance()
    val averageOfDistance: AvarageOfDistance = AvarageOfDistance()
    val filterLessThanDistance: FilterLessThanDistance = FilterLessThanDistance()

    writeToConsole.writeToConsoleLn("Для получения списка команд введите: help")

    val COMMANDS = mapOf("help" to help,
                         "info" to info,
                         "show" to show,
                         "add" to add,
                         "update" to updateId,
                         "remove_by_id" to removeById,
                         "clear" to clear,
                         "save" to save,
                         "execute_script" to executeScript,
                         "exit" to exit,
                         "remove_first" to removeFirst,
                         "add_if_max" to addIfMax,
                         "history" to history,
                         "remove_all_by_distance" to removeAllByDistance,
                         "average_of_distance" to averageOfDistance,
                         "filter_less_than_distance" to filterLessThanDistance)

    val workWithFile: WorkWithFile = WorkWithFile()
    var pathToFile: String = "src/main/kotlin/dataSet/DataOfCollection.json"
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
        if (getCommandFromUser[0] in COMMANDS){
            val command: Command? = COMMANDS.get(getCommandFromUser[0])
            if (command != null) {
                workWithCollection.historyUpdate(getCommandFromUser[0])
                tokenizator.tokenizator(command, getCommandFromUser, workWithCollection)
            }
        }else{
            writeToConsole.writeToConsoleLn("Введена неверная команда. Используйте help для просмотра команд")
        }
    }
}