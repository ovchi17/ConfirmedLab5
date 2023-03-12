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

    override fun getId(): Long {
        return idManager
    }

    override fun idPlusOne() {
        idManager++
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
    override fun historyUpdate(commandFromUser: String){
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
    override fun getHistory(): MutableList<String>{
        return commandHistory
    }

    /**
     * getInitDate method. Returns the collection init date
     *
     * @return initDate: Date. The date of collection init
     */
    override fun getInitDate():Date {
        return initData
    }

    /**
     * collectionToList method. Convert Collection to List
     *
     * @param collection: PriorityQueue<Route>. PriorityQueue Collection that heeded to convert
     * @return priorityQueueCollection.toList(). Returns PriorityQueue Collection in List format
     */
    override fun collectionToList(collection: PriorityQueue<Route>): List<Route> {
        return priorityQueueCollection.toList()
    }

    /**
     * listToCollection method. Convert List to Collection
     *
     * @param list: List<Route>. List that heeded to convert
     * @return list.toCollection(PriorityQueue<Route>(RouteComporator())). Returns List in PriorityQueue Collection format
     */
    override fun listToCollection(list: List<Route>): PriorityQueue<Route>{
        return list.toCollection(PriorityQueue<Route>(RouteComporator()))
    }

}