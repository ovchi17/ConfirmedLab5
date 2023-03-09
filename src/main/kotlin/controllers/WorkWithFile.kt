package controllers

import dataSet.Route
import dataSet.RouteComporator
import java.io.File
import java.io.FileReader
import java.util.*

class WorkWithFile {

    fun checkFile(pathToFile: String): Boolean{
        val collection = PriorityQueue<Route>(RouteComporator())
        var pathToFile: String = "src/main/kotlin/dataSet/DataOfCollection.json"
        var fileReader: FileReader = FileReader(pathToFile)
        val file = File(pathToFile)
        var isEmpty = true
        if (file.length() != 0L){
            isEmpty = false
        }
        return isEmpty
    }

    fun writeToFile(collection: PriorityQueue<Route>, pathToFile: String, whatToWrite: String){
        File(pathToFile).writeText(whatToWrite)
    }

    fun readFile(file: File): String {
        FileReader(file).use {
            val chars = CharArray(file.length().toInt())
            it.read(chars)
            val fileContent = String(chars)
            return (fileContent)
        }
    }

}