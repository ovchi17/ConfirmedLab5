package workCommandsList

import commandsHelpers.ResultModule
import dataSet.Route
import dataSet.RouteComporator
import java.util.*

/**
 * Class RemoveAllByDistance. Delete all objects with the given distance.
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class RemoveAllByDistance: Command() {
    override fun execute(): ResultModule {

        val str = parametrs.getParametrs()
        val checkDistance = str[0]

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            workWithResultModule.setMessages("emptyCollection")
        }else if(collection.size == 1){
            if (collection.peek().distance == checkDistance){
                workWithCollection.getCollection().clear()
                workWithResultModule.setMessages("cleared")
            }else{
                workWithResultModule.setMessages("noDistance")
            }
        }else{
            workWithCollection.getCollection().clear()
            for (i in 0..collection.size - 1){
                if (collection.peek().distance == checkDistance){
                    collection.poll()
                    workWithResultModule.setMessages("cleared")
                }else{
                    workWithCollection.getCollection().add(collection.peek())
                    collection.poll()
                }
            }
        }
        return workWithResultModule.getResultModule()
    }
}