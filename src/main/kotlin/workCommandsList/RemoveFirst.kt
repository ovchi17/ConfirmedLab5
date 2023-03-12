package workCommandsList

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.ConsoleWriter
import java.util.PriorityQueue

/**
 * Class RemoveFirst. Remove the first object
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class RemoveFirst: Command() {
    override fun execute(str: List<Any>) {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            consoleWriter.printToConsoleLn("emptyCollection")
        }else{
            workWithCollection.getCollection().poll()
            consoleWriter.printToConsoleLn("cleared")
        }
    }
}