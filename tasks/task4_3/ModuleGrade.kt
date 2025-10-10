import kotlin.system.exitProcess
import kotlin.math.roundToInt


fun main(args: Array<String>) {
    if (args.size !=3) {
        println("Error, three arguments required")
        exitProcess(1)
    } 

    val grade1 = args[0].toInt()
    val grade2 = args[1].toInt()
    val grade3 = args[2].toInt()
    val total = grade1 + grade2 + grade3
    var avg = (total / 3.0).roundToInt()
        



    val grade = when (avg) {
        in 0..39 -> "Fail" 
        in 40..69 -> "Pass" 
        in 70..100 -> "Distinction" 
        else -> "?" 
    }

    println(avg)
    println(grade)

}