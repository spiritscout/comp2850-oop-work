// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun main() {
    val prompt = "Enter a Die Size 4-20, or leave blank for d6"
    val sides = readInt(prompt)
    if (sides != null) {
        rollDie(sides)
    } else {
        rollDie()
    }

}




fun rollDie(sides: Int = 6) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}




fun readInt(prompt: String): Int? {
    println(prompt)
    val input = readln()
    return if (input.isBlank()) {
        null
    } else {
        input.toIntOrNull()
    }
}