package dataSet

import controllers.DateAsStringSerializer
import kotlinx.serialization.Contextual
import javax.management.InvalidAttributeValueException
import java.time.LocalDate;
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

/**
 * Data Class Route. CollectionModules
 *
 * @constructor id: Long, name: String, coordinates: Coordinates, creationDate: LocalDate, from: Location, to: Location, distance: Long
 * @author OvchinnikovI17
 * @since 1.0.0
 */
@Serializable
data class Route(
    var id:Long = (1..10000).random().toLong(),
    var name: String,
    @Contextual
    @Serializable(DateAsStringSerializer::class)
    var creationDate: LocalDate,
    var from: Location,
    var to: Location,
    var distance: Long,
    var coordinates: Coordinates,
)


fun main(){
    val route = Route(
        id = (1..10000).random().toLong(),
        name = "route name",
        creationDate = LocalDate.now(),
        from = Location(2,2,3),
        to = Location(4,4,5),
        distance = 100,
        coordinates = Coordinates(1, 2)
    )
    //println(Json.encodeToString(route))
}