package Pregunta1.LSP;

public class PremiumMember extends  Member implements joinTournament,organizeTournament{
    String nombre;

    public PremiumMember(String nombre) {
        super(nombre);
    }
    @Override
    public void joinTournament(){
        System.out.println("Uniendose"+nombre);
    }
    @Override
    public void organizeTournament() {
        System.out.println("Organizando "+nombre);
    }
}
