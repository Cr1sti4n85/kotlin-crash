fun checkNullability() {
    println("Ingresa algun dato")
    val input = readln()

    //si input es nulo se asigna el valor 0
    val inputAsInteger = input.toIntOrNull() ?: 0

    val isEven = inputAsInteger % 2 == 0

    println("is it even: $isEven")

    //null safety operator
    println("Ingresa algun dato")
    val newNum = readln()
    val newInputasInteger = newNum.toIntOrNull()?.inc()

    println("The incremented number is $newInputasInteger")

    
}