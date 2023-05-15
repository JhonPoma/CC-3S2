package Pregunta1.noLSP;
import java.util.List;

public abstract class Member {
    private final String nombre;

    public Member(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public abstract void joinTournament();
    public abstract void organizeTournament();

    List<Member> miembros = List.of(
            new PremiumMember("Abejita Azul"),
            new VipMember("Kaperucita Feliz"),
            new FreeMember("Inspectora Motita")
    );

}
