package produccion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//clase que nos permitira grabar una partida
public class GameRecorder{
    private BufferedWriter escribir;
    private boolean grabarJuego;// nos servira para validar si hicimos CLICK en el botonGrabar
    private String nombreArchivo = "grabacionDeMovimientos.txt";

    public GameRecorder() {
        grabarJuego = false;//lo iniciamos como "false" porque aun no hicimos "click"
    }

    /**
     * El boton grabar de la interfaz, esta desactivada
     * al comienzo, con esto lo activamos.
     */
    public void cambiarGrabarJuego(){//Verifica y cambia de valor a TRUE si hicimos click
        grabarJuego = !grabarJuego;
    }

    /**
     * Grabamos el movimiento en un archivo de texto
     * @param jugador Turno del jugador
     * @param fila fila de la jugada realizada
     * @param columna columna de la jugada realizada
     * @param Vcelda valor de la celda en la jugada realizada
     * @param estado valor del estado del juego : "empate", "gano_rojo", "gano_azul".
     */
    public void grabarMovimiento(String jugador, int fila, int columna, Celda Vcelda, EstadoJuego estado) {
        cambiarGrabarJuego();
        String estadito = String.valueOf(estado);//convierto a string para ver de quien es su turno
        if (grabarJuego) { //si grabar juego es "TRUE"
            try {
                escribir = new BufferedWriter(new FileWriter(nombreArchivo,true));
                escribir.write("Turno: "+jugador+"\tMovimiento:[" + fila + "][" + columna +"]" );
                escribir.write("\tValorCelda: [" + Vcelda +"]");
                if(!estadito.equals("JUGANDO") ){
                    escribir.write("\nEstadoJuego: "+ estadito+ "\n");
                }
                escribir.newLine();
                escribir.flush();
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al iniciar la grabación del juego.");
            }
        }
    }
}