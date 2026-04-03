//sealed interfaces o classes solo pueden implementarse en mi propio codigo o
//modulo.
sealed interface PeopleInterface {
    val edad: Int
    val peso: Int
}

class Man(): PeopleInterface {
    override val edad: Int
        get() = TODO("Not yet implemented")
    override val peso: Int
        get() = TODO("Not yet implemented")

}

class Woman(): PeopleInterface {
    override val edad: Int
        get() = TODO("Not yet implemented")
    override val peso: Int
        get() = TODO("Not yet implemented")

}

fun workingWithSealed() {
    val man1 = Man()
    val woman1 = Woman()
    val man2 = Man()
    verify(man1, woman1, man2)
}



fun verify(vararg people: PeopleInterface): Unit {
    for (person in people) {
        //aqui no genera error, porque la interfaz se sealed, lo que significa que
        //no puede usarse mas que con las clases que implementan la interfaz y que son parte
        //del codigo. No es necesario poner un else al final por si se usara otra clase
        val output = when (person){
            is Man -> "Es un hombre"
            is Woman -> "es una mujer"
        }
        println(output)
    }
}

