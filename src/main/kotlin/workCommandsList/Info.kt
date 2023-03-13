package workCommandsList

import controllers.WorkWithCollection
import usersView.AnswerToUser
import usersView.ConsoleWriter

/**
 * Class Info. Shows information about a commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Info: Command() {
    override fun execute(str: List<Any>) {


        val collection = workWithCollection.getCollection()

        consoleWriter.printToConsole("typeCollection")
        //answerToUser.writeToConsoleLn(collection.javaClass.toString())
        consoleWriter.printToConsole("sizeCollection")
        //answerToUser.writeToConsoleLn(collection.size.toString())
        consoleWriter.printToConsole("dataCollection")
        //answerToUser.writeToConsoleLn(workWithCollection.getInitDate().toString())

    }
}