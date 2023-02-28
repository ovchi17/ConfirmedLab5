package workCommandsList

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.AnswerToUser
import usersView.ConsoleWriter
import java.util.*

class AvarageOfDistance: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val consoleWriter: ConsoleWriter = ConsoleWriter()
        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        val answerToUser: AnswerToUser = AnswerToUser()

        var sizeCollection = collection.toList()

        if (collection.size == 0){
            consoleWriter.printToConsoleLn("emptyCollection")
        }else{
            var distances: Long = 0
            var result: Double
            for(i in 0..(sizeCollection.count()-1)){
                distances += sizeCollection.get(i).distance
            }
            result = distances / sizeCollection.count().toDouble()
            answerToUser.writeToConsoleLn(result.toString())
        }
    }
}