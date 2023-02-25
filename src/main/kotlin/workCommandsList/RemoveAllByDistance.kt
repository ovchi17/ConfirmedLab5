package workCommandsList

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.AnswerToUser
import java.util.*

class RemoveAllByDistance: Command {
    override fun execute(str: String, workWithCollection: WorkWithCollection) {
        val answerToUser: AnswerToUser = AnswerToUser()

        var checkDistance = str.toLong()


        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            answerToUser.writeToConsoleLn("Коллекция пуста")
        }else if(collection.size == 1){
            if (collection.peek().distance == checkDistance){
                workWithCollection.getCollection().clear()
                answerToUser.writeToConsoleLn("Отчищено")
            }else{
                answerToUser.writeToConsoleLn("Нет distance в списке")
            }
        }else{
            workWithCollection.getCollection().clear()
            for (i in 0..collection.size - 1){
                if (collection.peek().distance == checkDistance){
                    collection.poll()
                    answerToUser.writeToConsoleLn("Отчищено")
                }else{
                    workWithCollection.getCollection().add(collection.peek())
                    collection.poll()
                }
            }
        }
    }
}