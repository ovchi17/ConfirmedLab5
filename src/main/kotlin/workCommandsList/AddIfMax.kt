package workCommandsList

import controllers.WorkWithCollection
import dataSet.Coordinates
import dataSet.Location
import dataSet.Route
import dataSet.RouteComporator
import usersView.ConsoleWriter
import java.time.LocalDate
import java.util.*

class AddIfMax: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val addSet: AddInfoGetter = AddInfoGetter()
        val consoleWriter: ConsoleWriter = ConsoleWriter()

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        workWithCollection.idManager++
        var id: Long = workWithCollection.idManager
        var name: String
        var coordinates: Coordinates
        var creationDate: LocalDate = LocalDate.now()
        var from: Location
        var to: Location
        var distance: Long

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

        if (collection.size == 0){
            workWithCollection.addElementToCollection(routeToAdd)
            consoleWriter.printToConsoleLn("success")
        }else if(collection.size == 1){
            if (distance > collection.peek().distance){
                workWithCollection.addElementToCollection(routeToAdd)
                consoleWriter.printToConsoleLn("success")
            }else{
                consoleWriter.printToConsoleLn("noSuccess")
            }
        }else{
            var intSr: Int = 0
            for (i in 0..collection.size - 1){
                if (distance > collection.peek().distance) {
                    intSr += 1
                }
            }
            if (intSr == collection.size){
                workWithCollection.addElementToCollection(routeToAdd)
                consoleWriter.printToConsoleLn("success")
            }else{
                consoleWriter.printToConsoleLn("noSuccess")
            }
        }
    }
}