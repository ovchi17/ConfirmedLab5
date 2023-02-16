package Controllers

import Controllers.CollectionMainCommands
import java.util.PriorityQueue
import WorkCommandsList.*
import DataSet.*
import java.time.Instant
import java.util.Date

class WorkWithCollection: CollectionMainCommands {

    companion object{
          var priorityQueueCollection = PriorityQueue<Route>(RouteComporator())
          var initData = Date.from(Instant.now())
      }

    override fun getCollection(): PriorityQueue<Route> {
        return priorityQueueCollection
    }

    override fun clearCollection() {
        while (!priorityQueueCollection.isEmpty()){
            println("Объект ${priorityQueueCollection.remove()} успешно удален")
        }
    }

    override fun addElementToCollection(routeObject: Route) {
        priorityQueueCollection.add(routeObject)
    }

    fun getInitDate():Date {
        return initData
    }

}