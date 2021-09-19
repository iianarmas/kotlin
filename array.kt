fun sayHello(greeting: String,name: String) = println("$greeting $name")

fun main() {
    val namesArray = arrayOf("John", "Jay", "Matt", "Harley")
    // println(namesArray.size)
    // println(namesArray[0])
    // println(namesArray.get(1))

    // iterate all items in array
    //for (item in namesArray) {
        //println(item)
    //}

    // OR

    namesArray.forEach {
        println(it)
    }

    namesArray.forEach { item ->
        println(item)
    }

    namesArray.forEachIndexed { index, item ->
        println("$item at index $index")
    }
    
    // iterate through range
    for (nums in 0..namesArray.size) {
        println(nums)
    }

    // iterate alphabet
    for (char in 'a'..'z') {
        println(char)
    }
}
