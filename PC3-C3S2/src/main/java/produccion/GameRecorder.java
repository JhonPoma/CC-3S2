package produccion;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//clase que nos permitira grabar una partida
public class GameRecorder {
    private BufferedWriter writer;
    public boolean grabarJuego;// nos servira para validar si hicimos CLICK en el botonGrabar
    private String fileName = "Grabacion.txt";


    public GameRecorder() {
        grabarJuego = false;//lo iniciamos como "false" porque aun no hicimos "click"
    }
    public void cambiarGrabarJuego(){//Verifica y cambia de valor a TRUE si hicimos click
        grabarJuego = !grabarJuego;
        System.out.println("lo cambie a : "+grabarJuego+"##");

    }
    public void grabarMovimiento(String player, int row, int column, Celda Vcelda) {
        cambiarGrabarJuego();
        if (grabarJuego) { //si grabar juego es "TRUE"
            //System.out.println("TurnJugador: " + player + "--[" + row + "][" + column + "]");
            try {
                writer = new BufferedWriter(new FileWriter(fileName,true));
                writer.write("Turno: "+player+"\tMovimiento:[" + row + "][" + column+"]" );
                writer.write("\tValorCelda: [" + Vcelda +"]");

                writer.newLine();
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al iniciar la grabación del juego.");
            }

        }
    }
}




/////////


    /*
    public void startRecording() {
        // Create a file name based on the current date and time

    }

    private String generateFileName() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        return "JuegoSimple-humanVShuman_" + now.format(formatter) + ".txt";
    }

    // Add a method to record a movement in the game
    public void recordMovement(String player, int row, int column) {

        String fileName = generateFileName();
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al iniciar la grabación del juego.");
        }


        System.out.println("holaaa"+player+"--"+row+"--"+column);
        if (writer != null) {
            System.out.println("holaaa222");
            try {
                System.out.println("holaa3333");
                writer.write("Jugador: " + player + ", Fila: " + row + ", Columna: " + column);
                System.out.println("holaa44");
                writer.newLine();
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al grabar el movimiento.");
            }
        }
    }

    // Add a method to record the winner of the game
    public void recordWinner(String winner) {
        if (writer != null) {
            try {
                writer.write("Ganador: " + winner);
                writer.newLine();
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al grabar el ganador.");
            } finally {
                // Close the writer when recording is finished
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
    */



//###############################################################################
/*  FUNCIONA PERO CREA VARIOS TXT

        private BufferedWriter writer;
    public boolean grabarJuego;// nos servira para validar si hicimos CLICK en el botonGrabar
    private String fileName;


    public GameRecorder() {
        grabarJuego = false;//lo iniciamos como "false" porque aun no hicimos "click"
    }
    public void cambiarGrabarJuego(){//Verifica y cambia de valor a TRUE si hicimos click.
        //this.grabarJuego = valor;
        grabarJuego = !grabarJuego;
        System.out.println("lo cambie a : "+grabarJuego+"##");
    }
    ////////////////////////////////////////////////////////
//    /////////////
    public void iniciarGrabacion(){
        fileName = generateFileName();
        try {
            writer = new BufferedWriter(new FileWriter(fileName,true));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al iniciar la grabación del juego.");
        }

    }
    public void grabarMovimiento(String player, int row, int column) {
        cambiarGrabarJuego();
        System.out.println("----"+ grabarJuego+"---");
        if (grabarJuego) { //si grabar juego es "TRUE"
            System.out.println("TurnJugador: " + player + "--[" + row + "][" + column + "]");


            iniciarGrabacion();
            System.out.println("holaaa"+player+"--"+row+"--"+column);
            if (writer != null) {
                System.out.println("holaaa222");
                try {
                    System.out.println("holaa3333");
                    writer.write("Jugador: " + player + ", Fila: " + row + ", Columna: " + column);
                    System.out.println("holaa44");
                    writer.newLine();
                    writer.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Error al grabar el movimiento.");
                }
            }

        }
    }

    private String generateFileName() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        return "Grabacion" + now.format(formatter) + ".txt";
    }

    public String getFileName(){
        return fileName;
    }



 */