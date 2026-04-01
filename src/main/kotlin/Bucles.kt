fun loops() {
    print("Ingresa numero entero")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var sum = 0
    var i = 0
    while (i < amountOfNumbers) {
        print("Ingre el numero #${
            i + 1}")
        val number = readln().toIntOrNull() ?: continue
        sum += number
        i++
    }
    println(sum)
}

fun loops2() {
    print("Ingresa numero entero")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    val numbers = mutableListOf<Int>()
    var i = 0

    while (i < amountOfNumbers) {
        print("Ingre el numero #${
            i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers.add(number)
        i++
    }
    println(numbers)

}

fun loops3(){
    val amountOfNumbers = readln().toIntOrNull() ?: 0
    val numbers = mutableListOf<Int>()

    for (i in 0  until amountOfNumbers){
        print("Ingre el numero #${
            i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers.add(number)
    }
    println(numbers)

    for (i in numbers.lastIndex downTo 0){
        println(numbers[i])
    }

    for (num in numbers) {
        println(num)
    }

    for ((index, value) in numbers.withIndex()) {
        println("The number at index $index is $value")
    }

}