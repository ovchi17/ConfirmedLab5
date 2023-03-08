package workCommandsList

import usersView.AnswerToUser
import usersView.ConsoleWriter
import usersView.ReadFromUser
import usersView.TypeMessages

/**
 * Class AddInfoGetter. In fact, Add and AddIfMax setter
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */
class AddInfoGetter {

    val consoleWriter: ConsoleWriter = ConsoleWriter()
    val answerToUser: AnswerToUser = AnswerToUser()
    val readFromUser: ReadFromUser = ReadFromUser()


    fun name(parametr: String?): String{
        var name: String? = " "
        var resultReturn = " "
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("name")
            while (true){
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
                answerToUser.writeToConsoleLn("Ошибка")
            }
        }
        return resultReturn
    }

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
            answerToUser.writeToConsoleLn("Ошибка")
        }
        return resultReturn
    }

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
                answerToUser.writeToConsoleLn("Ошибка")
            }
        }
        return resultReturn
    }

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
            answerToUser.writeToConsoleLn("Ошибка")
        }
        return resultReturn
    }

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
            answerToUser.writeToConsoleLn("Ошибка")
        }
        return resultReturn
    }

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
                answerToUser.writeToConsoleLn("Ошибка")
            }
        }
        return resultReturn
    }

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
            answerToUser.writeToConsoleLn("Ошибка")
        }
        return resultReturn
    }

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
            answerToUser.writeToConsoleLn("Ошибка")
        }
        return resultReturn
    }

    fun distance(parametr: String?): Long{
        var distance: String? = "2"
        var resultReturn: Long = 2;

        try{
            if(parametr == "noInfo"){
                consoleWriter.printToConsole("distance")
                while (true){
                    distance = readFromUser.readUsersMessage()
                    if (distance != ""){
                        if (resultReturn > 1){
                            break
                        }else{
                            answerToUser.writeToConsoleLn("Введенное значение должно быть больше 1")
                            consoleWriter.printToConsole("distance")
                        }
                    }else{
                        answerToUser.writeToConsoleLn("Введенное значение должно быть больше 1")
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
            answerToUser.writeToConsoleLn("Ошибка")
        }

        return resultReturn
    }

}