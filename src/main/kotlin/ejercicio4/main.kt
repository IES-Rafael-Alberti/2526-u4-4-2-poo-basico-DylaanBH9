package ejercicio4

fun main() {
    val estudiante1 = Estudiante("Ana")
    estudiante1.nota = 8.5
    println(estudiante1)

    val estudiante2 = Estudiante("Luis")
    estudiante2.nota = 15.0
    println(estudiante2)

    estudiante2.nota = -2.0
    println(estudiante2)
}