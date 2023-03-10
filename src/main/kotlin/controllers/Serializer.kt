package controllers

import dataSet.Route
import kotlinx.serialization.KSerializer
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encodeToString
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import java.time.LocalDate

/**
 * Serializer class.
 *
 *
 * @author jutsoNNN
 * @since 1.0.0
 */
class Serializer {

    /**
     * serialize method. Serialize List to JSON format
     *
     * @param whatToSerialize: List<Route>. List that heeded to serialize
     * @return Json.encodeToString(whatToSerialize). Returns serialized List in String format
     */
    fun serialize(whatToSerialize: List<Route>): String {
        return Json.encodeToString(whatToSerialize)
    }

    /**
     * deserialize method. Deserialize JSON to List format
     *
     * @param whatToDeserialize: String. JSON String that need to be deserialized
     * @return Json.decodeFromString<List<Route>>(whatToDeserialize). Returns deserialized JSON String in List format
     */
    fun deserialize(whatToDeserialize: String): List<Route> {
        return Json.decodeFromString<List<Route>>(whatToDeserialize)
    }

}

object DateAsStringSerializer : KSerializer<LocalDate> {
    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("LocalDate", PrimitiveKind.STRING)
    override fun serialize(encoder: Encoder, value: LocalDate) {
        println(value.toString())
        encoder.encodeString(value.toString())
    }
    override fun deserialize(decoder: Decoder): LocalDate = LocalDate.parse(decoder.decodeString())
}