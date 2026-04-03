//data object permite crear una unica instancia del objeto
//no tiene constructor

interface Shapes {
    val area: Double
    val diameter: Double
}


data object FixSizeSquare: Shapes {
    override val area = 64.0
    override val diameter = 32.0
}

fun singletonExample(){
    FixSizeSquare.area
}