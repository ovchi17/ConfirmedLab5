package workCommandsList

import java.util.*;
import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.AnswerToUser
import usersView.ConsoleWriter

/**
 * Class Show. Show name and id of objects
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Show: Command() {
    override fun execute(str: List<Any>) {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            consoleWriter.printToConsoleLn("emptyCollection")
        }else if(collection.size == 1){
            consoleWriter.printToConsole("showName")
            //answerToUser.writeToConsoleLn(collection.peek().name.toString())
            consoleWriter.printToConsole("showId")
            //answerToUser.writeToConsoleLn(collection.peek().id.toString())
        }else{
            for (i in 0..collection.size - 1){
                consoleWriter.printToConsole("showName")
                //answerToUser.writeToConsoleLn(collection.peek().name.toString())
                consoleWriter.printToConsole("showId")
                //answerToUser.writeToConsoleLn(collection.peek().id.toString())
                collection.poll()
            }
        }

        //answerToUser.writeToConsoleLn("")
    }
}
