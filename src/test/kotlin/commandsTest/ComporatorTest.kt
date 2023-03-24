package commandsTest

import controllers.CollectionMainCommands
import controllers.Parametrs
import controllers.WorkWithCollection
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

internal class ComporatorTest: KoinComponent {

    @Test
    fun `Test comporator functionality`() {

        startKoin {
            modules(koinModule)
        }

        val parametrs: Parametrs by inject()
        val workWithCollection: CollectionMainCommands by inject()

        val add: Add = Add()
        var sendList = mutableListOf<Any>()
        sendList.add(1.toLong())
        sendList.add("Egor 2 2 2 2 2 2 2 2 2")
        parametrs.setParametrs(sendList)
        add.execute()
        var sendList2 = mutableListOf<Any>()
        sendList2.add(1.toLong())
        sendList2.add("Oleg 2 2 2 2 2 2 2 2 2")
        parametrs.setParametrs(sendList2)
        add.execute()

        assertEquals(workWithCollection.pollCollection()!!.id, workWithCollection.peekCollection()!!.id + 1)
    }

}