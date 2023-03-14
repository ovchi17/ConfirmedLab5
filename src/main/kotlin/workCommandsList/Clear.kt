package workCommandsList

import commandsHelpers.ResultModule

/**
 * Class Clear. Remove all objects from the collection
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Clear: Command() {
    override fun execute(): ResultModule {

        workWithCollection.clearCollection()

        workWithResultModule.setMessages("cleared")

        return workWithResultModule.getResultModule()
    }
}