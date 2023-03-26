package commandsTest

import controllers.CollectionMainCommands
import controllers.Parametrs
import controllers.Serializer
import controllers.WorkWithCollection
import dataSet.Route
import dataSet.RouteComporator
import di.koinModule
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import workCommandsList.ExecuteScript
import java.util.PriorityQueue

internal class SaveTest: KoinComponent {

    @Test
    fun `Test Save functionality`(){

        startKoin {
            modules(koinModule)
        }

        val parametrs: Parametrs by inject()
        val workWithCollection: CollectionMainCommands by inject()

        val collection: PriorityQueue<Route> = PriorityQueue(RouteComporator())
        val executeScript: ExecuteScript = ExecuteScript()
        val serializer: Serializer = Serializer()
        val string1: String
        val string2: String = "[{\"id\":2,\"name\":\"AAA\",\"creationDate\":\"2023-03-26\",\"from\":{\"y\":3,\"x\":3,\"z\":3},\"to\":{\"y\":3,\"x\":3,\"z\":3},\"distance\":3,\"coordinates\":{\"x\":3,\"y\":3}}]"
        val sendList = mutableListOf<Any>()
        sendList.add("ex.txt")
        parametrs.setParametrs(sendList)
        executeScript.execute()
        string1 = serializer.serialize(workWithCollection.collectionToList())
        Assertions.assertEquals(string1, string2)
    }

}