package commandsTest

import controllers.Serializer
import controllers.WorkWithCollection
import controllers.WorkWithFile
import dataSet.Route
import dataSet.RouteComporator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import workCommandsList.ExecuteScript
import java.util.PriorityQueue

internal class SaveTest {

    @Test
    fun `Test Save functionality`(){
        val workWithCollection: WorkWithCollection = WorkWithCollection()
        val collection: PriorityQueue<Route> = PriorityQueue(RouteComporator())
        val executeScript: ExecuteScript = ExecuteScript()
        val serializer: Serializer = Serializer()
        val string1: String
        val string2: String = "[{\"id\":2,\"coordinates\":{\"x\":3,\"y\":3},\"name\":\"AAA\",\"from\":{\"y\":3,\"x\":3,\"z\":3},\"to\":{\"y\":3,\"x\":3,\"z\":3},\"distance\":3}]"
        val sendList = mutableListOf<Any>()
        sendList.add("ex.txt")
        executeScript.execute(sendList, workWithCollection)
        collection.addAll(workWithCollection.getCollection())
        val list = workWithCollection.collectionToList(collection)
        string1 = serializer.serialize(list)
        Assertions.assertEquals(string1, string2)
    }

}