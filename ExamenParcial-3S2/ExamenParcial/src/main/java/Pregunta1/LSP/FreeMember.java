package Pregunta1.LSP;


public class FreeMember implements joinTournament{

    String nombre;
    public FreeMember(String nombre){
        this.nombre = nombre;
    }

    /**
     * Sobrescribimos el metodo joinTournament
     */
    @Override
    public void joinTournament() {
        System.out.println(".."+nombre);
    }

    /**
     * Este metodo no deberia existir aqui, porque el es MiembroLibre,
     * para eso creamos una interfaz donde estaran los metodos cuando pueden organizar o unirse.
     * no puede organizar
     */
    /*
    @Override
    public void organizeTournament() {
        System.out.println();
    }
        */

}
