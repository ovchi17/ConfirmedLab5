package workCommandsList

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.AnswerToUser
import usersView.ConsoleWriter
import java.util.*

class RemoveById: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {
        val answerToUser: AnswerToUser = AnswerToUser()

        var checkId = str[0]

        val consoleWriter: ConsoleWriter = ConsoleWriter()
        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            consoleWriter.printToConsoleLn("emptyCollection")
        }else if(collection.size == 1){
            if (collection.peek().id == checkId){
                workWithCollection.getCollection().clear()
                consoleWriter.printToConsoleLn("cleared")
            }else{
                consoleWriter.printToConsoleLn("noId")
            }
        }else{
            workWithCollection.getCollection().clear()
            for (i in 0..collection.size - 1){
                if (collection.peek().id == checkId){
                    collection.poll()
                    consoleWriter.printToConsoleLn("cleared")
                }else{
                    workWithCollection.getCollection().add(collection.peek())
                    collection.poll()
                }
            }
        }
    }
}