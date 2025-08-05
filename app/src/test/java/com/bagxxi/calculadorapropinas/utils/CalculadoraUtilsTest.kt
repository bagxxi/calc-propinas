package com.bagxxi.calculadorapropinas.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculadoraUtilsTest {

    @Test
    fun calcularPropina_calculoCorrecto() {
        val monto = 100.0
        val porcentaje = 15.0
        val propinaEsperada = 15.0
        val propinaCalculada = CalculadoraUtils.calcularPropina(monto, porcentaje)
        assertEquals(propinaEsperada, propinaCalculada, 0.01)
    }

    @Test
    fun calcularPropina_montoCero() {
        val monto = 0.0
        val porcentaje = 15.0
        val propinaEsperada = 0.0
        val propinaCalculada = CalculadoraUtils.calcularPropina(monto, porcentaje)
        assertEquals(propinaEsperada, propinaCalculada, 0.01)
    }

    @Test
    fun calcularPropina_porcentajeCero() {
        val monto = 100.0
        val porcentaje = 0.0
        val propinaEsperada = 0.0
        val propinaCalculada = CalculadoraUtils.calcularPropina(monto, porcentaje)
        assertEquals(propinaEsperada, propinaCalculada, 0.01)
    }

    @Test
    fun calcularPropina_montoNegativo() {
        val monto = -100.0
        val porcentaje = 15.0
        val propinaEsperada = 0.0
        val propinaCalculada = CalculadoraUtils.calcularPropina(monto, porcentaje)
        assertEquals(propinaEsperada, propinaCalculada, 0.01)
    }

    @Test
    fun calcularPropina_porcentajeNegativo() {
        val monto = 100.0
        val porcentaje = -15.0
        val propinaEsperada = 0.0
        val propinaCalculada = CalculadoraUtils.calcularPropina(monto, porcentaje)
        assertEquals(propinaEsperada, propinaCalculada, 0.01)
    }
}
