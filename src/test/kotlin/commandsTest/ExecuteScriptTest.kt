package commandsTest

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import workCommandsList.Add
import workCommandsList.ExecuteScript
import workCommandsList.Show
import java.util.*

internal class ExecuteScriptTest {

    @Test
    fun `Test ExecuteScript functionality`() {

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val workWithCollection2: WorkWithCollection = WorkWithCollection()
        val executeScript: ExecuteScript = ExecuteScript()
        val sendList = mutableListOf<Any>()
        sendList.add("ex.txt")
        executeScript.execute(sendList, workWithCollection)
        val sendList2 = mutableListOf<Any>()
        val add: Add = Add()
        sendList2.add(1.toLong())
        sendList2.add("AAA 3 3 3 3 3 3 3 3 3")
        add.execute(sendList2, workWithCollection2)
        val show: Show = Show()

        Assertions.assertEquals(show.execute(sendList, workWithCollection), show.execute(sendList2, workWithCollection2))
    }

    @Test
    fun `Test ExecuteScript recursion`(){
        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val executeScript: ExecuteScript = ExecuteScript()
        val sendList = mutableListOf<Any>()
        sendList.add("ex2.txt")

        val thrown: StackOverflowError = Assertions.assertThrows(
            StackOverflowError::class.java,
            Executable {executeScript.execute(sendList, workWithCollection)})

        val exception = StackOverflowError()
        assertEquals("recursion!", exception)
    }

    @Test
    fun `Test of correctness of ExecuteScript`() {

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val workWithCollection2: WorkWithCollection = WorkWithCollection()
        val collection2: PriorityQueue<Route> = PriorityQueue(RouteComporator())
        val collection: PriorityQueue<Route> = PriorityQueue(RouteComporator())

        val add: Add = Add()
        val sendList2 = mutableListOf<Any>()
        sendList2.add(1.toLong())
        sendList2.add("AAA 3 3 3 3 3 3 3 3 3")
        add.execute(sendList2, workWithCollection2)
        collection2.addAll(workWithCollection2.getCollection())
        val list2 = workWithCollection2.collectionToList(collection2)

        val executeScript: ExecuteScript = ExecuteScript()
        val sendList = mutableListOf<Any>()
        sendList.add("ex.txt")
        executeScript.execute(sendList, workWithCollection)
        collection.addAll(workWithCollection.getCollection())
        val list = workWithCollection.collectionToList(collection)

        Assertions.assertEquals(list2[0].id, list[0].id)
        Assertions.assertEquals(list2[0].name, list[0].name)
        Assertions.assertEquals(list2[0].creationDate, list[0].creationDate)
        Assertions.assertEquals(list2[0].distance, list[0].distance)

    }

}