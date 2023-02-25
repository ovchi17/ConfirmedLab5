package workCommandsList

import controllers.WorkWithCollection

class ExecuteScript: Command {
    override fun execute(str: String, workWithCollection: WorkWithCollection) {
        println("es")
    }
}