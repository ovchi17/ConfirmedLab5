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

        name = addSet.name()
        val coord1: Long = addSet.coord1()
        val coord2: Long = addSet.coord2()
        val location1: Long = addSet.location1()
        val location2: Long = addSet.location2()
        val location3: Int = addSet.location3()
        val location1_2: Long = addSet.location12()
        val location2_2: Long = addSet.location22()
        val location3_2: Int = addSet.location32()
        distance = addSet.distance()

        coordinates = Coordinates(coord1, coord2)
        to = Location(location1, location2, location3)
        from = Location(location1_2, location2_2, location3_2)

        val routeToAdd: Route = Route(id, name, coordinates, creationDate, from, to, distance)

        workWithCollection.addElementToCollection(routeToAdd)

        consoleWriter.printToConsoleLn("success")
    }
}