// Task 7.3.2: list element access

fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    numbers.add(1)
    println(numbers)
    println(numbers[0])
    println(numbers.get(0))
    //println(numbers[10])
    println(numbers.slice(2..4))
    

}
