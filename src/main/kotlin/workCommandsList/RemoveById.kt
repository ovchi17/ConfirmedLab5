package workCommandsList

import commandsHelpers.ResultModule
import dataSet.Route
import dataSet.RouteComporator
import java.util.*

/**
 * Class RemoveById. Remove the element with the given id
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class RemoveById: Command() {

    /**
     * execute method. Remove object by given id
     *
     * @return info from command as ResultModule
     */
    override fun execute(): ResultModule {

        val str = parametrs.getParametrs()
        val checkId = str[0]
        var setMessageForMoreThenOne = "noId"

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            workWithResultModule.setMessages("emptyCollection")
        }else if(collection.size == 1){
            if (collection.peek().id == checkId){
                workWithCollection.clearCollection()
                workWithResultModule.setMessages("cleared")
            }else{
                workWithResultModule.setMessages("noId")
            }
        }else{
            workWithCollection.clearCollection()
            for (i in 0..collection.size - 1){
                if (collection.peek().id == checkId){
                    collection.poll()
                    setMessageForMoreThenOne = "cleared"
                }else{
                    workWithCollection.addElementToCollection(collection.peek())
                    collection.poll()
                }
            }
            workWithResultModule.setMessages(setMessageForMoreThenOne)
        }
        return workWithResultModule.getResultModule()
    }
}