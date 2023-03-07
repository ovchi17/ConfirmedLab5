package workCommandsList

import controllers.*
import usersView.AnswerToUser
import usersView.ConsoleWriter

/**
 * Class Clear. Remove all objects from the collection
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Clear: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val consoleWriter: ConsoleWriter = ConsoleWriter()

        workWithCollection.clearCollection()

        consoleWriter.printToConsole("cleared")
        consoleWriter.printToConsoleLn("success")

    }
}