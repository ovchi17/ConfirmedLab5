package workCommandsList

import controllers.*
import usersView.AnswerToUser

class Clear: Command {
    override fun execute(str: String, workWithCollection: WorkWithCollection) {

        val answerToUser: AnswerToUser = AnswerToUser()

        workWithCollection.clearCollection()
        answerToUser.writeToConsoleLn("Коллекция успешно отчищена!")

    }
}