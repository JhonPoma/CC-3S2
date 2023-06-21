import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class contarTest {
    @Test
    public void contarExitoso(){
        contarClumps cuenta = new contarClumps();
        int[] arreglo = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int numGrupos = cuenta.contar(arreglo);
        Assertions.assertEquals(3,numGrupos);
    }

    @Test
    public void violaPrecondicion(){
        contarClumps cuenta1 = new contarClumps();
        int[] arreglo = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int numGrupos = cuenta1.contar(arreglo);
        Assertions.assertEquals(3,numGrupos);
    }

}
