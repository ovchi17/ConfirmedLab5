package workCommandsList

import commandsHelpers.ResultModule

/**
 * Class History. Shows the history of commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class History: Command() {

    /**
     * execute method. Returns history
     *
     * @return info from command as ResultModule
     */
    override fun execute(): ResultModule {

        val collection = workWithCollection.getHistory()
        workWithResultModule.setMessages("historyOfCommands")
        var resultString = ""
        for (i in 0..collection.size - 1){
            resultString = resultString + collection[i] + " "
        }
        workWithResultModule.setMessages(resultString)

        return workWithResultModule.getResultModule()
    }
}