class LlamadaNacional(nOrigen: String, nDestino: String, duracion: Int, val franja: Int) :
    Llamada(nOrigen, nDestino, duracion) {
    override fun calcularCoste(): Double {
        return when (franja) {
            1 -> duracion * 0.20
            2 -> duracion * 0.25
            3 -> duracion * 0.30
            else -> 0.0
        }
    }
}