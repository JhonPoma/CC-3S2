/*
Clase que maneja el cálculo de un impuesto específico.
De los requisitos de esta clase, el cálculo solo
tiene sentido para números positivos
* */
public class TaxCalculator {
    //PRECONDICION: que no acepta numeros negativos.
    //POSTCONDICION: que este metodo no devuelva numeros negativos.

    //Documentacion para una precondicion y postcondicion
    /**
     * Realizar una calculo de impuesto especifico
     * @param valor Debe ser mayor que cero (no negativo)
     * @return El resultado del calculo de impuesto. Es mayor que cero
     * @throws IllegalArgumentException Si las precondiciones no se cumplen
     */
    public double calculateTax(double valor){
        if(valor < 0){
            throw new RuntimeException("El valor ingresado es negativo");
        }

        double taxValor = 0;
        /*
        La postcondición también se implementa como un if. Si algo sale mal, lanzamos
        una excepción, alertando al consumidor que la postcondición no se cumple:
        */
        if(taxValor < 0){
            throw new RuntimeException("...");
        }
        return taxValor;
    }

}
//En lugar de lanzar una excepción, podríamos escribir assert.
//Ese ejemplo lo veremos en la clase TaxCalculator1.java

//OBS:
/*          Precondiciones Debiles
Las precondiciones más débiles facilitan que otras clases
invoquen el método. Después de todo, sin importar el
valor que le pases a calculateTax, el programa devolverá algo.
Esto contrasta con la versión anterior, donde un número
negativo arroja un error.
 */