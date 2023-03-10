package commandsTest

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import usersView.TypeMessages

internal class TypeMessagesTest {

    @Test
    fun `Check, correct of String getting by key for users`() {

        val typeMessages: TypeMessages = TypeMessages()
        val getString = typeMessages.msgToPrint("success")

        assertEquals("Успешно! ", getString)
    }

}