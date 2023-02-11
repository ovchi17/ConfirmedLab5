package DataSet

import javax.management.InvalidAttributeValueException
import WorkCommandsList.*
import kotlinx.serialization.Serializable

@Serializable
class Coordinates {
    constructor(checkX: Float, checkY: Float){
        x = checkX
        y = checkY
    }



    private var x: Float
        set(value){
            if (value > 108){
                throw InvalidAttributeValueException("Вы превысили максимальное значение, максимальное значени 108")
            }
            field = value
        }

    private var y: Float
        set(value){
            if (value > 20){
                throw InvalidAttributeValueException("Вы превысили максимальное значение, максимальное значение 20")
            }
            field = value
        }

}