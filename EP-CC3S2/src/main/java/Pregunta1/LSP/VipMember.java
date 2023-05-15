package Pregunta1.LSP;

public class VipMember extends Member implements joinTournament,organizeTournament {
    String nombre;
    public VipMember(String nombre){
        super(nombre);
    }

    @Override
    public void joinTournament() {
        System.out.println("Uniendose"+nombre);
    }
    @Override
    public void organizeTournament() {
        System.out.println("Organizando "+nombre);
    }

}