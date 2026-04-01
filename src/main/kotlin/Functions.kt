fun reverseString(){
    println("Ingresa una frase: ")
    val input = readln()
    val finalResult = reverse(input)
    println(finalResult)
}


fun reverse(stringToReverse: String): String{
    val finalString = buildString {
        for (letter in stringToReverse.lastIndex downTo  0){
            append(stringToReverse[letter])
        }
    }
    return finalString
}