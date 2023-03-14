package workCommandsList

import commandsHelpers.ResultModule

/**
 * Class History. Shows the history of commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class History: Command() {
    override fun execute(): ResultModule {


        val collection = workWithCollection.getHistory()
        workWithResultModule.setMessages("historyOfCommands")
        var resultString: String = ""
        for (i in 0..collection.size - 1){
            resultString = resultString + collection[i] + " "
        }
        workWithResultModule.setMessages(resultString)

        return workWithResultModule.getResultModule()
    }
}