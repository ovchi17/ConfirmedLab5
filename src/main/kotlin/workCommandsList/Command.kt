package workCommandsList

import controllers.CollectionMainCommands
import controllers.Tokenizator
import controllers.WorkWithCollection
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import usersView.ConsoleWriter

/**
 * Interface Command.
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
abstract class Command: KoinComponent {

    /**
     * execute method. Using in all workCommandsList
     *
     * @param str: List<Any>
     * @param wrk: WorkWithCollection
     */

    val workWithCollection: CollectionMainCommands by inject()
    val consoleWriter: ConsoleWriter by inject()
    val tokenizator: Tokenizator by inject()
    abstract fun execute(str: List<Any>)

}