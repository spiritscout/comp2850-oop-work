fun main() {
    println("Please Enter the first word")
    val first = readln()
    println("Please Enter the second word")
    val second = readln()
    if (first anagramOf second) {
        println("anagram")
    } else {
        println("not anagram")
    }
}

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

infix fun String.anagramOf(second: String): Boolean {
    if (this.length != second.length) {
        return false
    } 
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars

}