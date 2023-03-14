package workCommandsList

import commandsHelpers.ResultModule
import kotlin.system.exitProcess

/**
 * Class Exit. Stop the program.
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Exit: Command(){
    override fun execute(): ResultModule {
        workWithResultModule.setMessages("end")
        exitProcess(0)
    }
}