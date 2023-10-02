
    fun main() {
        val centralita = Centralita()

        val llamadaLocal = LlamadaLocal("123456", "789012", 60)
        val llamadaProvincial = LlamadaProvincial("234567", "890123", 120)
        val llamadaNacional = LlamadaNacional("345678", "901234", 180, 2)

        centralita.registrarLlamada(llamadaLocal)
        centralita.registrarLlamada(llamadaProvincial)
        centralita.registrarLlamada(llamadaNacional)

        centralita.mostrarLlamadasRealizadas()

        centralita.mostrarCostesTotales()
    }
