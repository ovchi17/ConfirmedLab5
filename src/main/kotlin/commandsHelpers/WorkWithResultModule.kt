package commandsHelpers

/**
 * Class WorkWithResultModule. Contains function to work with returned result, also contains ResultModule object
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class WorkWithResultModule {
    var result: ResultModule = ResultModule(mutableListOf(), Status.SUCCESS, null)

    /**
     * getMessages method. Return messages from commands
     *
     * @return message as List<String>
     */
    fun getMessages(): List<String>{
        return result.msgToPrint
    }

    /**
     * setMessages method. Set messages from commands
     *
     * @param messages
     */
    fun setMessages(messages: String) {
        result.msgToPrint.add(messages)
    }

    /**
     * getStatus method. Return Status from commands
     *
     * @return message as Status
     */
    fun getStatus(): Status{
        return result.status
    }

    /**
     * setStatus method. Set Status from commands
     *
     * @param status
     */
    fun setStatus(status: Status){
        result.status = status
    }

    /**
     * SetError method. Set errors from commands
     *
     * @param error
     */
    fun setError(error: String){
        result.errorDescription = error
    }

    /**
     * getError method. Return errors from commands
     *
     * @return message as String
     */
    fun getError(): String?{
        return result.errorDescription
    }

    /**
     * getResultModule method. Returns the result module
     *
     * @return message as ResultModule
     */
    fun getResultModule(): ResultModule{
        return result
    }
}