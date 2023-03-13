package workCommandsList

import kotlin.system.exitProcess

/**
 * Class Exit. Stop the program.
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Exit: Command(){
    override fun execute(str: List<Any>) {
        consoleWriter.printToConsoleLn("end")
        exitProcess(0)
    }
}