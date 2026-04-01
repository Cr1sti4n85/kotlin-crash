fun reverseString(){
    println("Ingresa una frase: ")
    val stringInput = readln()
//    val finalResult = reverse(input)
//    val finalStringResult = stringInput.reverse()
    val finalStringResult = stringInput.reverse(2)

    println("Ahora ingres un numero entero: ")
    val numInput = readln()
    val finalNumResult = numInput.reverse()
    println("Resultado de la frase: $finalStringResult")
    println("Resultado del número entero: $finalNumResult")
}


//fun reverse(stringToReverse: String): String{
//    val finalString = buildString {
//        for (i in stringToReverse.lastIndex downTo  0){
//            append(stringToReverse[i])
//        }
//    }
//    return finalString
//}

//Function extension: adds a new function to specific data type, eg String

fun String.reverse() : String{
    val finalString = buildString {
        //no se puede usar this solamente, porque this está referenciando a lo que hay dentro del bloque
        //y no al string que invoca a la función
        for (i in this@reverse.lastIndex downTo  0){
            append(this@reverse[i])
        }
    }
    return finalString
}

//Function overload: allows to use a function extension for other data types.
fun Int.reverse(): Int {
    return this.toString().reverse().toInt()
}

//Another function overload, similar to the first, except it receives one argument
fun String.reverse(value: Int): Int {
    return this.reverse().toInt() * value
}