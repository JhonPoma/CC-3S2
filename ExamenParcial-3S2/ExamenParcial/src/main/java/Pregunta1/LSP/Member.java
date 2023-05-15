package Pregunta1.LSP;

public class Member  {
    private final String nombre;

    public Member(String nombre) {
        this.nombre = nombre;
    }
    PremiumMember premiun = new PremiumMember("Abejita Azul");
    VipMember vip = new VipMember("Kaperucita Feliz");
    FreeMember free = new FreeMember("Inspectora Motita");

    }
}
