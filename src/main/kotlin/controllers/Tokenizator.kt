package controllers

import workCommandsList.Command


class Tokenizator {

    val listOfNo = listOf("help", "info", "show", "clear", "save", "exit", "remove_first", "add_if_max", "history", "average_of_distance")
    val listOfLong = listOf("update", "remove_by_id", "remove_all_by_distance", "filter_less_than_distance", "add")
    val listString = listOf("execute_script")



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
}