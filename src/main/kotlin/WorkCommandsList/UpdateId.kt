package WorkCommandsList

import Controllers.WorkWithCollection
import DataSet.Coordinates
import DataSet.Location
import DataSet.Route
import DataSet.RouteComporator
import UsersView.AnswerToUser
import java.time.LocalDate
import java.util.*

class UpdateId: Command {
    override fun execute(str: String) {
        val answerToUser: AnswerToUser = AnswerToUser()

        var checkId = str.toLong()

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())
        val add: Add = Add()

        if (collection.size == 0){
            answerToUser.writeToConsoleLn("Коллекция пуста")
        }else if(collection.size == 1){
            workWithCollection.getCollection().clear()
            if (collection.peek().id == checkId){
                add.execute(checkId.toString())
            }else{
                answerToUser.writeToConsoleLn("Нет элемента с таким айди")
                workWithCollection.getCollection().add(collection.peek())
            }
        }else{
            workWithCollection.getCollection().clear()
            for (i in 0..collection.size - 1){
                if (collection.peek().id == checkId){
                    add.execute(checkId.toString())
                    collection.poll()
                }else{
                    workWithCollection.getCollection().add(collection.peek())
                    collection.poll()
                }
            }
        }


    }
}