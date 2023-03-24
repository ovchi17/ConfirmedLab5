package commandsTest

import controllers.CollectionMainCommands
import controllers.CommandException
import controllers.Parametrs
import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import di.koinModule
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import workCommandsList.Add
import workCommandsList.ExecuteScript
import workCommandsList.Show
import java.util.*
import kotlin.test.assertFailsWith

internal class ExecuteScriptTest: KoinComponent {

    @Test
    fun `Test ExecuteScript functionality`() {

        startKoin {
            modules(koinModule)
        }

        val parametrs: Parametrs by inject()
        val workWithCollection: CollectionMainCommands by inject()

        val executeScript: ExecuteScript = ExecuteScript()
        val sendList = mutableListOf<Any>()
        sendList.add("ex.txt")
        parametrs.setParametrs(sendList)
        executeScript.execute()
        val sendList2 = mutableListOf<Any>()
        val add: Add = Add()
        sendList2.add(1.toLong())
        sendList2.add("AAA 3 3 3 3 3 3 3 3 3")
        parametrs.setParametrs(sendList2)
        add.execute()
        val show: Show = Show()

        Assertions.assertEquals(show.execute(), show.execute())
    }

    @Test
    fun `Test ExecuteScript recursion`(){

        startKoin {
            modules(koinModule)
        }

        val parametrs: Parametrs by inject()
        val workWithCollection: CollectionMainCommands by inject()

        val executeScript: ExecuteScript = ExecuteScript()
        val sendList = mutableListOf<Any>()
        sendList.add("ex2.txt")
        parametrs.setParametrs(sendList)

        assertFailsWith<CommandException> {
            executeScript.execute()
        }

    }

    @Test
    fun `Test of correctness of ExecuteScript`() {

        startKoin {
            modules(koinModule)
        }

        val parametrs: Parametrs by inject()
        val workWithCollection: CollectionMainCommands by inject()

        val collection2: PriorityQueue<Route> = PriorityQueue(RouteComporator())
        val collection: PriorityQueue<Route> = PriorityQueue(RouteComporator())

        val add: Add = Add()
        val sendList2 = mutableListOf<Any>()
        sendList2.add(1.toLong())
        sendList2.add("AAA 3 3 3 3 3 3 3 3 3")
        parametrs.setParametrs(sendList2)
        add.execute()
        collection2.addAll(workWithCollection.getCollection())
        val list2 = workWithCollection.collectionToList()

        val executeScript: ExecuteScript = ExecuteScript()
        val sendList = mutableListOf<Any>()
        sendList.add("ex.txt")
        parametrs.setParametrs(sendList)
        executeScript.execute()
        collection.addAll(workWithCollection.getCollection())
        val list = workWithCollection.collectionToList()

        Assertions.assertEquals(list2[0].id, list[0].id)
        Assertions.assertEquals(list2[0].name, list[0].name)
        Assertions.assertEquals(list2[0].creationDate, list[0].creationDate)
        Assertions.assertEquals(list2[0].distance, list[0].distance)

    }

}