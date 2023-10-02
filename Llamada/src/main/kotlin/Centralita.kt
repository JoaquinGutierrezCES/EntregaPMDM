class Centralita {
    private val llamadas = ArrayList<Llamada>()

    fun registrarLlamada(llamada: Llamada) {
        llamadas.add(llamada)
    }

    fun mostrarLlamadasRealizadas() {
        for (llamada in llamadas) {
            println("Número Origen: ${llamada.nOrigen}, Número Destino: ${llamada.nDestino}, Duración: ${llamada.duracion} segundos, Coste: ${llamada.calcularCoste()} euros")
        }
    }

    fun mostrarCostesTotales() {
        var costoTotal = 0.0
        for (llamada in llamadas) {
            costoTotal += llamada.calcularCoste()
        }
        println("Coste total de las llamadas: $costoTotal euros")
    }
}
