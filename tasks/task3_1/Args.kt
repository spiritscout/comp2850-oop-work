import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size !=2) {
        println("Error, two arguments required")
        exitProcess(1)
    } else {
        println(args[0])
        println(args[1])
    
    }
    
    
    


}