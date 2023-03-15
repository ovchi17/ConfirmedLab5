package usersView

/**
 * ConsoleWriter class
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class ConsoleWriter {
    var typeMessages: TypeMessages = TypeMessages()
    var answerToUser: AnswerToUser = AnswerToUser()

    /**
     * writeToConsoleLn method. Println text using printKey
     *
     * @param printKey String
     */
    fun printToConsoleLn(printKey: String){
        answerToUser.writeToConsoleLn(typeMessages.msgToPrint(printKey))
    }

    /**
     * writeToConsole method. Print text using printKey
     *
     * @param printKey String
     */
    fun printToConsole(printKey: String){
        answerToUser.writeToConsole(typeMessages.msgToPrint(printKey))

    }

    /**
     * returnKeyValue method
     *
     * @param printKey
     * @return message as String
     */
    fun returnKeyValue(printKey: String): String?{
        return typeMessages.msgToPrint(printKey)
    }
}