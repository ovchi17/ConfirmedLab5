package dataSet

import javax.management.InvalidAttributeValueException
import kotlinx.serialization.Serializable

@Serializable
class Location {

    constructor(checkX: Long?, checkY: Long, checkZ: Int){
        x = checkX
        y = checkY
        z = checkZ
    }



    private var y: Long
        set(value){
            if (value == null){
                throw InvalidAttributeValueException("Поле не может быть null")
            }
            field = value
        }

    private var x: Long?

    private var z: Int
        set(value){
            if (value == null){
                throw InvalidAttributeValueException("Поле не может быть null")
            }
            field = value
        }

}

