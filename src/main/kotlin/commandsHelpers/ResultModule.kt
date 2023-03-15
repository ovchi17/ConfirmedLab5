package commandsHelpers

/**
 * Data Class ResultModule. Contains results messages
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
data class ResultModule (
    var msgToPrint:MutableList<String>,
    var status: Status,
    var errorDescription: String?
)

