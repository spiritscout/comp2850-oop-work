// Task 12.3.2: Person class, with a secondary constructor

import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    constructor(name: String, birth: String) : 
        this(name, LocalDate.parse(birth))

    var isMarried = false
}


fun main() {
    
    val P1 = Person("Beverly", "1997-08-23")
    println("(${P1.name}, ${P1.birth})")
}
