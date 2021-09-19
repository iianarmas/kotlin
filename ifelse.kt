var age = 6
var name: String? = null


fun ifelse() {
    name = "John"
    if (name != null) {
        println("$name is $age years old")
        println("nice")
    }     // brackets are used when there is more than 1 statement
    else
        println("name is null")
}
