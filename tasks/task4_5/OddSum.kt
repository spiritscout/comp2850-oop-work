// Task 4.5: summing odd integers with a for loop

fun main() {
    println("Enter an upper limit")
    val limit = readln().toInt()  
    var sum = 0
    for (n in 1..limit step 2) {
        sum = sum + n 
    }
    println(sum) 
}
