package Pregunta2;
public class TicTacToe {
    private static final int TOTALROWS = 3;
    private static final int TOTALCOLUMNS = 3;

    public enum Cell {
        EMPTY, CROSS, NOUGHT
    }
    private Cell[][] grid;
    public char turn = 'X' ; //actual jugador
    public char TurnJugador(){
        return turn;
    }
    public TicTacToe(){
        iniciandoTablero();
    }
    public enum GameState {//enum del estado del juego
        PLAYING, DRAW, CROSS_WON, NOUGHT_WON
    }

    public void verificar(int x, int y) {
        if( (x<0 && x>TOTALROWS) || (y<0 && y>TOTALCOLUMNS)){
            throw new RuntimeException();
        }
    }
    private void iniciandoTablero() {
        grid = new Cell[TOTALROWS][TOTALCOLUMNS];
        for (int row = 0; row < TOTALROWS; ++row) {
            for (int col = 0; col < TOTALCOLUMNS; ++col) {
                grid[row][col] = Cell.EMPTY;
            }
        }
    }

    public void jugar(int row, int col) {
        if(grid[row-1][col-1] == Cell.EMPTY) {
            grid[row - 1][col - 1] = (turn == 'X') ? Cell.CROSS : Cell.NOUGHT;
            turn = (turn == 'X') ? 'O' : 'X';
        }
    }

    public void cambiarTurno() {
        if (turn == 'X')
            turn = 'O';
        else
            turn = 'X';
    }

}


