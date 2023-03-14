package controllers

import dataSet.Route
import dataSet.RouteComporator
import java.io.File
import java.io.FileReader
import java.util.*

/**
 * WorkWithFile class. Implements methods for work with file
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class WorkWithFile {

    /**
     * checkFile. The method checks if the file is empty.
     *
     * @param pathToFile: String. The String that contains path to file
     * @return isEmpty: Boolean.
     */
    fun checkFile(pathToFile: String): Boolean{
        val pathToFile: String = System.getenv("DataOfCollection")
        val file = File(pathToFile)
        var isEmpty = true
        if (file.length() != 0L){
            isEmpty = false
        }
        return isEmpty
    }

    /**
     * writeToFile method. Method for write smthn to file
     *
     * @param collection: PriorityQueue<Route>. The PriorityQueue Collection
     * @param pathToFile: String. The String that contains path to file
     * @param whatToWrite: String. The String which need to add in file
     */
    fun writeToFile(collection: PriorityQueue<Route>, pathToFile: String, whatToWrite: String){
        File(pathToFile).writeText(whatToWrite)
    }

    /**
     * readFile method. Method for read the file
     *
     * @param file: File. The File that needed to read
     * @return fileContent: String. Returns the content of file in String format
     */
    fun readFile(file: File): String {
        FileReader(file).use {
            val chars = CharArray(file.length().toInt())
            it.read(chars)
            val fileContent = String(chars)
            return (fileContent)
        }
    }

}