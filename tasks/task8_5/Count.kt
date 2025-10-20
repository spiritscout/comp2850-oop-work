import java.io.File
import kotlin.system.exitProcess
import kotlin.time.measureTime


fun main() {
    val stringy = "What is long and stringy?"

    val vowelCount = stringy.howMany { it in "aeiou"}
    println(vowelCount)
}




fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}
