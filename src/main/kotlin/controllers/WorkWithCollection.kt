package controllers

import java.util.PriorityQueue
import dataSet.*
import java.time.Instant
import java.util.Date

class WorkWithCollection: CollectionMainCommands {

    companion object{
          var priorityQueueCollection = PriorityQueue<Route>(RouteComporator())
          var initData = Date.from(Instant.now())
          var commandHistory:MutableList<String> = mutableListOf()
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

    fun historyUpdate(commandFromUser: String){
        if (commandHistory.size == 14){
            commandHistory.remove(commandHistory[0])
        }
        commandHistory.add(commandFromUser)
    }

    fun getHistory(): MutableList<String>{
        return commandHistory
    }

    fun getInitDate():Date {
        return initData
    }

//    fun saveCollection(): Data{
//
//    }

}