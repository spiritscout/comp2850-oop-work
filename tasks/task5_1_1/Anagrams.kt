fun main() {
    println("Please Enter the first word")
    val first = readln()
    println("Please Enter the second word")
    val second = readln()
    val gram = anagrams(first, second)
    if (gram) {
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
