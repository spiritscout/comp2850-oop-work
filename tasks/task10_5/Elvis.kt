// Task 10.3.2: another example of an explicit null check


fun main() {
    print("Enter a string: ")
    val input = readLine()

    println("Input: $input")
    val reversed = input?.let {it.reversed().uppercase()} ?: "???"
    println("Reversed: $reversed")
}
