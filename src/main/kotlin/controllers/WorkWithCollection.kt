package controllers

import java.util.PriorityQueue
import dataSet.*
import java.time.Instant
import java.util.Collections.max
import java.util.Date
import kotlin.math.max

class WorkWithCollection: CollectionMainCommands {


    private var priorityQueueCollection = PriorityQueue<Route>(RouteComporator())
    var initData = Date.from(Instant.now())
    var commandHistory:MutableList<String> = mutableListOf()
    var idManager: Long = 1;


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