package Pregunta1.LSP;

public class FreeMember extends Member implements joinTournament{
    String nombre;
    public FreeMember(String nombre){
        super(nombre);
    }
    @Override
    public void joinTournament() {
        System.out.println(".."+nombre);
    }

    /**
     * Este metodo no deberia existir aqui, porque el es MiembroLibre,
     * para eso creamos una interfaz donde estaran los metodos cuando pueden
     * organizar o unirse.
     */
    /*
    @Override
    public void organizeTournament() {
        System.out.println();
    }
     */

}