package workCommandsList

import java.util.*;
import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import usersView.AnswerToUser

class Show: Command {
    override fun execute(str: String) {

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val answerToUser: AnswerToUser = AnswerToUser()

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        if (collection.size == 0){
            answerToUser.writeToConsoleLn("Коллекция пуста")
        }else if(collection.size == 1){
            answerToUser.writeToConsoleLn("Name: ${collection.peek().name} Id: ${collection.peek().id}")
        }else{
            for (i in 0..collection.size - 1){
                answerToUser.writeToConsoleLn("Name: ${collection.peek().name} Id: ${collection.peek().id}")
                collection.poll()
            }
        }

        answerToUser.writeToConsoleLn("")
    }
}
