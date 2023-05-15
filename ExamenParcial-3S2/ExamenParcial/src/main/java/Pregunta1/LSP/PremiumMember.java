package Pregunta1.LSP;

public class PremiumMember implements joinTournament,organizeTournament{
    String nombre;
    public PremiumMember(String nombre){
        this.nombre=nombre;
    }

    /**
     * Sobrescribimos el metodo joinTournament
     */
    @Override
    public void joinTournament() {
        System.out.println("Uniendose"+nombre);
    }
    @Override
    public void organizeTournament() {
        System.out.println("Organizando "+nombre);
    }

}
