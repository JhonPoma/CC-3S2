//En lugar de lanzar una excepción, podríamos escribir assert
//La máquina virtual de Java (JVM) generará un AssertionError.
public class TaxCalculator1 {
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
            //throw new RuntimeException("El valor ingresado es negativo");
            assert valor>=0 : "valor no puede ser negativo";
        }

        double taxValor = 0;
        /*
        La postcondición también se implementa como un if. Si algo sale mal, lanzamos
        una excepción, alertando al consumidor que la postcondición no se cumple:
        */
        if(taxValor < 0){
            //throw new RuntimeException("...");
            assert taxValor >= 0 : "El resultado no puede ser negativo";
        }
        return taxValor;
    }
}
//Tambien puedo dejar de usar los "if", solo me quedo con los asserts.