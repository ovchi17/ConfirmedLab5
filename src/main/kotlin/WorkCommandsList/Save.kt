package WorkCommandsList

import Controllers.WorkWithCollection
import DataSet.Coordinates
import DataSet.Route
import DataSet.RouteComporator
import UsersView.AnswerToUser
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import serialize.SerializeManager
import java.io.File
import java.io.FileReader
import java.io.PrintWriter
import java.nio.file.Path
import java.util.*

//@Serializable
class Save: Command {

    private val workWithCollection: WorkWithCollection = WorkWithCollection()
    val answerToUser: AnswerToUser = AnswerToUser()

    private var pathToFile: String = "src/main/kotlin/DataSet/DataOfCollection.json"

    private var fileReader: FileReader = FileReader(pathToFile)
    private var copyPriorityQueue: PriorityQueue<Route> = workWithCollection.getCollection()

    fun tagsCompilations (rawString: String): String {

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        fileReader.read()
        var string: String = rawString
        val elements = copyPriorityQueue.toList()
        for (element in elements) {
            string += "\t \"element\": {\n"
            string += "\t\t \"id\" : \"${element.id}\", \n" +
                    "\t\t \"name\" : \"${element.name}\", \n" +
                    "\t\t \"coordinates\" : \"${element.coordinates}\", \n" +
                    "\t\t \"creationDate\" : \"${element.creationDate}\", \n" +
                    "\t\t \"from\" : \"${element.from}\", \n" +
                    "\t\t \"to\" : \"${element.to}\", \n" +
                    "\t\t \"distance\" : \"${element.distance}\" \n" +
                    "\t } \n"
        }
        return string
    }
    override fun execute(str: String) {

        var tags: String = ""
        val tagsStart: String = "{\n"
        val tagsEnd: String = "}"

        if (copyPriorityQueue.isNotEmpty()) {
            tags += tagsCompilations(tagsStart+tags)
            tags += tagsEnd
            File(pathToFile).writeText(tags)
        } else {
            File(pathToFile).writeText("")
        }
    }
}