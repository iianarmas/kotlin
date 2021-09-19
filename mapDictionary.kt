fun sayHello(greeting: String,name: String) = println("$greeting $name")

fun main() {
    val myList = listOf("BMW", "Honda", "Nissan", "Audi")

    val myMap = mapOf("a" to "Hello", "b" to "Hi", "c" to "Hey")

    myMap.forEach { (key, value) -> println("$key with $value") }

    println(myMap["a"])

}
