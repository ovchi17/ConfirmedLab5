package workCommandsList

import controllers.Tokenizator
import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.AnswerToUser
import usersView.ConsoleWriter
import java.util.*

/**
 * Class UpdateId. Update the object with the given id
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class UpdateId: Command() {
    override fun execute(str: List<Any>) {
        val answerToUser: AnswerToUser = AnswerToUser()
        val checkId = str[0]

        val consoleWriter: ConsoleWriter = ConsoleWriter()
        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())
        val add: Add = Add()
        val tokenizator: Tokenizator = Tokenizator()

        if (collection.size == 0){
            consoleWriter.printToConsoleLn("emptyCollection")
        }else if(collection.size == 1){
            workWithCollection.getCollection().clear()
            if (collection.peek().id == checkId){
                val sendList = listOf("add", checkId.toString())
                tokenizator.tokenizator(add, sendList)

            }else{
                consoleWriter.printToConsoleLn("noId")
                workWithCollection.getCollection().add(collection.peek())
            }
        }else{
            workWithCollection.getCollection().clear()
            for (i in 0..collection.size - 1){
                if (collection.peek().id == checkId){
                    val sendList = listOf("add", checkId.toString())
                    tokenizator.tokenizator(add, sendList)
                    collection.poll()
                }else{
                    workWithCollection.getCollection().add(collection.peek())
                    collection.poll()
                }
            }
        }


    }
}