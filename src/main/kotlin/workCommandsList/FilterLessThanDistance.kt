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

    /**
     * execute method. Delete all objects where distance is less than given
     *
     * @return info from command as ResultModule
     */
    override fun execute(): ResultModule {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())
        val str = parametrs.getParametrs()

        val checkDistance = str[0]

        if (collection.size == 0){
            workWithResultModule.setMessages("emptyCollection")
        }else if(collection.size == 1){
            if (collection.peek().distance < checkDistance.toString().toLong()){
                workWithResultModule.setMessages(consoleWriter.returnKeyValue("showName").toString() + collection.peek().name.toString())
                workWithResultModule.setMessages("   " + consoleWriter.returnKeyValue("showId").toString() + collection.peek().id.toString())
                collection.poll()
            }else{
                workWithResultModule.setMessages("noResult")
            }
        }else{
            for (i in 0..collection.size - 1){
                if (collection.peek().distance < checkDistance.toString().toLong()){
                    workWithResultModule.setMessages(consoleWriter.returnKeyValue("showName").toString() + collection.peek().name.toString())
                    workWithResultModule.setMessages("   " + consoleWriter.returnKeyValue("showId").toString() + collection.peek().id.toString())
                    collection.poll()
                }else{
                    workWithResultModule.setMessages("noResult")
                }
            }
        }

        workWithCollection.clearCollection()
        workWithCollection.addAllElementToCollection(collection)

        return workWithResultModule.getResultModule()
    }
}