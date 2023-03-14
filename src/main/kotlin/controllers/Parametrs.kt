package controllers

class Parametrs {
    var prm: MutableList<Any> = mutableListOf()

    fun setParametrs(params: MutableList<Any>){
        prm.clear()
        prm.addAll(params)
    }

    fun getParametrs(): MutableList<Any>{
        return prm
    }
}