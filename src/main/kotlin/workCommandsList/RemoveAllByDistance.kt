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

    /**
     * execute method. Remove all objects with distance in parametrs
     *
     * @return info from command as ResultModule
     */
    override fun execute(): ResultModule {

        val str = parametrs.getParametrs()
        val checkDistance = str[0]

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            workWithResultModule.setMessages("emptyCollection")
        }else if(collection.size == 1){
            if (collection.peek().distance == checkDistance){
                workWithCollection.clearCollection()
                workWithResultModule.setMessages("cleared")
            }else{
                workWithResultModule.setMessages("noDistance")
            }
        }else{
            workWithCollection.clearCollection()
            for (i in 0..collection.size - 1){
                if (collection.peek().distance == checkDistance){
                    collection.poll()
                    workWithResultModule.setMessages("cleared")
                }else{
                    workWithCollection.addElementToCollection(collection.peek())
                    collection.poll()
                }
            }
        }
        return workWithResultModule.getResultModule()
    }
}