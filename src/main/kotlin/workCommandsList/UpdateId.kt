package workCommandsList

import controllers.Tokenizator
import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.AnswerToUser
import java.util.*

class UpdateId: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {
        val answerToUser: AnswerToUser = AnswerToUser()

        var checkId = str[0]

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())
        val add: Add = Add()
        val tokenizator: Tokenizator = Tokenizator()

        if (collection.size == 0){
            answerToUser.writeToConsoleLn("Коллекция пуста")
        }else if(collection.size == 1){
            workWithCollection.getCollection().clear()
            if (collection.peek().id == checkId){
                val sendList = listOf("add", checkId.toString())
                tokenizator.tokenizator(add, sendList, workWithCollection)

            }else{
                answerToUser.writeToConsoleLn("Нет элемента с таким айди")
                workWithCollection.getCollection().add(collection.peek())
            }
        }else{
            workWithCollection.getCollection().clear()
            for (i in 0..collection.size - 1){
                if (collection.peek().id == checkId){
                    val sendList = listOf("add", checkId.toString())
                    tokenizator.tokenizator(add, sendList, workWithCollection)
                    collection.poll()
                }else{
                    workWithCollection.getCollection().add(collection.peek())
                    collection.poll()
                }
            }
        }


    }
}