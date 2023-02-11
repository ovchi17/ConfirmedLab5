import Controllers.*
import WorkCommandsList.*
import UsersView.*


fun main() {

// pattern command!!
// сдлеать вначале ввода >
// три ветки
// junit5 module tests
// сильные разветвления по файлам

    val writeToConsole: AnswerToUser = AnswerToUser()
    val withCollection: WorkWithCollection = WorkWithCollection()

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


    while (true){
        writeToConsole.writeToConsole("> ")
        val getCommandFromUser: List<String> = (readln().lowercase() + " noInfo").split(" ")
        if (getCommandFromUser[0] in COMMANDS){
            val command: Command? = COMMANDS.get(getCommandFromUser[0])
            if (command != null) {
                withCollection.historyUpdate(getCommandFromUser[0])
                command.execute(getCommandFromUser[1])
            }
        }else{
            writeToConsole.writeToConsoleLn("Введена неверная команда. Используйте help для просмотра команд")
        }
    }
}