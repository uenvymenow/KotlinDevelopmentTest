fun main(args: Array<String>) {
    // Create a string
    val str = "May the force be with you."
    println(str)

    // Using escape characters in strings
    val str1 = "My dad said the funniest thing he said \"a joke\" "
    println(str1)

    // Create a text crawl on multiple lines
//    val rawCrawl = """|A long time ago,
//        |in a galaxy
//        |far, far, away...
//        |BUMM BUMM BUMMMM""".trimMargin()
//    println(rawCrawl)

//    for (char in str) {
//        println(char)
//    }


    // Check if string is equal to value
    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)


    // Check if string contains value
    val contains = str.contains("Force", ignoreCase = false)
    println(contains)


    // Make string either all uppercase or all lowercase
    val uppercase = str.toUpperCase()
    val lower = str.toLowerCase()
    println(uppercase)
    println(lower)


    // Convert an int to a string
    val num = 6
    val stringNum = num.toString()
    println(stringNum)


    // Printing out a strings sequence according to index
    val subsequence = str.subSequence(4, 13)
    println(subsequence)


    // String Template Example [Start]
    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27


    // Variable integration with strings
    // Before Kotlin
    println(luke + " has a " + lightSaberColor)
    // With Kotlin template
    println("$luke has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    // Using a method from these variables
    println("Lukes full name is $luke has ${luke.length} characters")
    // String Template Example [End]
}