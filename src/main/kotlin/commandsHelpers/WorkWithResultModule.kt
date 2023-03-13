package commandsHelpers

class WorkWithResultModule {
    var result: ResultModule = ResultModule(mutableListOf(), Status.SUCCESS, null)

    fun getMessages(): List<String>{
        return result.msgToPrint
    }

    fun setMessages(messages: String) {
        result.msgToPrint.add(messages)
    }

    fun getStatus(): Status{
        return result.status
    }

    fun setStatus(status: Status){
        result.status = status
    }

    fun setError(error: String){
        result.errorDescription = error
    }

    fun getError(): String?{
        return result.errorDescription
    }

    fun getResultModule(): ResultModule{
        return result
    }
}