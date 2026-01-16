package ejercicio1

class CuentaBancaria(private val titular: String, private var saldo: Double = 0.0) {

    fun ingresar(cantidad: Double) {
        if (cantidad <= 0) {
            println("ERROR: No puede ingresar una cantidad menor o igual a 0.")
        } else {
            this.saldo += cantidad
            println("Saldo después de la operación (ingresar): $saldo")
        }
    }

    fun retirar(cantidad: Double) {
        if (cantidad > this.saldo) {
            println("ERROR: No puede retirar una cantidad mayor a su saldo.")
        } else {
            this.saldo -= cantidad
            println("Saldo después de la operación (retirar): $saldo")
        }
    }
}