package workCommandsList

import controllers.WorkWithCollection
import usersView.AnswerToUser
import usersView.ConsoleWriter
import kotlin.system.exitProcess

class Exit: Command{
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {
        val consoleWriter: ConsoleWriter = ConsoleWriter()
        consoleWriter.printToConsoleLn("end")
        exitProcess(0)
    }
}