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

    fun getCollection(): Collection<Route>

    fun changeCollection()

    /**
     * clearCollection method. Clear the collection.
     *
     */
    fun clearCollection()

    /**
     * addElementToCollection method. Adds element to collection
     *
     * @param routeObject Route
     */
    fun addElementToCollection(routeObject: Route)

    /**
     * getId method. Returns id
     *
     * @return message as Long
     */
    fun getId(): Long

    /**
     * idPlusOne method. id increases by one
     *
     */
    fun idPlusOne()

    /**
     * historyUpdate method. Update commands history
     *
     * @param commandFromUser
     */
    fun historyUpdate(commandFromUser: String)

    /**
     * getHistory method. Returns history
     *
     * @return message as MutableList<String>
     */
    fun getHistory(): MutableList<String>

    /**
     * getInitDate method. Returns initDate
     *
     * @return message as Date
     */
    fun getInitDate(): Date

    /**
     * addAllElementToCollection method. Add all element to collection
     *
     * @param collection
     */
    fun addAllElementToCollection(collection: Collection<Route>)

    /**
     * collectionToList method. Import collection to list
     *
     * @return message as List<Route>
     */
    fun collectionToList(): List<Route>

    /**
     * pollCollection method. Poll collection
     *
     * @return message as Route
     */
    fun pollCollection(): Route?

    /**
     * peekCollection method. Peek collection
     *
     * @return message as Route?
     */
    fun peekCollection(): Route?

    /**
     * checkCollection method. Returns info
     *
     * @return message as String
     */
    fun checkCollection(): String

    /**
     * listToCollection method. Import list to collection
     *
     * @param list
     * @return message as PriorityQueue<Route>
     */
    fun listToCollection(list: List<Route>): PriorityQueue<Route>
}