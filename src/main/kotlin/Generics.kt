fun <T> List<T>.myCustomFilter(predicate: (T) -> Boolean): List<T>{
    val finalResult = mutableListOf<T>()
    for (element in this){
        if (predicate(element)) {
            finalResult.add(element)
        }
    }
    return finalResult.toList()
}

fun checkList(){
    val stringsList = listOf<String>(
        "Hola",
        "Adios",
        "Nos vemos",
        "hasta maniana"
    )

    val numberList = listOf<Int>(
        23, 45, 78, 12
    )

    val filteredStrings = stringsList.myCustomFilter { s ->
        s.length > 5
    }
    println(filteredStrings)

    val filteredNumbers = numberList.myCustomFilter { d ->
        d > 50
    }
    println(filteredNumbers)
}

//Ejemplo sealed interface implementada en 2 data classes para enviar mensaje de exito o error
//utilizando dos genericos
sealed interface Result<out T,out U> {
    data class Success<T>(val data: T): Result<T, Nothing>
    data class Failure<U>(val error: U): Result<Nothing, U>
}

fun getUser(): Result<String, String>{
    return if (Math.random() > 0.5) {
        Result.Success("Cristian")
    } else {
        Result.Failure("Error al obtener usuario")
    }
}

fun generics() {
    when (val result = getUser()) {
        is Result.Success -> println(result.data)
        is Result.Failure -> println(result.error)
    }
}