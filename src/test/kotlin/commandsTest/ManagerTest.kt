package commandsTest

import controllers.Tokenizator
import controllers.WorkWithCollection
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import workCommandsList.Info

class ManagerTest {
    @Test
    fun `Get existing command`() {
        val tokenizator = mockk<Tokenizator>(relaxed = true)
        val workWithCollection = WorkWithCollection()
        val sendList = mutableListOf<Any>()

        val command = "info"
        val expectedCommand = Info()

        val realCommand = tokenizator.getCommand(command)

        if (realCommand != null) {
            assertEquals(expectedCommand.javaClass, realCommand.javaClass)
        }
    }

}