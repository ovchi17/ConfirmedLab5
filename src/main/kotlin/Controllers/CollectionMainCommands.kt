package Controllers

import DataSet.Route
import java.util.PriorityQueue

interface CollectionMainCommands {
    fun getCollection(): PriorityQueue<Route>
    fun clearCollection()
    fun addElementToCollection(routeObject: Route)
}