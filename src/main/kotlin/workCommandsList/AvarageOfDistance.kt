package workCommandsList

import dataSet.Route
import dataSet.RouteComporator
import java.util.*

/**
 * Class AverageOfDistance. Shows the average distance between all objects in collection
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class AvarageOfDistance: Command() {
    override fun execute(str: List<Any>) {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        val sizeCollection = collection.toList()

        if (collection.size == 0){
            consoleWriter.printToConsoleLn("emptyCollection")
        }else{
            var distances: Long = 0
            val result: Double
            for(i in 0..(sizeCollection.count()-1)){
                distances += sizeCollection.get(i).distance
            }
            result = distances / sizeCollection.count().toDouble()
            //answerToUser.writeToConsoleLn(result.toString())
        }
    }
}