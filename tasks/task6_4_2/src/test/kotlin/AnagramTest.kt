// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    "Return anagram for two words that are anagrams" {
        "listen" anagramOf "silent" shouldBe true
        "silent" anagramOf "listen" shouldBe true
    }

    "Lowercase and uppercase characters are considered equivalent" {
        "LiStEn" anagramOf "sIlEnT" shouldBe true 
    }

    "Non-empty string is an anagram of itself" {
        "Race Car" anagramOf "Race Car" shouldBe true
    }

    "Empty string is not an anagram of itself" {
        "" anagramOf "" shouldBe false 
    }

    "Two strings of different lengths are not anagrams" {
        "listen" anagramOf "listenen" shouldBe false
    }
})
