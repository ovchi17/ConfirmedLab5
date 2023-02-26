package workCommandsList

import controllers.WorkWithCollection

interface Command {
    fun execute(str: List<Any>, wrk: WorkWithCollection)

}