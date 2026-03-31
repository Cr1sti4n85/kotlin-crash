fun basicsOfKotlin() {
    //val -> valor constante no se puede reasignar
    val x = 'h'

    // var -> variable que si se puede reasignar
    var num = 3

    num *= 2
    println(x);
    println(num)

    //division -> deben ser doubles para que la division se haga efectiva
    val num1 = 5.0
    val num2 = 1.0

    println(num1 % 2 == num2)

    print(num1/num2)

    //string template
    println("If we multiply $num1 and $num we get ${num1 * num}")

    val odd = 5
    val even = 8

    val areBothEven = odd % 2 == 0 && even % 2 == 0
    println(areBothEven)

    //Input as integer
    print("Ingresa un numero: ")
    val input = readln()
    val toInt = input.toInt()

    val isEven = toInt % 2 == 0
    println("$input is even: $isEven")
}