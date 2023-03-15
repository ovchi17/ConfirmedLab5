package commandsHelpers

import usersView.AnswerToUser
import usersView.ConsoleWriter
import usersView.ReadFromUser

/**
 * Class AddInfoSetter. In fact, Add and AddIfMax setter
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class AddSet {

    val consoleWriter: ConsoleWriter = ConsoleWriter()
    val answerToUser: AnswerToUser = AnswerToUser()
    val readFromUser: ReadFromUser = ReadFromUser()

    /**
     * name method. Set name
     *
     * @param parametr
     * @return message as String
     */
    fun name(parametr: String?): String{
        var name: String? = " "
        var resultReturn = " "
        if (parametr == "noInfo"){
            while (true){
                consoleWriter.printToConsole("name")
                name = readFromUser.readUsersMessage()
                if (name != ""){
                    resultReturn = name
                    break
                }else{
                    answerToUser.writeToConsoleLn("Введенное значение не может быть равным null")
                }
            }
            answerToUser.writeToConsoleLn("")
        }else{
            name = parametr
            if (name == null){
                resultReturn = "DefaultName"
            }else{
                resultReturn = name
            }
        }
        return resultReturn
    }

    /**
     * coord1 method. Set coord1
     *
     * @param parametr
     * @return message as Long
     */
    fun coord1(parametr: String?): Long?{
        var coord1: String? = "0"
        var resultReturn: Long? = null
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("coordinateX")
            coord1 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            coord1 = parametr
        }
        try {
            if (coord1 != null) {
                resultReturn = coord1.toLong()
            }
        }catch (e: NumberFormatException){
            if (coord1!= ""){
                answerToUser.writeToConsoleLn("Ошибка. Установлено стандартное значение null")
            }
        }
        return resultReturn
    }

    /**
     * coord2 method. Set coord2
     *
     * @param parametr
     * @return message as Long
     */
    fun coord2(parametr: String?): Long{
        var coord2: String? = "0"
        var resultReturn: Long = 0;
        val stopper: Long = 240

        try{
            if(parametr == "noInfo"){
                consoleWriter.printToConsole("coordinateY")
                while (true){
                    coord2 = readFromUser.readUsersMessage()
                    if (coord2!= ""){
                        resultReturn = coord2.toLong()
                    }
                    if (resultReturn < stopper && coord2 != ""){
                        break
                    }else{
                        answerToUser.writeToConsoleLn("Введенное значение должно быть меньше 239 и не равно null")
                        consoleWriter.printToConsole("coordinateY")
                    }
                }
                answerToUser.writeToConsoleLn("")
            }else{
                coord2 = parametr
                if (coord2 != null) {
                    resultReturn = coord2.toLong()
                }
            }
        }catch (e: NumberFormatException){
            answerToUser.writeToConsoleLn("Ошибка. Установлено стандартное значение 0")
        }
        return resultReturn
    }

    /**
     * location1 method. Set location1
     *
     * @param parametr
     * @return message as Long
     */
    fun location1(parametr: String?): Long?{
        var location1: String? = "0"
        var resultReturn: Long? = null
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("location1")
            location1 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            location1 = parametr
        }
        try{
            if (location1 != null) {
                resultReturn = location1.toLong()
            }
        }catch (e: NumberFormatException){
            if (location1!= ""){
                answerToUser.writeToConsoleLn("Ошибка. Установлено стандартное значение null")
            }
        }
        return resultReturn
    }

    /**
     * location2 method. Set location2
     *
     * @param parametr
     * @return message as Long
     */
    fun location2(parametr: String?): Long{
        var location2: String? = "0"
        var resultReturn: Long = 0;
        if (parametr == "noInfo"){
            while (true){
                consoleWriter.printToConsole("location2")
                location2 = readFromUser.readUsersMessage()
                if (location2 != ""){
                    break
                }else{
                    answerToUser.writeToConsoleLn("Значение не должно равняться null")
                    answerToUser.writeToConsoleLn("")
                }
            }
            answerToUser.writeToConsoleLn("")
        }else{
            location2 = parametr
        }
        try {
            if (location2 != null) {
                resultReturn = location2.toLong()
            }
        }catch (e: NumberFormatException){
            answerToUser.writeToConsoleLn("Ошибка. Установлено стандартное значение 0")
        }
        return resultReturn
    }

    /**
     * location3 method. Set location3
     *
     * @param parametr
     * @return message as Int
     */
    fun location3(parametr: String?): Int{
        var location3: String? = "0"
        var resultReturn: Int = 0;
        if (parametr == "noInfo"){
            while (true){
                consoleWriter.printToConsole("location3")
                location3 = readFromUser.readUsersMessage()
                if (location3!= ""){
                    break
                }else{
                    answerToUser.writeToConsoleLn("Значение не должно равняться null")
                    answerToUser.writeToConsoleLn("")
                }
            }
            answerToUser.writeToConsoleLn("")
        }else{
            location3 = parametr
        }
        try {
            if (location3 != null) {
                resultReturn = location3.toInt()
            }
        }catch (e: NumberFormatException){
            answerToUser.writeToConsoleLn("Ошибка. Установлено стандартное значение 0")
        }
        return resultReturn
    }

    /**
     * location12 method. Set location12
     *
     * @param parametr
     * @return message as Long
     */
    fun location12(parametr: String?): Long?{
        var location12: String? = "0"
        var resultReturn: Long? = null
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("location1_2")
            location12 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            location12 = parametr
        }
        try{
            if (location12 != null) {
                resultReturn = location12.toLong()
            }
        }catch (e: NumberFormatException){
            if (location12!= ""){
                answerToUser.writeToConsoleLn("Ошибка. Установлено стандартное значение null")
            }
        }
        return resultReturn
    }

    /**
     * location22 method. Set location22
     *
     * @param parametr
     * @return message as Long
     */
    fun location22(parametr: String?): Long{
        var location22: String? = "0"
        var resultReturn: Long = 0;
        if (parametr == "noInfo"){
            while (true){
                consoleWriter.printToConsole("location2_2")
                location22 = readFromUser.readUsersMessage()
                if (location22!= ""){
                    break
                }else{
                    answerToUser.writeToConsoleLn("Значение не должно равняться null")
                    answerToUser.writeToConsoleLn("")
                }
            }
            answerToUser.writeToConsoleLn("")
        }else{
            location22 = parametr
        }
        try {
            if (location22 != null) {
                resultReturn = location22.toLong()
            }
        }catch (e: NumberFormatException){
            answerToUser.writeToConsoleLn("Ошибка. Установлено стандартное значение 0")
        }
        return resultReturn
    }

    /**
     * location32 method. Set location32
     *
     * @param parametr
     * @return message as Int
     */
    fun location32(parametr: String?): Int{
        var location32: String? = "0"
        var resultReturn: Int = 0;
        if (parametr == "noInfo"){
            while (true){
                consoleWriter.printToConsole("location3_2")
                location32 = readFromUser.readUsersMessage()
                if (location32!= ""){
                    break
                }else{
                    answerToUser.writeToConsoleLn("Значение не должно равняться null")
                    answerToUser.writeToConsoleLn("")
                }
            }
            answerToUser.writeToConsoleLn("")
        }else{
            location32 = parametr
        }
        try {
            if (location32 != null) {
                resultReturn = location32.toInt()
            }
        }catch (e: NumberFormatException){
            answerToUser.writeToConsoleLn("Ошибка. Установлено стандартное значение 0")
        }
        return resultReturn
    }

    /**
     * distance method. Set distance
     *
     * @param parametr
     * @return message as Long
     */
    fun distance(parametr: String?): Long{
        var distance: String? = "2"
        var resultReturn: Long = 2;

        try{
            if(parametr == "noInfo"){
                consoleWriter.printToConsole("distance")
                while (true){
                    distance = readFromUser.readUsersMessage()
                    if (distance != ""){
                        resultReturn = distance.toLong()
                        if (resultReturn > 1){
                            break
                        }else{
                            answerToUser.writeToConsoleLn("Введенное значение должно быть больше 1")
                            consoleWriter.printToConsole("distance")
                        }
                    }else{
                        answerToUser.writeToConsoleLn("Введенное не должно равняться 0")
                        consoleWriter.printToConsole("distance")
                    }
                }
                answerToUser.writeToConsoleLn("")
            }else{
                distance = parametr
                if (distance != null) {
                    resultReturn = distance.toLong()
                }
            }
        }catch (e: NumberFormatException){
            answerToUser.writeToConsoleLn("Ошибка, установлено стандратное значение: 2")
        }

        return resultReturn
    }

}