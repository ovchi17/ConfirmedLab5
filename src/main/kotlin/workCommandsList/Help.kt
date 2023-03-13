package workCommandsList

import commandsHelpers.ResultModule

/**
 * Class Help. Shows all commands.
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Help: Command() {
    override fun execute(str: List<Any>): ResultModule {

        workWithResultModule.setMessages("***")

        workWithResultModule.setMessages("helpHelp")
        workWithResultModule.setMessages("helpInfo")
        workWithResultModule.setMessages("helpShow")
        workWithResultModule.setMessages("helpAdd")
        workWithResultModule.setMessages("helpUpdate")
        workWithResultModule.setMessages("helpRemove")
        workWithResultModule.setMessages("helpClear")
        workWithResultModule.setMessages("helpSave")
        workWithResultModule.setMessages("helpExecute")
        workWithResultModule.setMessages("helpExit")
        workWithResultModule.setMessages("helpRemoveFirst")
        workWithResultModule.setMessages("helpAddIfMax")
        workWithResultModule.setMessages("helpHistory")
        workWithResultModule.setMessages("helpRemoveAllByDistance")
        workWithResultModule.setMessages("helpAverageOfDistance")
        workWithResultModule.setMessages("helpFilterLessThanDistance")

        workWithResultModule.setMessages("***")

        return workWithResultModule.getResultModule()
    }
}