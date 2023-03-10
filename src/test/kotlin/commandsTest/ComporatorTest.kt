package commandsTest

import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import workCommandsList.Add
import workCommandsList.Clear
import java.util.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ComporatorTest {

    @Test
    fun `Test comporator functionality`() {

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val add: Add = Add()
        var sendList = mutableListOf<Any>()
        sendList.add(1.toLong())
        sendList.add("Egor 2 2 2 2 2 2 2 2 2")
        var sendList2 = mutableListOf<Any>()
        sendList2.add(1.toLong())
        sendList2.add("Oleg 2 2 2 2 2 2 2 2 2")
        add.execute(sendList, workWithCollection)
        add.execute(sendList2, workWithCollection)

        assertEquals(workWithCollection.getCollection().poll().id, workWithCollection.getCollection().peek().id + 1)
    }

}