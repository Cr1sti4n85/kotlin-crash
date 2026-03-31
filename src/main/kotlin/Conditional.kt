fun conditionalFunction() {
    //you can assign a value based on conditional
    print("Ingresa un numero decimal o entero")
    val input = readln()

    val result = if (input.contains(".")) {
        "decimal"
    } else {
        "entero"
    }

    println("El numero ingresado es $result")
}