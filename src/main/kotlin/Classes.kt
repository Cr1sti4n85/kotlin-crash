import kotlin.math.sqrt

class Rectangle(val width: Float, val height: Float){
    val diagonal = sqrt(width * width + height * height)

    val area = width * height
}

fun maxArea(rest1: Rectangle, rect2: Rectangle): Float {
    val area1 = rest1.area
    val area2 = rect2.area

    return maxOf(area1, area2)
}

//Data classes

data class Point(val x: Float, val y: Float)

fun workingWithClasses(){
    val rect1 = Rectangle(10f, 6f)
    val rect2 = Rectangle(4f, 12f)

    println("El area maxima es: ${maxArea(rect1, rect2)}")

    val point1 = Point(10f, 5f)
    val point2 = Point(10f, 5f)

    //si comparamos dos objetos de data class, son iguales porque
    // se estan comparando sus valores internos, a diferencia de los
    //objetos de clases normales que comparan si ocupan el mismo espacio en memoria
    println(point1 == point2)

    //You can copy data class objects, creating an independent object
    val point3 = point2.copy(y = 10f)
    println(point3)
}