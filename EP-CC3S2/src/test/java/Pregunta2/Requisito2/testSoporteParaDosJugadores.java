package Pregunta2.Requisito2;

import Pregunta2.TicTacToe;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testSoporteParaDosJugadores {
    TicTacToe tictactoe;
    @Test
    public void primerTurnoJugadorX(){
        tictactoe = new TicTacToe();
        assertEquals('X',tictactoe.TurnJugador());
    }

    @Test
    public void turnoDeOjustoDespuesDeX(){
        tictactoe = new TicTacToe();
        tictactoe.jugar(2,2);
        assertEquals('O',tictactoe.TurnJugador());
   }
    @Test
    public void turnoDeXjustoDespuesDe0(){
        tictactoe = new TicTacToe();
        tictactoe.jugar(2,2);
        tictactoe.jugar(1,1);
        assertEquals('X',tictactoe.TurnJugador());
    }


}
