package workCommandsList

import commandsHelpers.ResultModule
import dataSet.Route
import dataSet.RouteComporator
import java.util.PriorityQueue

/**
 * Class FilterLessThanDistance. Delete all objects with distance less then.
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class FilterLessThanDistance: Command() {
    override fun execute(str: List<Any>): ResultModule {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        val checkDistance = str[0]

        if (collection.size == 0){
            workWithResultModule.setMessages("emptyCollection")
        }else if(collection.size == 1){
            workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("showName").toString() + collection.peek().name.toString())
            workWithResultModule.setMessages("   " + consoleWriter.returnKeyVlaue("showId").toString() + collection.peek().id.toString())
        }else{
            for (i in 0..collection.size - 1){
                if (collection.peek().distance < checkDistance.toString().toLong()){
                    workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("showName").toString() + collection.peek().name.toString())
                    workWithResultModule.setMessages("   " + consoleWriter.returnKeyVlaue("showId").toString() + collection.peek().id.toString())
                    collection.poll()
                }else{
                    workWithResultModule.setMessages("noResult")
                }
            }
        }

        return workWithResultModule.getResultModule()
    }
}