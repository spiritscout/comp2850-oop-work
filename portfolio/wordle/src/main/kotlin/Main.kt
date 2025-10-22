import java.io.File
import kotlin.system.exitProcess
import kotlin.random.Random


fun main() {
    
    val filename = "data/words.txt"
    val wordList: MutableList<String>

    try {
        wordList = readWordList(filename)
    }
    catch (error: Exception) {
        println("Unable to read from file words.txt")
    }
    

    val target = pickRandomWord(wordList)
    var i = 1
    while (i <= 10) {
        val attempt = i
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)

        if (matches.all { it == 1 }) {
            println("Congratulations!")
            break
        } else {
            i++
        }
    }
    if (i > 10) {
    println("Sorry, you are out of guesses")
    println("The word was: $target")
    }
}   

