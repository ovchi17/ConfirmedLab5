package commandsHelpers

data class ResultModule (
    var msgToPrint:MutableList<String>,
    var status: Status,
    var errorDescription: String?
)

