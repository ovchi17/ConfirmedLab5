package Controllers

import Controllers.CollectionMainCommands
import java.util.PriorityQueue
import WorkCommandsList.*
import DataSet.*

class WorkWithCollection: CollectionMainCommands {

      companion object{
          var priorityQueueCollection = PriorityQueue<Route>()
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
}