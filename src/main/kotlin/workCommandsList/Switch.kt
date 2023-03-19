package workCommandsList

import commandsHelpers.ResultModule

class Switch: Command() {
    override fun execute(): ResultModule {

        var keyCollection = workWithCollection.checkCollection()

        if (keyCollection == "PQ"){
            workWithCollection.changeCollection()
            workWithResultModule.setMessages("changeToCollLL")
        }else{
            workWithCollection.changeCollection()
            workWithResultModule.setMessages("changeToCollPQ")
        }
        return workWithResultModule.getResultModule()
    }

}