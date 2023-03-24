package commandsTest

import controllers.CollectionMainCommands
import controllers.Parametrs
import controllers.WorkWithCollection
import dataSet.Coordinates
import dataSet.Location
import dataSet.Route
import dataSet.RouteComporator
import di.koinModule
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import workCommandsList.Add
import java.time.LocalDate
import java.util.*

internal class FormattingTest: KoinComponent {
    @Test
    fun `Test formatting functionality`() {

        startKoin {
            modules(koinModule)
        }

        val parametrs: Parametrs by inject()
        val workWithCollection: CollectionMainCommands by inject()
        val collection: PriorityQueue<Route> = PriorityQueue(RouteComporator())
        val add: Add = Add()
        val sendList = mutableListOf<Any>()
        val sendList2 = mutableListOf<Any>()
        val coordinates: Coordinates = Coordinates(2,2)
        val location1: Location = Location(2,2,2)
        val location2: Location = Location(2,2,2)
        val routeToAdd: Route = Route(2, "Oleg", LocalDate.now(), location1, location2, 2, coordinates)
        workWithCollection.addAllElementToCollection(collection)
        val list = workWithCollection.collectionToList()
        workWithCollection.listToCollection(list)
        sendList.add(1.toLong())
        sendList.add("Oleg 2 2 2 2 2 2 2 2 2")
        parametrs.setParametrs(sendList)
        add.execute()
        sendList2.add(1.toLong())
        sendList2.add("Oleg 2 2 2 2 2 2 2 2 2")
        parametrs.setParametrs(sendList2)
        add.execute()

        Assertions.assertEquals(workWithCollection.pollCollection()!!.id, workWithCollection.peekCollection()!!.id+1)
    }
}