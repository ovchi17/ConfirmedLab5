package WorkCommandsList

import java.util.*;
import Controllers.WorkWithCollection
import UsersView.AnswerToUser

class Show: Command {
    override fun execute(str: String) {

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val answerToUser: AnswerToUser = AnswerToUser()

        val collection = workWithCollection.getCollection()

        if (collection.size == 0){
            answerToUser.writeToConsoleLn("Коллекция пуста")
        }else if(collection.size == 1){
            answerToUser.writeToConsoleLn("Name: ${collection.peek().name} Id: ${collection.peek().id}")
        }else{
            for (i in 0..collection.size - 1){
                answerToUser.writeToConsoleLn("Name: ${collection.poll().name} Id: ${collection.peek().id}")
            }
        }

        answerToUser.writeToConsoleLn("")
    }
}
