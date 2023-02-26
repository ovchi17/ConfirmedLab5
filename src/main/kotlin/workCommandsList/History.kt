package workCommandsList

import controllers.WorkWithCollection
import usersView.AnswerToUser

class History: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {
        val answerToUser: AnswerToUser = AnswerToUser()

        val collection = workWithCollection.getHistory()
        answerToUser.writeToConsoleLn("История команд: ")
        for (i in 0..collection.size - 1){
            answerToUser.writeToConsole(collection[i] + " ")
        }
        answerToUser.writeToConsoleLn("")
    }
}