package workCommandsList

import commandsHelpers.ResultModule

/**
 * Class Info. Shows information about a commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Info: Command() {
    override fun execute(str: List<Any>): ResultModule {


        val collection = workWithCollection.getCollection()

        workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("typeCollection").toString() + collection.javaClass.toString())
        workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("sizeCollection").toString() + collection.size.toString())
        workWithResultModule.setMessages(consoleWriter.returnKeyVlaue("dataCollection").toString() + workWithCollection.getInitDate().toString())

        return workWithResultModule.getResultModule()
    }
}