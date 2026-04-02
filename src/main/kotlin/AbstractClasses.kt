import kotlin.math.PI

abstract class ShapeClass {
    var shapesCreated = 0
    abstract fun area(): Double
    abstract fun diameter(): Double

    //method inherited by children
    fun countShapesCreated(): Int {
        return ++shapesCreated
    }
}

class Circulo(var radius: Double) : ShapeClass() {
    override fun area(): Double {
        return radius * radius * PI
    }

    override fun diameter(): Double {
        return 2 * radius * PI
    }
}

class Square(var side: Double): ShapeClass() {
    override fun area(): Double {
        return side * side
    }

    override fun diameter(): Double {
        return side * 4
    }

}

fun abstractClasses(){
    val circle = Circulo(10.0)
    println(circle.area())
    println(circle.diameter())

    val circle2 = Circulo(8.0)
    val circle3 = Circulo(8.0)

    println(circle.countShapesCreated())
    println(circle2.countShapesCreated())
    println(circle3.countShapesCreated())

    val square = Square(6.0)
    println(square.countShapesCreated())
}
