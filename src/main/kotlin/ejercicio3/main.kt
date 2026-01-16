package ejercicio3

fun main() {
    val libroKotlin = Libro("Kotlin", "JetBrains", 427, true)
    val libroJava = Libro("Java", "James Gosling", 238, false)
    println(libroKotlin)
    println(libroJava)

    try {
        val libroPython = Libro("", "Pythons", 571, false)
        println(libroPython)
    } catch (e: IllegalArgumentException) {
        println("Error al crear el libro: ${e.message}")
    }


}