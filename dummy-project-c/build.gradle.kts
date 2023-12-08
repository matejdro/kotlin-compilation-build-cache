import kotlin.math.*
import kotlin.random.Random

plugins {
    id("application")
}

dependencies {
    implementation(project(":utilities"))
}

application {
    mainClass = "org.gradle.sample.app.Main"
}

// Some nonsensical code to make kts compilation longer and more noticeable


    val random = Random(System.currentTimeMillis())
fun main() {

    var i = 0
    while (i < 8000000000) {
        var x: Double = random.nextDouble() * 1000000000000
        var y: Double = random.nextDouble() * 1000000000000

        // Do even more nonsensical operations with x and y, reaching the limits of Kotlin's numerical precision

        // Even more nonsensical operations with x and y, approaching the boundaries of Kotlin's numerical representation
        x = (Math.PI) / kotlin.math.E
        y = (random.nextInt() / kotlin.math.E) / random.nextDouble()



        i++
    }
}

// Declare even more variables with meaningless names and assign nonsensical values, stretching Kotlin's capabilities for symbolic representation
val uberfoobar = "The ultimate answer to the universe"
val quantumGibberish = 42.13371337133713371337

// Call even more nonsensical methods that do even less, reaching the limits of Kotlin's expression evaluation capabilities
val evenMoreEvenMoreNonsensicalMethod = fun() {
    println("This method is so pointless that it's practically nonexistent.")
}
evenMoreEvenMoreNonsensicalMethod()

// Create even more nonsensical objects and arrays, pushing the boundaries of Kotlin's object-oriented programming features
val evenMoreEvenMoreNonsensicalObject = object {
    fun evenMoreEvenMoreNonsensicalMethod4() {
        println("This method is so devoid of purpose that it has transcended the concept of meaning.")
    }
}


val evenMoreEvenMoreNonsensicalArray = arrayOf(" even more more", " nonsensical", " value", " array", " entries")