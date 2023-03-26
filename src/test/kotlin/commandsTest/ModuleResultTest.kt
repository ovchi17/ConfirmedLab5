package commandsTest

import commandsHelpers.ResultModule
import commandsHelpers.Status
import commandsHelpers.WorkWithResultModule
import controllers.*
import dataSet.Route
import dataSet.RouteComporator
import di.koinModule
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Test
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin
import workCommandsList.ExecuteScript
import java.util.*
import kotlin.test.assertEquals

internal class ModuleResultTest: KoinComponent {

    @Test
    fun `Check, if tokenizator errors works well`() {

        startKoin {
            modules(koinModule)
        }

        val parametrs: Parametrs by inject()
        val workWithCollection: CollectionMainCommands by inject()

        val executeScript: ExecuteScript = ExecuteScript()
        val sendList = mutableListOf<Any>()
        sendList.add("ex2.txt")
        parametrs.setParametrs(sendList)
        val getResultModule = executeScript.execute()
        println(getResultModule)

        assertEquals(getResultModule.status, Status.ERROR)
    }

}