package controllers

import dataSet.Route
import java.util.*

/**
 * CollectionMainCommands(interface). Used in: <code>WorkWithCollection</code>.
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
interface CollectionMainCommands {

    /**
     * getCollection method.
     *
     * @return PriorityQueue collection that contains Route objects
     */
    fun getCollection(): PriorityQueue<Route>

    /**
     * clearCollection method. Clear the collection.
     *
     */
    fun clearCollection()

    /**
     * addElementToCollection method.
     *
     * @param routeObject Route
     */
    fun addElementToCollection(routeObject: Route)

    fun getId(): Long

    fun idPlusOne()

    fun historyUpdate(commandFromUser: String)

    fun getHistory(): MutableList<String>

    fun getInitDate(): Date

    fun collectionToList(collection: PriorityQueue<Route>): List<Route>

    fun listToCollection(list: List<Route>): PriorityQueue<Route>
}