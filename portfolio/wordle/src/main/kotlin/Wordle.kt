// Implement the six required functions here
import java.io.File
import kotlin.system.exitProcess
import kotlin.random.Random


//Check input is exactly 5 letters 
 fun isValid(word: String): Boolean {
    if (word.length == 5 && word.all {it.isLetter()}) {
        return true
    } else {
        return false
    }
 }

//read target words from file, return them as a list of strings
fun readWordList(filename: String): MutableList<String> {
    val wordList = mutableListOf<String>() 
    File(filename).forEachLine {wordList.add(it)}
    return wordList 
}

//Choose a random word from given lsit then returns it
fun pickRandomWord(words: MutableList<String>): String {
    val rndint = Random.nextInt(0, words.size + 1)          //random int corresponding to a list entry
    val selectedWord = words[rndint]                        //entry at selected int
    return selectedWord
}

fun obtainGuess(attempt: Int): String {
    println("Attempt $attempt: ")
    readln().uppercase()
}