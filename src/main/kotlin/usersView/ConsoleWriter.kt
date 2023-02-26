package usersView

class ConsoleWriter {
    var typeMessages: TypeMessages = TypeMessages()
    var answerToUser: AnswerToUser = AnswerToUser()

    fun printToConsoleLn(printKey: String){
        answerToUser.writeToConsoleLn(typeMessages.msgToPrint(printKey))
    }

    fun printToConsole(printKey: String){
        answerToUser.writeToConsole(typeMessages.msgToPrint(printKey))

    }
}