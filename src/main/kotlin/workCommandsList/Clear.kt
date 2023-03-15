package workCommandsList

import commandsHelpers.ResultModule

/**
 * Class Clear. Remove all objects from the collection
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Clear: Command() {

    /**
     * execute method. Clear collection
     *
     * @return info from command as ResultModule
     */
    override fun execute(): ResultModule {

        workWithCollection.clearCollection()

        workWithResultModule.setMessages("cleared")

        return workWithResultModule.getResultModule()
    }
}