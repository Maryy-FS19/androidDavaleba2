import kotlin.math.sqrt

typealias P = Point

fun main() {
    val p1 = Point(7,5)
    val p2 = Point(-7,-10)

    val equalNums = p1 == p2
    val symmetry = p2.symmetricPoint()
    val distance = p2.betweenPoints(p1)

    println(equalNums)
    println(distance)
    println("$symmetry is the symmetric points of p2")

}
    //toString მეთოდი
data class Point(val x: Int, val y: Int){
        override fun toString(): String {
            val x = x.toString()
            val y = y.toString()

            return "$x $y"
        }


    //equals მეთოდი
    override fun equals(other: Any?): Boolean {
        if(other is Point) {
            return (other.x == this.x) && (other.y == this.y)
        }
        return false
    }

    //სიმეტრიულად გადატანის წერტილი
    fun symmetricPoint(): Int {
        return (-x -y)
    }

    //მანძილი ორ წერტილს შორის
        fun betweenPoints(point: Point): Double {
            val d = sqrt(((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y)).toDouble())
            return d
        }



    }









