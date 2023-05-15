package Pregunta1.LSP;

public class VipMember implements joinTournament,organizeTournament {
    String nombre;
    public VipMember(String nombre){
        this.nombre = nombre;
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
