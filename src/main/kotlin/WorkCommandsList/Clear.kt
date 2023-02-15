package WorkCommandsList

import Controllers.*
import UsersView.AnswerToUser

class Clear: Command {
    override fun execute(str: String) {

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val answerToUser: AnswerToUser = AnswerToUser()

        workWithCollection.clearCollection()
        answerToUser.writeToConsoleLn("Коллекция успешно отчищена!")

    }
}