package Pregunta1.noLSP;

public class PremiumMember extends Member {
    public PremiumMember(String nombre){
        super(nombre);
    }

    /**
     * Sobrescribimos el metodo joinTournament
     */
    @Override
    public void joinTournament() {
        System.out.println("");
    }

    @Override
    public void organizeTournament() {

    }

}
