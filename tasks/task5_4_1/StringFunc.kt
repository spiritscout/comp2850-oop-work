// Task 5.4.1: string extension function

fun main() {
    println("Please Enter a message under 20 characters: ")
    val message = readln()
    if (message.tooLong()) {
        println("Too Long")
    } else {
        println("Nice One")
    }
}



fun String.tooLong() = this.length > 20