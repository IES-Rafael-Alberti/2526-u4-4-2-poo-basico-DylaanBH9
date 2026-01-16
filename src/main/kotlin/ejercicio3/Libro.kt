package ejercicio3

class Libro(private val titulo: String, private val autor: String, private val numPaginas: Int, private var leido: Boolean) {
    init {
        require(titulo.isNotEmpty()) { "El título no puede estar vacío" }
        require(autor.isNotEmpty()) { "El autor no puede estar vacío" }
        require(numPaginas in 1..5000) { "El número de páginas debe ser positivo y no mayor a 5000" }
    }

    constructor(titulo: String, autor: String) : this(titulo, autor, 100, false)

    override fun toString(): String {
        val leidoString = if (leido) "Si" else "No"
        return "Libro: $titulo por $autor, Páginas: $numPaginas, Leído: $leidoString."
    }
}