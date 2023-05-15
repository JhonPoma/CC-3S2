package Pregunta1.noLSP;

public class FreeMember extends Member {
    public FreeMember(String nombre){
        super(nombre);
    }

    /**
     * Sobrescribimos el metodo joinTournament
     */
    @Override
    public void joinTournament() {
        System.out.println("...");
    }

    /**
     * Este metodo no deberia existir aqui, porque el es MiembroLibre,
     * no puede organizar
     */

    @Override
    public void organizeTournament() {
        System.out.println();
    }


}
