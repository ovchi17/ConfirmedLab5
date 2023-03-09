package dataSet

import javax.management.InvalidAttributeValueException
import kotlinx.serialization.Serializable

/**
 * Coordinates. Sub-model of: <code>Route</code>.
 *
 * @constructor x: Long, y: Long
 * @author OvchinnikovI17
 * @since 1.0.0
 */
@Serializable
class Coordinates {
    constructor(checkX: Long, checkY: Long){
        x = checkX
        y = checkY
    }



    private var x: Long
        set(value){
            if (value > 108){
                throw InvalidAttributeValueException("Вы превысили максимальное значение, максимальное значени 108")
            }
            field = value
        }

    private var y: Long
        set(value){
            if (value > 20){
                throw InvalidAttributeValueException("Вы превысили максимальное значение, максимальное значение 20")
            }
            field = value
        }

}