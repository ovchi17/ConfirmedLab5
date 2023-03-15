package workCommandsList

import commandsHelpers.ResultModule

/**
 * Class Info. Shows information about a commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Info: Command() {

    /**
     * execute method. Returns info about collection
     *
     * @return info from command as ResultModule
     */
    override fun execute(): ResultModule {

        val collection = workWithCollection.getCollection()

        workWithResultModule.setMessages(consoleWriter.returnKeyValue("typeCollection").toString() + collection.javaClass.toString())
        workWithResultModule.setMessages(consoleWriter.returnKeyValue("sizeCollection").toString() + collection.size.toString())
        workWithResultModule.setMessages(consoleWriter.returnKeyValue("dataCollection").toString() + workWithCollection.getInitDate().toString())

        return workWithResultModule.getResultModule()
    }
}