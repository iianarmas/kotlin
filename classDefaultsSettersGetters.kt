import Person

fun sayHello(greeting: String, vararg itemsToGreet: String){
    itemsToGreet.forEach { item -> println("$greeting $item") }
}

// providing default value to fxn param
fun greetPerson(greeting: String = "Hello", name:String = "Kotlin") = println("$greeting $name")

fun main() {
    val person1 = Person()              // creating an object of the class
    person1.nickName = "Nickname 1"     // setting new value to variable in class
    person1.nickName = "Nickname 2"
    println(person1.nickName)

}


------------------------------------------------------
  
class Person(val firstName:String = "Iian", val lastName: String = "Armas") {   // setting parameters and default values to class

    var nickName: String? = null
        
      // overriding setters and getters
        // this will be called whenever a value is set
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        
        // this will be called whenever we get a value
        get() {
            println("The return value is $field")
            return field
        }
}

  
