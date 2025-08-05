package com.bagxxi.calculadorapropinas.utils



object CalculadoraUtils {
    fun calcularPropina(monto: Double, porcentaje: Double): Double {
        if (monto < 0 || porcentaje < 0) {
            return 0.0
        }
        return monto * (porcentaje / 100)
    }
}
