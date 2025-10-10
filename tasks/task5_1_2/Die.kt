// Task 5.1.2: die rolling simulation
import kotlin.random.Random

fun main() {
    val prompt = "Enter a Die Size 4-20"
    val sides = readInt(prompt)
    rollDie(sides)

}




fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling a d$sides...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a $sides-sided die")
    }
}



fun readInt(prompt: String) : Int {
    println(prompt)
    return readln().toInt()
}