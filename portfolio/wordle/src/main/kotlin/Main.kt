import java.io.File
import kotlin.system.exitProcess
import kotlin.random.Random


fun main() {
    
    val filename = "data/words.txt"
    var wordList = mutableListOf<String>()

    //check file can be read
    try {
        wordList = readWordList(filename)
    }
    catch (error: Exception) {
        println("Unable to read from file words.txt")
    }
    
    //pick a word then start a loop
    val target = pickRandomWord(wordList)
    var i = 1
    while (i <= 10) {
        val attempt = i
        val guess = obtainGuess(attempt)                //funtion calls
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)

        if (matches.all { it == 1 }) {                  //loop check
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

