package workCommandsList

import controllers.WorkWithCollection

/**
 * Interface Command.
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
interface Command {

    /**
     * execute method. Using in all workCommandsList
     *
     * @param str: List<Any>
     * @param wrk: WorkWithCollection
     */
    fun execute(str: List<Any>, wrk: WorkWithCollection)

}