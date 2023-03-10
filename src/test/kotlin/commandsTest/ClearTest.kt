package commandsTest

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import workCommandsList.Add
import workCommandsList.Clear
import java.util.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class clearTest {

    @Test
    fun `Test clear functionality`() {

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val check = PriorityQueue<Route>(RouteComporator())
        val add: Add = Add()
        var sendList = mutableListOf<Any>()
        sendList.add(1.toLong())
        sendList.add("Egor 2 2 2 2 2 2 2 2 2")
        add.execute(sendList, workWithCollection)
        val clear: Clear = Clear()
        clear.execute(sendList, workWithCollection)

        println(check.size)
        println(workWithCollection.getCollection().size)
        assertEquals(check.size, workWithCollection.getCollection().size)
    }

}