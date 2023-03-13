package workCommandsList

import commandsHelpers.ResultModule
import dataSet.Route
import dataSet.RouteComporator
import java.util.PriorityQueue

/**
 * Class RemoveFirst. Remove the first object
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class RemoveFirst: Command(){
    override fun execute(str: List<Any>): ResultModule {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            workWithResultModule.setMessages("emptyCollection")
        }else{
            workWithCollection.getCollection().poll()
            workWithResultModule.setMessages("cleared")
        }
        return workWithResultModule.getResultModule()
    }
}