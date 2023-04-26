package prueba;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import produccion.JuegoGeneral;
import produccion.JuegoSimple;

public class TestComienzaJuego {

  @Test
  public void testComienzaJuegoSimpleConTamanioSeleccionado() {
    var juegoSimple = new JuegoSimple(5);
    juegoSimple.realizarMovimiento(0, 0, JuegoSimple.Celda.S);
    assertEquals(JuegoSimple.Celda.S, juegoSimple.getCelda(0, 0));
  }

  @Test
  public void testComienzaJuegoGeneralConTamanioSeleccionado() {
    var juegoGeneral = new JuegoGeneral(9);
    juegoGeneral.realizarMovimiento(2, 2, JuegoGeneral.Celda.O);
    assertEquals(JuegoGeneral.Celda.O, juegoGeneral.getCelda(2, 2));
  }
}
