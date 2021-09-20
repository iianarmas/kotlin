

fun sayHello(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach { item -> println("$greeting $item") }
}

// providing default value to fxn param
fun greetPerson(greeting: String = "Hello", name:String = "Kotlin") = println("$greeting $name")

fun main() {
    val greetings = arrayOf("James", "John", "Anne")

    // sayHello("Hello", "Kotlin", "Java", "Python")

    // passing array of strings
    sayHello("Hello", *greetings)

    // default value allows for non-declaration of arguments
    greetPerson("Hey there", "Iian")
    greetPerson(greeting = "Hey there")
    greetPerson()

}
