
fun sayHello(greeting: String,name: String) = println("$greeting $name")

fun main() {
    val myList = listOf("BMW", "Honda", "Nissan", "Audi")

    if ("Honda" in myList) {
        for (i in myList.indices) {
            if (myList[i] == "Honda")
                println("Honda is in myList at index $i")
        }
    }
    else
        print("Honda is not in myList")
        
    
    // method 2
    
    if ("Nissan" in myList) {
        myList.forEachIndexed { index,item ->
            if (item == "Nissan")
                println("Nissan is in myList at index $index")
        }
    }
    else
        print("Nissan is not in myList")


}
