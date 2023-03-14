package workCommandsList

import commandsHelpers.ResultModule
import dataSet.Coordinates
import dataSet.Location
import dataSet.Route
import dataSet.RouteComporator
import java.time.LocalDate
import java.util.*

/**
 * Class AddIfMax. Adds a new object to the collection if Distance parameter is greater than the others.
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class AddIfMax: Command() {
    override fun execute(): ResultModule {

        val parametrsList: MutableList<String?> = mutableListOf("noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo", "noInfo")
        val str = parametrs.getParametrs()

        if (str.size > 1){
            val getParams = (str[1] as String).split(" ")
            parametrsList[0] = getParams[0]
            parametrsList[1] = getParams[1]
            parametrsList[2] = getParams[2]
            parametrsList[3] = getParams[3]
            parametrsList[4] = getParams[4]
            parametrsList[5] = getParams[5]
            parametrsList[6] = getParams[6]
            parametrsList[7] = getParams[7]
            parametrsList[8] = getParams[8]
            parametrsList[9] = getParams[9]
        }

        val collection = PriorityQueue<Route>(RouteComporator())
        collection.addAll(workWithCollection.getCollection())

        workWithCollection.idPlusOne()
        val id: Long = workWithCollection.getId()
        val name: String
        val coordinates: Coordinates
        val creationDate: LocalDate = LocalDate.now()
        val from: Location
        val to: Location
        val distance: Long

        name = addSet.name(parametrsList[0])
        val coord1: Long? = addSet.coord1(parametrsList[1])
        val coord2: Long = addSet.coord2(parametrsList[2])
        val location1: Long? = addSet.location1(parametrsList[3])
        val location2: Long = addSet.location2(parametrsList[4])
        val location3: Int = addSet.location3(parametrsList[5])
        val location1_2: Long? = addSet.location12(parametrsList[6])
        val location2_2: Long = addSet.location22(parametrsList[7])
        val location3_2: Int = addSet.location32(parametrsList[8])
        distance = addSet.distance(parametrsList[9])

        coordinates = Coordinates(coord1, coord2)
        to = Location(location1, location2, location3)
        from = Location(location1_2, location2_2, location3_2)

        val routeToAdd: Route =  Route(id,
            name = name,
            coordinates = coordinates,
            creationDate = creationDate,
            from = from,
            to = to,
            distance = distance)

        if (collection.size == 0){
            workWithCollection.addElementToCollection(routeToAdd)
            workWithResultModule.setMessages("success")
        }else if(collection.size == 1){
            if (distance > collection.peek().distance){
                workWithCollection.addElementToCollection(routeToAdd)
                workWithResultModule.setMessages("success")
            }else{
                workWithResultModule.setMessages("noSuccess")
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
                workWithResultModule.setMessages("success")
            }else{
                workWithResultModule.setMessages("noSuccess")
            }
        }
        return workWithResultModule.getResultModule()
    }
}