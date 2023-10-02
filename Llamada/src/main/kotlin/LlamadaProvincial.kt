class LlamadaProvincial(nOrigen: String, nDestino: String, duracion: Int) : Llamada(nOrigen, nDestino, duracion) {
    override fun calcularCoste(): Double {
        return duracion * 0.15
    }
}