// Task 5.2.1: geometric properties of circles

import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius


fun circlePerim(radius: Double) = PI * radius * 2


fun readDouble(prompt: String) : Double {
    println(prompt)
    return readln().toDouble()
}

fun main() {
    val prompt = "Please Enter The Radius:"
    val radius = readDouble(prompt)
    val area = circleArea(radius)
    val perim = circlePerim(radius)
    println("The Area is: $area")
    println("The Circumference is: $perim")
}