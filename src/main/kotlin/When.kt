fun whenFunction() {
    var num1 = 5
    var num2 = 10
    num1 *=num2 //num1 = 50
    num1-= 40 //num1 =10
   val output = when {
       num2 < num1 -> "El primer numero es mayor"
       num1 < num2 -> "El primer numero es menor"
       else -> "Son iguales"
   }

    println(output)

    //Passing the value as argument in when
    print("Ingresa numero entero")
    val input = readln()
    val intNum = input.toInt()
    val salida = when(intNum) {
        0 -> "Numero neutro"
        in 1..9 -> "Número natural"  //in operator allows for ranges
        in 10..99 -> "Numero de dos digitos"
        else -> "Numero de tres o mas digitos"
    }
    println(salida)
}