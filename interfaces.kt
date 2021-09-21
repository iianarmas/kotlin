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

class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo: String
        get() = "basic info provider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return "Some session id"
    }
}


fun main() {
    val prov = BasicInfoProvider()
    prov.printInfo(Person())
    prov.getSessionId()

}
