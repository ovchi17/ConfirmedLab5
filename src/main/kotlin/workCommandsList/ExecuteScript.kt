package workCommandsList

import controllers.WorkWithCollection

class ExecuteScript: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {
        println("es")
    }
}