package workCommandsList

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import java.util.*

class AvarageOfDistance: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {
        println("aod")
//        Я тут просто кое-че тестил, пока не пустое)))
        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())
        println(collection.toArray())
    }
}