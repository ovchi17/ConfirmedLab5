package controllers

/**
 * Class Parameters. Using this class we can set parametrs co commands
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class Parametrs {
    var prm: MutableList<Any> = mutableListOf()

    /**
     * setParametrs method. Set parametrs
     *
     * @param params
     */
    fun setParametrs(params: MutableList<Any>){
        prm.clear()
        prm.addAll(params)
    }

    /**
     * getParametrs method. Returns parametrs
     *
     * @return message as MutableList<Any>
     */
    fun getParametrs(): MutableList<Any>{
        return prm
    }
}