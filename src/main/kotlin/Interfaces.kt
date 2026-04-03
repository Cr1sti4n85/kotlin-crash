import kotlin.math.PI

interface Shape {
    val area: Double
    val diameter: Double
}

//implementing interface on data class
data class EquilateralTriange(val base: Double, val height: Double): Shape {

    override val area = base.times(height) / 2

    //get() es similar al getter de java
    override val diameter: Double
        get() = base * 3
}

data class Circle(val radius: Double): Shape {
    override val area: Double
        get() = radius * radius * PI
    override val diameter: Double
        get() = 2 * radius * PI

}

fun applyingInterface( ){
    val acuteTriange = EquilateralTriange(9.0, 12.0)
    println(acuteTriange.area)
    println(acuteTriange.diameter)

    val circle = Circle(10.0)
    println(circle.area)
    println(circle.diameter)

    println("La suma de las areas de estos dos es: ${sumAreas(acuteTriange, circle)}")

}

fun sumAreas(vararg shapes: Shape): Double {
    for ((i, element) in shapes.withIndex()) {
        val output = when (element){
            is Circle -> "El objeto en la posicion $i es un circulo"
            is EquilateralTriange -> "El objeto en la posicion $i es un triangulo equilatero"
            else -> "Otro"
        }
        println(output)

    }
    return shapes.sumOf { shape -> shape.area }
}