package workCommandsList

import controllers.WorkWithCollection

interface Command {
    fun execute(str: String, wrk: WorkWithCollection)

}