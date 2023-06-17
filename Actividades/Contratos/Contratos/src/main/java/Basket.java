/*                  INVARIANTES
A las condiciones que siempre deben cumplirse antes y después de
la ejecución de un método se llaman invariantes.
Un invariante es por lo tanto, una condición que se mantiene
durante toda la vida útil de un objeto o una estructura de datos.
 */

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private Map<Product, Integer> basket = new HashMap<>();

    /**
     * Añadimos a la canasta una cantidad de cierto producto
     * @param product producto
     * @param qtyToAdd cantidad de a añadir tiene que ser mayor que cero
     */
    public void add(Product product, int qtyToAdd){//qty: cantidad

    }
    public void remove(Product product){

    }
    private boolean invariant(){
        return valorTotal.compareTo(BigDecimal.ZERO) >= 0;
    }

}
