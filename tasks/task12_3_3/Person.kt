// Task 12.3.2: Person class, with a secondary constructor

import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String) : 
        this(name, LocalDate.parse(birth))

    init {
        require(name.isNotBlank()) {"Name Cannot Be Blank"}
        require(name.all { it.isLetter() }) { "Name must contain only letters" }
    }

    var isMarried = false
}


fun main() {
    
    print("Please Enter a Name: ")
    var name = readln()
    print("Please Enter a date in yyyy-mm-dd form: ")
    val birth = readln()

    val P1 = Person(name, birth)

    println("(${P1.name}, ${P1.birth})")
}
