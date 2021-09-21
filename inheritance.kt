interface PersonInfoProvider{
    val providerInfo: String

    fun printInfo(person: Person){
        // println(providerInfo)
        person.nickName = "Yow"
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId(): String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "basic info provider"

    protected open val sessionIdPrefix = "Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
        println(providerInfo)
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}


fun main() {
    val prov = FancyInfoProvider()
    prov.printInfo(Person())
    prov.getSessionId()

    checkTypes(prov)
}

fun checkTypes(infoProvider: PersonInfoProvider) {
    if (infoProvider is SessionInfoProvider) {
        println("is a session info provider")
        println(infoProvider.getSessionId())
    } else
        println("not a session info provider")


}

--------------------------------------------------------------------------
  

class FancyInfoProvider : BasicInfoProvider() {     // add open keyword in BasicInfoProvider class to inherit from it
    override val sessionIdPrefix: String        // also add open keyword to the variable that needs to be overridden
        get() = "New Session Id"                // also add protected to only be able to access it within its classes

    override val providerInfo: String
        get() = "fancy info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("Fancy info")
    }
}
