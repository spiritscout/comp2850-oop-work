// Task 7.7.1: stats for a numeric dataset

fun main() {
    displayValues()
}



fun readData() = buildList {
    var i = 1
    while (true) {
        println("Enter Item $i: ")
        var input = readln()
        if (input == "q") {
            break
        } else {
            add(input.toFloat())
            i++
        }
        
        
    }
}

fun findMedian(values: List<Float>) = values.average().toFloat()


fun displayValues() {
    val values = readData()
    val minimum = values.min()
    val maximum = values.max()
    val summation = values.sum()
    val average = findMedian(values) 
    println("Min = $minimum, Max = $maximum, Sum = $summation, Avg = $average")

}