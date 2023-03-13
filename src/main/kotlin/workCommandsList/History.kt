package workCommandsList

/**
 * Class History. Shows the history of commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class History: Command() {
    override fun execute(str: List<Any>) {


        val collection = workWithCollection.getHistory()
        consoleWriter.printToConsoleLn("historyOfCommands")
        for (i in 0..collection.size - 1){
            //answerToUser.writeToConsole(collection[i] + " ")
        }
        //answerToUser.writeToConsoleLn("")
    }
}