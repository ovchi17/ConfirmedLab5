package commandsTest

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import di.koinModule
import workCommandsList.Add
import workCommandsList.Clear
import java.util.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.koin.core.context.startKoin
import usersView.ConsoleWriter
import usersView.TypeMessages
import workCommandsList.RemoveById

internal class TypeMessagesTest {

    @Test
    fun `Check, correct of String getting by key for users`() {
        val typeMessages: TypeMessages = TypeMessages()
        val getString = typeMessages.msgToPrint("success")

        assertEquals("Успешно! ", getString)
    }

}