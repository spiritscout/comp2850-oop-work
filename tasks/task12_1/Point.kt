import kotlin.math.hypot

class Point(var x: Double, var y: Double) {
    fun distance() = hypot(x, y)     
    fun distanceTo(other: Point) = hypot(x-other.x, y-other.y)               //Computes distance to origin

}




fun main() {
    

    print("Please enter the X coordinate: ")
    val x = readln().toDouble()

    print("Please enter the Y coordinate: ")
    val y = readln().toDouble()

    val p = Point(x, y)

    val q = Point(4.5, 7.0)
    
    println("Distance from origin: ${p.distance()}")
    println("Distance to (4.5, 7.0): ${p.distanceTo(q)}")


    

}