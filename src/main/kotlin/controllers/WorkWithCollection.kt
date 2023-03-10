package controllers

import java.util.PriorityQueue
import dataSet.*
import java.time.Instant
import java.util.Date

/**
 * WorkWithCollection class. Implements CollectionMainCommands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class WorkWithCollection: CollectionMainCommands {


    private var priorityQueueCollection = PriorityQueue<Route>(RouteComporator())
    var initData = Date.from(Instant.now())
    var commandHistory:MutableList<String> = mutableListOf()
    var idManager: Long = 1;

    /**
     * getCollection method. Return collection
     *
     * @return PriorityQueue<Route>
     */
    override fun getCollection(): PriorityQueue<Route> {
        return priorityQueueCollection
    }

    /**
     * clearCollection method. Clear collection
     *
     */
    override fun clearCollection() {
        while (!priorityQueueCollection.isEmpty()){
            println("Объект ${priorityQueueCollection.remove()} успешно удален")
        }
    }

    /**
     * addElementToCollection method. Add element to collection
     *
     * @param routeObject: Route. Element to be added
     */
    override fun addElementToCollection(routeObject: Route) {
        priorityQueueCollection.add(routeObject)
    }

    /**
     * historyUpdate method. Update history of commands(max size is 14)
     *
     * @param commandFromUser: String. New command that will be added in history
     */
    fun historyUpdate(commandFromUser: String){
        if (commandHistory.size == 14){
            commandHistory.remove(commandHistory[0])
        }
        commandHistory.add(commandFromUser)
    }

    /**
     * getHistory method. Show history of commands (max size is 14)
     *
     * @return commandHistory: MutableList<String>. The list of commands that was executed.
     */
    fun getHistory(): MutableList<String>{
        return commandHistory
    }

    /**
     * getInitDate method. Returns the collection init date
     *
     * @return initDate: Date. The date of collection init
     */
    fun getInitDate():Date {
        return initData
    }

    fun collectionToList(collection: PriorityQueue<Route>): List<Route> {
        return priorityQueueCollection.toList()
    }

    fun listToCollection(list: List<Route>): PriorityQueue<Route>{
        return list.toCollection(PriorityQueue<Route>(RouteComporator()))
    }

}