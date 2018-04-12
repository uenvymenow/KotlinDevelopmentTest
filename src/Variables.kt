/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    // Creates a string variable that is constant due to the val keyword
    val name = "JohnnyB"

    // Creates a boolean variable and set it to false
    var isAwesome = false

    // prints a string concatination
    println("Is " + name + " awesome? The answer is : " + isAwesome)

    // Creates 2 integer variables
    var a = 3
    var b = 6
    // Prints the value of the integers a and b added together
    println(a + b)

    // creates a constant that is a Double and another constant that is a float
    val doubleNum: Double = 123.45
    val floatNum: Float = 123.45f

    // Converts a Double to a string and assigns it to a constant variable
    val aDouble = a.toString()

    // Creates a variable called hero and instantiates it as a string
    var hero: String
    // Assigns the values of "Batman" to the hero variable
    hero = "Batman"
    // Assigns the value of "Superman" to the hero variable
    hero = "Superman"
    // Prints the variable hero
    println(hero)

}