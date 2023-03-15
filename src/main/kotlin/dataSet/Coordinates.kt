package dataSet

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
    constructor(checkX: Long?, checkY: Long?){
        x = checkX
        y = checkY
    }

    private var x: Long?
        set(value){
            field = value
        }

    private var y: Long?
        set(value){
            field = value
        }

}