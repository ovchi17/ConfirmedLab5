package controllers

import workCommandsList.Command


class Tokenizator {

    val listOfNo = listOf("help", "info", "show", "add", "clear", "save", "exit", "remove_first", "add_if_max", "history", "average_of_distance")
    val listOfInt = listOf("update", "remove_by_id", "remove_all_by_distance", "filter_less_than_distance")
    val listString = listOf("execute_script")



    fun tokenizator(command: Command, mass: List<String>, workWithCollection: WorkWithCollection){
        command.execute(mass[1], workWithCollection)
    }
}