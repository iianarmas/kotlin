var age = 7
var name: String? = null


fun useConditionsToAssign() {
    name = "Iian"
    
    // using if else statement
    // val nameToPrint = if (name != null) "Name is $name" else "No name"
  
    // using when else statement
    val nameToPrint = when (name) {
        null -> "No name"
        else -> "Name is $name"
    }

    println(nameToPrint)

}
