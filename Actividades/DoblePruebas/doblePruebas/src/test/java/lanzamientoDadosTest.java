import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class lanzamientoDadosTest {
    @Test
    public void producesMensaje(){
        var stub = new StubNumeroAleatorio();
        var lanzado = new LanzamientoDados(stub);
        var actual = lanzado.asText();
        assertThat(actual).isEqualTo("Sacastes un 5");
    }
}
