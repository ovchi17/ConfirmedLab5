package workCommandsList

import usersView.AnswerToUser
import usersView.ConsoleWriter
import usersView.ReadFromUser
import usersView.TypeMessages

class AddInfoGetter {

    val consoleWriter: ConsoleWriter = ConsoleWriter()
    val answerToUser: AnswerToUser = AnswerToUser()
    val readFromUser: ReadFromUser = ReadFromUser()


    fun name(): String{
        consoleWriter.printToConsole("name")
        val name = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return name
    }

    fun coord1(): Long{
        consoleWriter.printToConsole("coordinateX")
        val coord1 = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return coord1.toLong()
    }

    fun coord2(): Long{
        consoleWriter.printToConsole("coordinateY")
        val coord2 = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return coord2.toLong()
    }

    fun location1(): Long{
        consoleWriter.printToConsole("location1")
        val location1 = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return location1.toLong()
    }

    fun location2(): Long{
        consoleWriter.printToConsole("location2")
        val location2 = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return location2.toLong()
    }

    fun location3(): Int{
        consoleWriter.printToConsole("location3")
        val location3 = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return location3.toInt()
    }

    fun location12(): Long{
        consoleWriter.printToConsole("location1_2")
        val location12 = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return location12.toLong()
    }

    fun location22(): Long{
        consoleWriter.printToConsole("location2_2")
        val location22 = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return location22.toLong()
    }

    fun location32(): Int{
        consoleWriter.printToConsole("location3_2")
        val location32 = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return location32.toInt()
    }

    fun distance(): Long{
        consoleWriter.printToConsole("distance")
        val distance = readFromUser.readUsersMessage()
        answerToUser.writeToConsoleLn("")

        return distance.toLong()
    }

}