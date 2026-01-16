package ejercicio2

class Vehiculo(private var marca: String, private var modelo: String, private var kilometraje: Double = 0.0) {
    fun registrarKilometraje(kilometros: Double) {
        this.kilometraje += kilometros
    }

    override fun toString(): String {
        return "Vehiculo(marca: $marca, modelo: $modelo, kilometraje: $kilometraje)"
    }
}