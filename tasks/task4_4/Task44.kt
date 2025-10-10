fun main() {
    var option: String
    do {
        println("Select an option: a b c d ")
        option = readln().lowercase()
        if (option.length != 1 || option[0] !in 'a'..'d' || !option[0].isLetter()) {
            println("Invalid Choice")
        }
    } while (option.length != 1 || option[0] !in 'a'..'d' || !option[0].isLetter())

    println("Order Accepted")
    
    
    }
