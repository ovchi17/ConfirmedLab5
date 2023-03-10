package workCommandsList

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.AnswerToUser
import usersView.ConsoleWriter
import java.util.PriorityQueue

/**
 * Class FilterLessThanDistance. Delete all objects with distance less then.
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class FilterLessThanDistance: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        val consoleWriter: ConsoleWriter = ConsoleWriter()
        val answerToUser: AnswerToUser = AnswerToUser()

        val checkDistance = str[0]

        if (collection.size == 0){
            consoleWriter.printToConsoleLn("emptyCollection")
        }else if(collection.size == 1){
            consoleWriter.printToConsole("showName")
            answerToUser.writeToConsoleLn(collection.peek().name.toString())
            consoleWriter.printToConsole("showId")
            answerToUser.writeToConsoleLn(collection.peek().id.toString())
        }else{
            for (i in 0..collection.size - 1){
                if (collection.peek().distance < checkDistance.toString().toLong()){
                    consoleWriter.printToConsole("showName")
                    answerToUser.writeToConsoleLn(collection.peek().name.toString())
                    consoleWriter.printToConsole("showId")
                    answerToUser.writeToConsoleLn(collection.peek().id.toString())
                    collection.poll()
                }else{
                    consoleWriter.printToConsoleLn("noResult")
                }
            }
        }

    }
}