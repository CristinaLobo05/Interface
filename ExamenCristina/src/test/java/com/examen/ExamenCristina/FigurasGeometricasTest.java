package com.examen.ExamenCristina;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FigurasGeometricasTest {

    @Test
    public void testAreaCuadrado() {
        double resultado = FigurasGeometricas.calcularAreaCuadrado(4);
        assertEquals(16.0, resultado, "El área de un cuadrado con lado 4 es 16");
    }

    @Test
    public void testPerimetroCuadrado() {
        double resultado = FigurasGeometricas.calcularPerimetroCuadrado(4);
        assertEquals(16.0, resultado, "El perímetro de un cuadrado con lado 4 es 16");
    }

    @Test
    public void testAreaRectangulo() {
        double resultado = FigurasGeometricas.calcularAreaRectangulo(5, 3);
        assertEquals(15.0, resultado, "El área de un rectángulo con base 5 y altura 3 es 15");
    }

    @Test
    public void testPerimetroRectangulo() {
        double resultado = FigurasGeometricas.calcularPerimetroRectangulo(5, 3);
        assertEquals(16.0, resultado, "El perímetro de un rectángulo con base 5 y altura 3 es 16");
    }

    @Test
    public void testAreaCirculo() {
        double resultado = FigurasGeometricas.calcularAreaCirculo(3); 
        assertEquals(Math.PI * 3 * 3, resultado, 0.001, "El área de un círculo con radio 3 es Pi * 9");
    }

    @Test
    public void testPerimetroCirculo() {
        double resultado = FigurasGeometricas.calcularPerimetroCirculo(3); 
        assertEquals(2 * Math.PI * 3, resultado, 0.001, "El perímetro de un círculo con radio 3 es 2 * Pi * 3");
    }
}
