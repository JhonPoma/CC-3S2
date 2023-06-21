import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class contarTest {


    /**
     * cuenta y verifica la cantidade de grupos en el arreglo
     */
    @Test
    public void contarExitoso(){
        contarClumps cuenta = new contarClumps();
        int[] arreglo = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int numGrupos = cuenta.contar(arreglo);
        Assertions.assertEquals(3,numGrupos);
    }

    /**
     * cuenta y verifica la precondicion,
     * en este caso la longitud es 0, por ello nos
     * debe retornar 0.
     */
    @Test
    public void cumplePrecondicion(){
        contarClumps cuenta1 = new contarClumps();
        int[] arreglo = {};
        int numGrupos = cuenta1.contar(arreglo);
        Assertions.assertEquals(0,numGrupos);
    }

    /**
     *  longitud del arreglo = 0, viola la precondicion establecida
     */
    @Test
    public void violaEsperado(){
        contarClumps cuenta1 = new contarClumps();
        int[] arreglo = {};
        int numGrupos = cuenta1.contar(arreglo);
        Assertions.assertEquals(3,numGrupos);
    }


}
