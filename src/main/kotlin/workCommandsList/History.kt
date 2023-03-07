package workCommandsList

import controllers.WorkWithCollection
import usersView.AnswerToUser
import usersView.ConsoleWriter

/**
 * Class History. Shows the history of commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class History: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val answerToUser: AnswerToUser = AnswerToUser()
        val consoleWriter: ConsoleWriter = ConsoleWriter()

        val collection = workWithCollection.getHistory()
        consoleWriter.printToConsoleLn("historyOfCommands")
        for (i in 0..collection.size - 1){
            answerToUser.writeToConsole(collection[i] + " ")
        }
        answerToUser.writeToConsoleLn("")
    }
}