open class Animal(val name: String){
    open fun run() {
        println("${this.name} is running fast")
    }

    open fun eat() {
        println("${this.name} is eating leaves and vegetables")
    }
}

class Cow(name: String) : Animal(name) {
    override fun run(){
        println("${this.name} runs quite slowly")
    }
}

fun openClasses(){
    val cow = Cow("Margarita")
    val animal = Animal("coyote")
    cow.run()
    cow.eat()

    animal.run()
}