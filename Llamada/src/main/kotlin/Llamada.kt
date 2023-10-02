

abstract class Llamada(val nOrigen: String, val nDestino: String, val duracion: Int) {
    abstract fun calcularCoste(): Double
}