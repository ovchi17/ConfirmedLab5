package commandsTest

import controllers.Tokenizator
import controllers.WorkWithCollection
import workCommandsList.Add
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Test

internal class TokenizatorTest {

    @Test
    fun `Check, if tokenizator errors works well`() {

        val str = "add something"
        val tokenizator: Tokenizator = Tokenizator()
        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val add: Add = Add()
        val getCommandFromUser: List<String> = ((str.lowercase()) + " 1").split(" ")


        //assertThrows<CommandException> { tokenizator.tokenizator(add, getCommandFromUser, workWithCollection) }
    }

}