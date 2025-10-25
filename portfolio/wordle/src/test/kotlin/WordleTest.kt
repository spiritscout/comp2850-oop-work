import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.collections.shouldBeOneOf

@Suppress("unused")
class WordleTest : StringSpec({
    "isValid should return true iff input string is a 5 letter word" {
        isValid("stare") shouldBe true
        isValid("crane ") shouldBe true
        isValid("ClOuD") shouldBe true 
        isValid("oxen") shouldBe false 
        isValid("") shouldBe false
        isValid("cr4ne") shouldBe false  
    }

    "readWordList should return a mutable list of strings from a file" {
        val temptest = createTempFile()
        temptest.writeText("stare\ncloud\npinky")

        readWordList(temptest.absolutePath) shouldBe mutableListOf("stare" , "cloud" , "pinky")

        temptest.delete()
    }

    "pickRandomWord should return a random string from a mutable list of strings and remove that string" {
        pickRandomWord(mutableListOf("stare" , "cloud" , "pinky")) shouldBeOneOf listOf("stare", "cloud", "pinky")

        val words = mutableListOf("only")
        pickRandomWord(words) shouldBe "only"
        words shouldBe mutableListOf<String>()
    }

    "evaluate guess should compare guess string and target string, and character by character return 1 for a match, 0 for not, as a list of ints" {
        evaluateGuess("stare" , "crane") shouldBe listOf(0,0,1,0,1)
        evaluateGuess("stare" , "stare") shouldBe listOf(1,1,1,1,1)
        evaluateGuess("stare" , "cloud") shouldBe listOf(0,0,0,0,0)
    }
})
