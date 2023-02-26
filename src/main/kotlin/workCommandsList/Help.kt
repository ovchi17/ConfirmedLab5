package workCommandsList
import controllers.WorkWithCollection
import usersView.*

class Help: Command {
    override fun execute(str: List<Any>, workWithCollection: WorkWithCollection) {

        val consoleWriter: ConsoleWriter = ConsoleWriter()

        consoleWriter.printToConsoleLn("***")

        consoleWriter.printToConsoleLn("helpHelp")
        consoleWriter.printToConsoleLn("helpInfo")
        consoleWriter.printToConsoleLn("helpShow")
        consoleWriter.printToConsoleLn("helpAdd")
        consoleWriter.printToConsoleLn("helpUpdate")
        consoleWriter.printToConsoleLn("helpRemove")
        consoleWriter.printToConsoleLn("helpClear")
        consoleWriter.printToConsoleLn("helpSave")
        consoleWriter.printToConsoleLn("helpExecute")
        consoleWriter.printToConsoleLn("helpExit")
        consoleWriter.printToConsoleLn("helpRemoveFirst")
        consoleWriter.printToConsoleLn("helpAddIfMax")
        consoleWriter.printToConsoleLn("helpHistory")
        consoleWriter.printToConsoleLn("helpRemoveAllByDistance")
        consoleWriter.printToConsoleLn("helpAverageOfDistance")
        consoleWriter.printToConsoleLn("helpFilterLessThanDistance")

        consoleWriter.printToConsoleLn("***")


    }
}