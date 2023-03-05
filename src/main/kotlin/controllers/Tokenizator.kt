package controllers

import usersView.AnswerToUser
import usersView.ConsoleWriter
import workCommandsList.*


class Tokenizator {

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


    fun tokenizator(command: Command, mass: List<String>, workWithCollection: WorkWithCollection){
        var sendList = mutableListOf<Any>()
        if (mass[0] in listOfLong){
            val newToken = mass[1].toLong()
            sendList.add(newToken)
        }else if(mass[0] in listString){
            val newToken = mass[1].toString()
            sendList.add(newToken)
        }
        command.execute(sendList, workWithCollection)
    }

    fun tokenizatorHelper(command: String, mass: List<String>, workWithCollection: WorkWithCollection){

        if (command in listString || command in listOfLong || command in listOfNo){
            val commandRight: Command? = mp(command)
            if (commandRight != null) {
                var sendList = mutableListOf<Any>()
                if (mass[0] in listOfLong){
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