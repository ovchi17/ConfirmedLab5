package DataSet

import WorkCommandsList.*
import kotlinx.serialization.Contextual
import javax.management.InvalidAttributeValueException
import java.time.LocalDate;
import kotlinx.serialization.Serializable

@Serializable
class Route {


    constructor(checkId: Long, checkName: String, checkCoordinates: Coordinates, checkCreationDate: LocalDate, checkFrom: Location, checkTo: Location, checkDistance: Long){
        id = checkId
        name = checkName
        coordinates = checkCoordinates
        creationDate = checkCreationDate
        from = checkFrom
        to = checkTo
        distance = checkDistance

    }



    private var id: Long = (1..10000).random().toLong()

    private var coordinates: Coordinates

    private var name: String
        set(value){
            if (value == ""){
                throw InvalidAttributeValueException("Поле не может быть пустым")
            }
            field = value
        }
    @Contextual
    private var creationDate: LocalDate = LocalDate.now()
    private var from: Location
    private var to: Location
    private var distance: Long

}