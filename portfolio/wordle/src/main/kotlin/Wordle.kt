// Implement the six required functions here




//Check input is exactly 5 letters 
 fun isValid(word: String): Boolean {
    val wordtrim = word.trim()
    if (wordtrim.length == 5 && wordtrim.all {it.isLetter()}) {
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
    words.remove(selectedWord)
    return selectedWord
}

//Prompt the User for input then return the guess once validated
fun obtainGuess(attempt: Int): String {
    println("Attempt $attempt: ")
    val input = readlnOrNull()?.trim() ?: ""
    var guess = input.uppercase()
    while (isValid(guess) == false) {                       //check guess is valid
        println("Please enter a 5 letter word")     
        println("Attempt $attempt: ")                       //reprompt if invalid
        val input = readlnOrNull()?.trim() ?: ""
        var guess = input.uppercase()
    }
    return guess
}


//Compare given guess with target word 
fun evaluateGuess(guess: String, target: String): List<Int> {
    val guessArray = guess.toCharArray()
    val targetArray = target.toCharArray()
    val compareList = mutableListOf<Int>()
    for (n in 0 .. 4) {
        if (guessArray[n] == targetArray[n]) {
            compareList.add(1)
        }   else {
            compareList.add(0)
        }
    } 
    return compareList
}

//Display the letters of a guess that match the target word
fun displayGuess(guess: String, matches: List<Int>) {
    val guessArray = guess.toCharArray()
    for (n in 0 .. 4) {
        if (matches[n] == 1) {
            //nothing
        } else {
            guessArray[n] = '?'
        }
    }
    val guessString = String(guessArray)
    println(guessString)
}