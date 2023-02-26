package workCommandsList

import controllers.*
import usersView.AnswerToUser
import usersView.ConsoleWriter

class Clear: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val consoleWriter: ConsoleWriter = ConsoleWriter()

        workWithCollection.clearCollection()

        consoleWriter.printToConsole("cleared")
        consoleWriter.printToConsoleLn("success")

    }
}