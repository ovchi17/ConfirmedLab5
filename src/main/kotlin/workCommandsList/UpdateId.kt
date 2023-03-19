package workCommandsList


import commandsHelpers.ResultModule
import dataSet.Route
import dataSet.RouteComporator
import java.util.*

/**
 * Class UpdateId. Update the object with the given id
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class UpdateId: Command() {

    /**
     * execute method. Update object with given id
     *
     * @return info from command as ResultModule
     */
    override fun execute(): ResultModule {

        val str = parametrs.getParametrs()
        val checkId = str[0]

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())
        val add: Add = Add()

        if (collection.size == 0){
            workWithResultModule.setMessages("emptyCollection")
        }else if(collection.size == 1){
            workWithCollection.clearCollection()
            if (collection.peek().id == checkId){
                val sendList = listOf("add", checkId.toString())
                tokenizator.tokenizator(add, sendList)

            }else{
                workWithResultModule.setMessages("noId")
                workWithCollection.addElementToCollection(collection.peek())
            }
        }else{
            workWithCollection.clearCollection()
            for (i in 0..collection.size - 1){
                if (collection.peek().id == checkId){
                    val sendList = listOf("add", checkId.toString())
                    tokenizator.tokenizator(add, sendList)
                    collection.poll()
                }else{
                    workWithCollection.addElementToCollection(collection.peek())
                    collection.poll()
                }
            }
        }

        return workWithResultModule.getResultModule()
    }
}