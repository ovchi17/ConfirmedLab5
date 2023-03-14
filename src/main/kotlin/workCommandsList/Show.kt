package workCommandsList

import commandsHelpers.ResultModule
import java.util.*;
import dataSet.Route
import dataSet.RouteComporator

/**
 * Class Show. Show name and id of objects
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Show: Command() {
    override fun execute(): ResultModule {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            workWithResultModule.setMessages("emptyCollection")
        }else if(collection.size == 1){
            workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("showName").toString() + collection.peek().name.toString())
            workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("showId").toString() + collection.peek().id.toString())
        }else{
            for (i in 0..collection.size - 1){
                workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("showName").toString() + collection.peek().name.toString())
                workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("showId").toString() + collection.peek().id.toString())
                collection.poll()
            }
        }

        return workWithResultModule.getResultModule()
    }
}
