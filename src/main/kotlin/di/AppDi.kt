package di

import commandsHelpers.AddSet
import commandsHelpers.WorkWithResultModule
import controllers.*
import org.koin.core.component.inject
import org.koin.dsl.module
import usersView.ConsoleWriter


val koinModule = module {

    single<CollectionMainCommands> {
        WorkWithCollection()
    }

    single {
        ConsoleWriter()
    }

    single {
        Tokenizator()
    }

    single {
        AddSet()
    }

    single {
        WorkWithFile()
    }

    single {
        Serializer()
    }

    factory {
        WorkWithResultModule()
    }

}
