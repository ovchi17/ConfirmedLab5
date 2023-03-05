package workCommandsList

import controllers.WorkWithCollection
import dataSet.*
import usersView.AnswerToUser
import usersView.ConsoleWriter
import java.time.LocalDate


class Add: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val addSet: AddInfoGetter = AddInfoGetter()
        val consoleWriter: ConsoleWriter = ConsoleWriter()
        var parametrs: MutableList<String> = mutableListOf("noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo")

        workWithCollection.idManager++
        var id: Long = workWithCollection.idManager
        var name: String
        var coordinates: Coordinates
        var creationDate: LocalDate = LocalDate.now()
        var from: Location
        var to: Location
        var distance: Long
        var stopper: Long = 1

        if (str[0] != stopper){
            id = str[0] as Long
        }

        if (str.size > 1){
            val getParams = (str[1] as String).split(" ")
            parametrs[0] = getParams[0]
            parametrs[1] = getParams[1]
            parametrs[2] = getParams[2]
            parametrs[3] = getParams[3]
            parametrs[4] = getParams[4]
            parametrs[5] = getParams[5]
            parametrs[6] = getParams[6]
            parametrs[7] = getParams[7]
            parametrs[8] = getParams[8]
            parametrs[9] = getParams[9]
        }

        name = addSet.name(parametrs[0])
        val coord1: Long = addSet.coord1(parametrs[1])
        val coord2: Long = addSet.coord2(parametrs[2])
        val location1: Long = addSet.location1(parametrs[3])
        val location2: Long = addSet.location2(parametrs[4])
        val location3: Int = addSet.location3(parametrs[5])
        val location1_2: Long = addSet.location12(parametrs[6])
        val location2_2: Long = addSet.location22(parametrs[7])
        val location3_2: Int = addSet.location32(parametrs[8])
        distance = addSet.distance(parametrs[9])

        coordinates = Coordinates(coord1, coord2)
        to = Location(location1, location2, location3)
        from = Location(location1_2, location2_2, location3_2)

        val routeToAdd: Route = Route(id, name, coordinates, creationDate, from, to, distance)

        workWithCollection.addElementToCollection(routeToAdd)

        consoleWriter.printToConsoleLn("success")
    }
}