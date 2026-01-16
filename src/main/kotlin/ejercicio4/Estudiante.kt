package ejercicio4

class Estudiante(private var nombre: String) {
    var nota: Double = 0.0
        set(value) {
            if (value in 0.0..10.0) {
                field = value
            } else {
                println("ERROR: La nota debe estar entre 0 y 10")
            }
        }

    override fun toString(): String {
        return "Estudiante: $nombre, Nota: $nota"
    }
}