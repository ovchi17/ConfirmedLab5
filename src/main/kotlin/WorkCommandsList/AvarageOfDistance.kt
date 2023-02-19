package WorkCommandsList

import Controllers.WorkWithCollection
import DataSet.Route
import DataSet.RouteComporator
import java.util.*

class AvarageOfDistance: Command {
    override fun execute(str: String) {
        println("aod")
//        Я тут просто кое-че тестил, пока не пустое)))
        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())
        println(collection.toArray())
    }
}