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
            workWithCollection.getCollection().clear()
            if (collection.peek().id == checkId){
                val sendList = listOf("add", checkId.toString())
                tokenizator.tokenizator(add, sendList)

            }else{
                workWithResultModule.setMessages("noId")
                workWithCollection.getCollection().add(collection.peek())
            }
        }else{
            workWithCollection.getCollection().clear()
            for (i in 0..collection.size - 1){
                if (collection.peek().id == checkId){
                    val sendList = listOf("add", checkId.toString())
                    tokenizator.tokenizator(add, sendList)
                    collection.poll()
                }else{
                    workWithCollection.getCollection().add(collection.peek())
                    collection.poll()
                }
            }
        }

        return workWithResultModule.getResultModule()
    }
}