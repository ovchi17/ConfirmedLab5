package commandsTest

import controllers.CollectionMainCommands
import controllers.Parametrs
import dataSet.Route
import dataSet.RouteComporator
import di.koinModule
import workCommandsList.Add
import workCommandsList.Clear
import java.util.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

internal class clearTest: KoinComponent {

    @Test
    fun `Test clear functionality`() {

        startKoin {
            modules(koinModule)
        }

        val parametrs: Parametrs by inject()
        val workWithCollection: CollectionMainCommands by inject()

        val check = PriorityQueue<Route>(RouteComporator())
        val add: Add = Add()
        var sendList = mutableListOf<Any>()
        sendList.add(1.toLong())
        sendList.add("Egor 2 2 2 2 2 2 2 2 2")
        parametrs.setParametrs(sendList)
        add.execute()
        val clear: Clear = Clear()
        clear.execute()

        assertEquals(check.size, workWithCollection.getCollection().size)
    }

}