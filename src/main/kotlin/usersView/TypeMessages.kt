package usersView

/**
 * TypeMessages class. Contains kays and TypeMessages
 *
 * @author OvchinnikovI17
 * @since 1.0.0
 */

class TypeMessages {
    private val msg = mapOf(
        "name" to "Введите имя: ",
        "coordinateX" to "Введите координату X: ",
        "coordinateY" to "Введите координату Y: ",
        "location1" to "Введите локацию 1: ",
        "location2" to "Введите локацию 2: ",
        "location3" to "Введите локацию 3: ",
        "location1_2" to "Введите локацию 1_2: ",
        "location2_2" to "Введите локацию 2_2: ",
        "location3_2" to "Введите локацию 3_2: ",
        "distance" to "Введите дистанцию: ",
        "success" to  "Успешно! ",
        "noSuccess" to  "Не успешно! ",
        "end" to "Заверщение программы. ",
        "***" to "********************************************************************************************************************************************",
        "helpHelp" to " ** help : вывести справку по доступным командам",
        "helpInfo" to " ** info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)",
        "helpShow" to " ** show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении",
        "helpAdd" to " ** add {element} : добавить новый элемент в коллекцию",
        "helpUpdate" to " ** update id {element} : обновить значение элемента коллекции, id которого равен заданному",
        "helpRemove" to " ** remove_by_id id : удалить элемент из коллекции по его id",
        "helpClear" to " ** clear : очистить коллекцию",
        "helpSave" to " ** save : сохранить коллекцию в файл",
        "helpExecute" to " ** execute_script file_name : считать и исполнить скрипт из указанного файла",
        "helpExit" to " ** exit : завершить программу (без сохранения в файл)",
        "helpRemoveFirst" to " ** remove_first : удалить первый элемент из коллекции",
        "helpAddIfMax" to " ** add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции",
        "helpHistory" to " ** history : вывести последние 14 команд (без их аргументов)",
        "helpRemoveAllByDistance" to " ** remove_all_by_distance distance : удалить из коллекции все элементы, значение поля distance которого эквивалентно заданному",
        "helpAverageOfDistance" to " ** average_of_distance : вывести среднее значение поля distance для всех элементов коллекции",
        "helpFilterLessThanDistance" to " ** filter_less_than_distance distance : вывести элементы, значение поля distance которых меньше заданного",
        "historyOfCommands" to "История команд: ",
        "typeCollection" to "Тип коллекции: ",
        "sizeCollection" to "Размер коллекции: ",
        "dataCollection" to "Дата создания коллекции: ",
        "emptyCollection" to "Коллекция пуста ",
        "cleared" to "Очищено ",
        "noDistance" to "Нет distance в коллекции ",
        "noId" to "Нет id в коллекции ",
        "saved" to "Сохранено! ",
        "showName" to "Name: ",
        "showId" to " Id: ",
        "noResult" to "Нет подходящих элементов ",
        "noFile" to "Файл не найден",
        "recursion" to "Возникла рекурсия"
    )

    /**
     * readUsersMessage method. Read users messages
     *
     * @param printingKey String that represents the printing key
     * @return message as String
     */
    fun msgToPrint (printingKey: String): String? {
        return msg[printingKey]
    }

}