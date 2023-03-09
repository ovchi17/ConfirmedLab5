package controllers

import dataSet.Route
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import java.io.FileReader
import java.util.*

class Serializer {

    fun serialize(whatToSerialize: List<Route>): String {
        return Json.encodeToString(whatToSerialize)
    }
    fun deserialize(whatToDeserialize: String): List<Route> {
        return Json.decodeFromString<List<Route>>(whatToDeserialize)
    }

    fun check(){

    }

}