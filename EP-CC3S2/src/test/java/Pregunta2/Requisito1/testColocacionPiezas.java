package Pregunta2.Requisito1;

import Pregunta2.TicTacToe;
import Pregunta2.TicTacToe.Cell;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testColocacionPiezas {
    TicTacToe tictactoe;

    @Test
    public void cuandoPiezaSeColocaFueraDelEjeX(){
        Exception exception = assertThrows(RuntimeException.class,
                () -> { new TicTacToe();
                        tictactoe.verificar(5,2);
                      });
    }
    @Test
    public void cuandoPiezaSeColocaFueraDelEjeY(){
        Exception exception = assertThrows(RuntimeException.class,
                () -> { new TicTacToe();
                        tictactoe.verificar(1,5);
                });
    }

}
