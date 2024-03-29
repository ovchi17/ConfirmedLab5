package workCommandsList

import commandsHelpers.ResultModule
import dataSet.Route
import dataSet.RouteComporator
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

    /**
     * execute method. Save collection to file
     *
     * @return info from command as ResultModule
     */
    override fun execute(): ResultModule {
         val collection = PriorityQueue<Route>(RouteComporator())
         collection.addAll(workWithCollection.getCollection())
         val list = workWithCollection.collectionToList()
         val jsonString = serializer.serialize(list)
         workWithFile.writeToFile(collection, pathToFile, jsonString)
         workWithResultModule.setMessages("saved")

         return workWithResultModule.getResultModule()
     }
}