package workCommandsList

import controllers.WorkWithCollection
import dataSet.*
import usersView.AnswerToUser
import java.time.LocalDate


class Add: Command {
    override fun execute(str: String, workWithCollection: WorkWithCollection) {
        val answerToUser: AnswerToUser = AnswerToUser()

        var id: Long = (1..10000).random().toLong()
        var name: String
        var coordinates: Coordinates
        var creationDate: LocalDate = LocalDate.now()
        var from: Location
        var to: Location
        var distance: Long

        if (str != "noInfo"){
            id = str.toLong()
        }

        answerToUser.writeToConsole("Введите имя: ")
        name = readln().toString()
        answerToUser.writeToConsoleLn("")
        answerToUser.writeToConsole("Введите координату 1: ")
        var coord1: Long = readln().toLong()
        while ((coord1 > 108)){
            answerToUser.writeToConsoleLn("Вы ввели неверное значение! Максимальное значение числа: 108")
            coord1 = readln().toLong()
        }
        answerToUser.writeToConsoleLn("")
        answerToUser.writeToConsole("Введите координату 2: ")
        var coord2: Long = readln().toLong()
        while ((coord2 > 20)){
            answerToUser.writeToConsoleLn("Вы ввели неверное значение! Максимальное значение числа: 20")
            coord2 = readln().toLong()
        }
        answerToUser.writeToConsoleLn("")

        answerToUser.writeToConsole("Введите локацию 1: ")
        var location1: Long = readln().toLong()
        answerToUser.writeToConsoleLn("")
        answerToUser.writeToConsole("Введите локацию 2: ")
        var location2: Long = readln().toLong()
        answerToUser.writeToConsoleLn("")
        answerToUser.writeToConsole("Введите локацию 3: ")
        var location3: Int = readln().toInt()
        answerToUser.writeToConsoleLn("")

        answerToUser.writeToConsole("Введите локацию 1_2: ")
        var location1_2: Long = readln().toLong()
        answerToUser.writeToConsoleLn("")
        answerToUser.writeToConsole("Введите локацию 2_2: ")
        var location2_2: Long = readln().toLong()
        answerToUser.writeToConsoleLn("")
        answerToUser.writeToConsole("Введите локацию 3_2: ")
        var location3_2: Int = readln().toInt()
        answerToUser.writeToConsoleLn("")

        answerToUser.writeToConsole("Введите дистанцию: ")
        distance = readln().toLong()
        answerToUser.writeToConsoleLn("")

        coordinates = Coordinates(coord1, coord2)
        to = Location(location1, location2, location3)
        from = Location(location1_2, location2_2, location3_2)

        val routeToAdd: Route = Route(id, name, coordinates, creationDate, from, to, distance)

        workWithCollection.addElementToCollection(routeToAdd)

        answerToUser.writeToConsoleLn("Коллекция успешно обновлена!")
    }
}