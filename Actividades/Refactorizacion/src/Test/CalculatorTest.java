package Test;

import Main.CalculadoraSimple;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private static CalculadoraSimple calculadora;

    @BeforeAll
    public static void init(){
        calculadora = new CalculadoraSimple();
    }

    //1 prueba assertTrue
    @Test
    public void whenCalculatorInitializedTheReturnTrue(){
        //CalculadoraSimple calculadora = new CalculadoraSimple();
        assertTrue(calculadora.getStatus());
    }

    // 2prueba, assertEquals
    @Test
    public void whenAdditionTwoNumberThenCorrectAnswer(){
        //CalculadoraSimple calculadora = new CalculadoraSimple();
        assertEquals(5,calculadora.addition(2,3));
    }

    @Test
    public void cuandoRestoDosNumerosEntoncesRespuestaCorrecta(){
        assertEquals(6,calculadora.resta(8,2));
    }

    //3Prueba
    @Test
    public void whenDivisionThenReturnCorrectAnswer(){
        assertEquals(2,calculadora.division(8,4));
    }
    @Test
    public void whenDivisionByZeroThenTrownException(){
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
            calculadora.division(5,0);
        });
        assertEquals("Nose puede divider por cerO",exception.getMessage());
    }

    @Test
    public void cuandoMultiplicasDosNumerosEntoncesRespuestaCorrecta(){
        assertEquals(8,calculadora.multiplicacion(1,8));
    }
    @Test
    public void cuandoSacoRaizCuadradaEntoncesRespuestaCorrecta(){
        assertEquals(3,calculadora.RaizCuadrada(9));
    }
    @Test
    public void cuandoSacoRaizCuadradaNumeroNegativoEntoncesLanzarExcepcion() {
        Throwable excepcion = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.RaizCuadrada(-1);
        });
        assertEquals("Nose puede sacar raiz de un Negativo", excepcion.getMessage());
    }
    @Test
    public void cuandoSacoPorcentajeEntoncesRespuestaCorrecta(){
        assertEquals(20,calculadora.Porcentaje(100,20));
    }
    @Test
    public void cuandoSacoPorcentajeEntoncesLanzarExcepcion() {
        Throwable excepcion = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.Porcentaje(100,-20);
        });
        assertEquals("Nose puede porcentaje Negativo", excepcion.getMessage());
    }
}


