
fun sayHello(greeting: String, itemsToGreet: List<String>){
    itemsToGreet.forEach { item -> println("$greeting $item") }
}

fun main() {
    val greetings = listOf("James", "John", "Anne")

    sayHello("Hello", greetings)

}
