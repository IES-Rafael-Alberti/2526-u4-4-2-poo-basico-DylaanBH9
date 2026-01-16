package ejercicio5

class Producto(private var nombre: String, private var precio: Double, private var stock: Int) {
    init {
        require(nombre.isNotEmpty()) { "El nombre no puede estar vacío" }
        require(precio >= 0) { "El precio debe ser positivo" }
        require(stock >= 0) { "El stock debe ser positivo" }
    }

    fun vender(cantidad: Int) {
        if (cantidad > 0 && this.stock >= cantidad) {
            this.stock -= cantidad
        } else {
            throw IllegalArgumentException("La cantidad debe ser mayor que 0.")
        }
    }

    fun reabastecer(cantidad: Int) {
        if (cantidad > 0) {
            this.stock += cantidad
        } else {
            throw IllegalArgumentException("La cantidad debe ser mayor que 0.")
        }
    }

    override fun toString(): String {
        return "Producto: $nombre, Precio: $precio$, Stock: $stock"
    }

}