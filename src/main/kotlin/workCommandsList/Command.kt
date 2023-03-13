package workCommandsList

import commandsHelpers.AddSet
import controllers.*
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
     */

    val workWithCollection: CollectionMainCommands by inject()
    val consoleWriter: ConsoleWriter by inject()
    val tokenizator: Tokenizator by inject()
    val addSet: AddSet by inject()
    val workWithFile: WorkWithFile by inject()
    val serializer: Serializer by inject()
    abstract fun execute(str: List<Any>)

}