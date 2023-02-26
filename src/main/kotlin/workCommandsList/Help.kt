package workCommandsList
import controllers.WorkWithCollection
import usersView.*

class Help: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val answerToUser: AnswerToUser = AnswerToUser()

        answerToUser.writeToConsoleLn("********************************************************************************************************************************************")

        answerToUser.writeToConsoleLn(" ** help : вывести справку по доступным командам")
        answerToUser.writeToConsoleLn(" ** info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)")
        answerToUser.writeToConsoleLn(" ** show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении")
        answerToUser.writeToConsoleLn(" ** add {element} : добавить новый элемент в коллекцию")
        answerToUser.writeToConsoleLn(" ** update id {element} : обновить значение элемента коллекции, id которого равен заданному")
        answerToUser.writeToConsoleLn(" ** remove_by_id id : удалить элемент из коллекции по его id")
        answerToUser.writeToConsoleLn(" ** clear : очистить коллекцию")
        answerToUser.writeToConsoleLn(" ** save : сохранить коллекцию в файл")
        answerToUser.writeToConsoleLn(" ** execute_script file_name : считать и исполнить скрипт из указанного файла")
        answerToUser.writeToConsoleLn(" ** exit : завершить программу (без сохранения в файл)")
        answerToUser.writeToConsoleLn(" ** remove_first : удалить первый элемент из коллекции")
        answerToUser.writeToConsoleLn(" ** add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции")
        answerToUser.writeToConsoleLn(" ** history : вывести последние 14 команд (без их аргументов)")
        answerToUser.writeToConsoleLn(" ** remove_all_by_distance distance : удалить из коллекции все элементы, значение поля distance которого эквивалентно заданному")
        answerToUser.writeToConsoleLn(" ** average_of_distance : вывести среднее значение поля distance для всех элементов коллекции")
        answerToUser.writeToConsoleLn(" ** filter_less_than_distance distance : вывести элементы, значение поля distance которых меньше заданного")

        answerToUser.writeToConsoleLn("********************************************************************************************************************************************")
    }
}