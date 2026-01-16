package ejercicio5

fun main() {
    val portatil = Producto("Laptop Gaming", 1200.0, 10)
    println(portatil)

    portatil.reabastecer(5)
    println(portatil)

    portatil.vender(3)
    println(portatil)

    try {
        portatil.vender(50)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        val productoMalo = Producto("Pan", -1.50, 50)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }

    try {
        val productoMalo2 = Producto("Leche", 0.90, -10)
    } catch (e: IllegalArgumentException) {
        println("ERROR: ${e.message}")
    }
}