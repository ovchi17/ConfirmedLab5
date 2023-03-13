package workCommandsList

import controllers.Serializer
import controllers.WorkWithCollection
import controllers.WorkWithFile
import dataSet.Route
import dataSet.RouteComporator
import kotlinx.serialization.json.Json
import usersView.ConsoleWriter
import java.io.FileReader
import java.util.PriorityQueue

/**
 * Class Save. Save to file in JSON format.
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class Save: Command() {
     private var pathToFile: String = System.getenv("DataOfCollection")
     private var fileReader: FileReader = FileReader(pathToFile)
     override fun execute(str: List<Any>) {
         val workWithFile: WorkWithFile = WorkWithFile()
         val serializer: Serializer = Serializer()
         val collection = PriorityQueue<Route>(RouteComporator())
         collection.addAll(workWithCollection.getCollection())
         val list = workWithCollection.collectionToList(collection)
         val jsonString = serializer.serialize(list)
         workWithFile.writeToFile(collection, pathToFile, jsonString)
         consoleWriter.printToConsoleLn("saved")
     }
}