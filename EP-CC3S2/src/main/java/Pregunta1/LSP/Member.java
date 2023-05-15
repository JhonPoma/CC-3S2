package Pregunta1.LSP;

public abstract class Member {
    private final String nombre;

    public Member(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    PremiumMember premiun = new PremiumMember("Abejita Azul");
    VipMember vip = new VipMember("Kaperucita Feliz");
    FreeMember free = new FreeMember("Inspectora Motita");
    }


