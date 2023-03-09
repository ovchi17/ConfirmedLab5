package controllers

import usersView.AnswerToUser
import usersView.ConsoleWriter
import workCommandsList.*

/**
 * Tokenizator class.
 *
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Tokenizator {

    /**
     * mp method. Keys for command
     *
     * @param command Using this parametr we can get the Command
     * @return command as Command
     */
    fun mp(command: String): Command? {
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

        val COMMANDS = mapOf(
            "help" to help,
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

        return COMMANDS[command]
    }


    val listOfNo = listOf("help", "info", "show", "clear", "save", "exit", "remove_first", "add_if_max", "history", "average_of_distance")
    val listOfLong = listOf("update", "remove_by_id", "remove_all_by_distance", "filter_less_than_distance", "add")
    val listString = listOf("execute_script")


    var writeToConsole: AnswerToUser = AnswerToUser()

    /**
     * tokenizator method. Tokenizate massive to commands with right arguments.
     *
     * @param command: Command. Contains the command to be executed.
     * @param mass: Array of String arguments.
     * @param workWithCollection: WorkWithCollection contains our main collection
     */
    fun tokenizator(command: Command, mass: List<String>, workWithCollection: WorkWithCollection){
        var sendList = mutableListOf<Any>()
        if (mass[0] in listOfLong){
            var newToken:Long = 1
            try {
                newToken = mass[1].toLong()
            }catch (e: NumberFormatException){
                writeToConsole.writeToConsoleLn("Ошибка")
            }
            sendList.add(newToken)
        }else if(mass[0] in listString){
            val newToken = mass[1].toString()
            sendList.add(newToken)
        }
        command.execute(sendList, workWithCollection)
    }

    /**
     * tokenizatorHelper method. Tokenizate massive to commands with right arguments(use it for add commands).
     *
     * @param command: String. Contains the command to be executed, but in String type.
     * @param mass: Array of String arguments.
     * @param workWithCollection: WorkWithCollection contains our main collection
     */
    fun tokenizatorHelper(command: String, mass: List<String>, workWithCollection: WorkWithCollection){

        if (command in listString || command in listOfLong || command in listOfNo){
            val commandRight: Command? = mp(command)
            if (commandRight != null) {
                var sendList = mutableListOf<Any>()

                if (command == "add" || command == "add_if_max") {
                    sendList.add(1.toLong())
                    sendList.add(mass[1])
                }else if (mass[0] in listOfLong){
                    val newToken = mass[1].toLong()
                    sendList.add(newToken)
                }else if(mass[0] in listString){
                    val newToken = mass[1].toString()
                    sendList.add(newToken)
                }
                commandRight.execute(sendList, workWithCollection)
            }

        }else{
            writeToConsole.writeToConsoleLn("Ошибка в исполняемом скрипте")
        }
    }
}