import javax.sql.rowset.Predicate

fun lambdaFunctions() {
    println("Ingresa un string compuesto de números y letras:")
    val input = readln()

    //"it" references the parameter the lamba takes. In this case
    //every character of the input
    val lettersOnly = input.filter { it.isLetter() }
    println(lettersOnly)

    val favoriteNums = intArrayOf(1,2,3,4,5,6,7,8,9)
    val evenNumbers = favoriteNums.filter {it % 2 == 0}

    println(evenNumbers)

    //defining a lambda manually. En este caso la lambda
    //recibe un char y retorna un booleano
    val lambaExample: (Char) -> Boolean = {it.isDigit()}

    val numbersOnly = input.filter(lambaExample)

    println(numbersOnly)

    //usando myFilter
    val lettersOnly2 = input.myFilter { it.isLetter() }

    println(lettersOnly2)
}

//Function extension
fun String.myFilter(funcion: (Char) -> Boolean): String{
    return buildString {
        for (char in this@myFilter){
            //si el caracter es letra se agrega al string final
            if (funcion(char)){
                append(char)
            }
        }
    }
}
