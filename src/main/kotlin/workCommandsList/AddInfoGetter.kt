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


    fun name(parametr: String): String{
        var name = " "
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("name")
            name = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            name = parametr
        }
        return name
    }

    fun coord1(parametr: String): Long{
        var coord1 = "0"
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("coordinateX")
            coord1 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            coord1 = parametr
        }
        return coord1.toLong()
    }

    fun coord2(parametr: String): Long{
        var coord2 = "0"
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("coordinateY")
            coord2 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            coord2 = parametr
        }
        return coord2.toLong()
    }

    fun location1(parametr: String): Long{
        var location1 = "0"
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("location1")
            location1 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            location1 = parametr
        }
        return location1.toLong()
    }

    fun location2(parametr: String): Long{
        var location2 = "0"
        if (parametr == "noInfo"){
            consoleWriter.printToConsole("location2")
            location2 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            location2 = parametr
        }
        return location2.toLong()
    }

    fun location3(parametr: String): Int{
        var location3 = "0"
        if(parametr == "noInfo"){
            consoleWriter.printToConsole("location3")
            location3 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            location3 = parametr
        }
        return location3.toInt()
    }

    fun location12(parametr: String): Long{
        var location12 = "0"
        if(parametr == "noInfo"){
            consoleWriter.printToConsole("location1_2")
            location12 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            location12 = parametr
        }
        return location12.toLong()
    }

    fun location22(parametr: String): Long{
        var location22 = "0"
        if(parametr == "noInfo"){
            consoleWriter.printToConsole("location2_2")
            location22 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            location22 = parametr
        }
        return location22.toLong()
    }

    fun location32(parametr: String): Int{
        var location32 = "0"
        if(parametr == "noInfo"){
            consoleWriter.printToConsole("location3_2")
            location32 = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }
        return location32.toInt()
    }

    fun distance(parametr: String): Long{
        var distance = "0"
        if(parametr == "noInfo"){
            consoleWriter.printToConsole("distance")
            distance = readFromUser.readUsersMessage()
            answerToUser.writeToConsoleLn("")
        }else{
            distance = parametr
        }

        return distance.toLong()
    }

}