package WorkCommandsList

import UsersView.AnswerToUser
import kotlin.system.exitProcess

class Exit: Command{
    override fun execute(str: String) {
        val answerToUser: AnswerToUser = AnswerToUser()
        answerToUser.writeToConsoleLn("Завершение программы.")
        exitProcess(0)
    }
}