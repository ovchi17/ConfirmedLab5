package commandsTest

import controllers.WorkWithCollection
import dataSet.Coordinates
import dataSet.Location
import dataSet.Route
import dataSet.RouteComporator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import workCommandsList.Add
import java.time.LocalDate
import java.util.*

internal class FormattingTest {

    @Test
    fun `Test formatting functionality`() {

        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val collection: PriorityQueue<Route> = PriorityQueue(RouteComporator())
        val add: Add = Add()
        val sendList = mutableListOf<Any>()
        val coordinates: Coordinates = Coordinates(2,2)
        val location1: Location = Location(2,2,2)
        val location2: Location = Location(2,2,2)
        val routeToAdd: Route = Route(3, "Oleg", coordinates, LocalDate.now(), location1, location2, 2)
        workWithCollection.addElementToCollection(routeToAdd)
        collection.addAll(workWithCollection.getCollection())
        val list = workWithCollection.collectionToList(collection)
        workWithCollection.listToCollection(list)
        sendList.add(1.toLong())
        var sendList2 = mutableListOf<Any>()
        sendList2.add(1.toLong())
        sendList2.add("Oleg 2 2 2 2 2 2 2 2 2")
        add.execute(sendList2, workWithCollection)

        Assertions.assertEquals(workWithCollection.getCollection().poll().id, workWithCollection.getCollection().peek().id+1)
    }

}