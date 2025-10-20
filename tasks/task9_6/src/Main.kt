// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: filename required as sole argument")
        exitProcess(1)
    }
    val dataset = readData(args[0])
    val variance = variance(dataset)
    println(dataset.size)
    println("%.5f".format(variance))
}
