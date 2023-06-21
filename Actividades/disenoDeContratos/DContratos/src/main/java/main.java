public class main {
    public static void main(String[] args){
        //===============
        double a = 90;
        double b = -45;
        double c = 135;
        Triangulo trian = new Triangulo();
        TriangleType resultado = trian.reportTriangle(a,b,c);
        //System.out.println(resultado);


        //===============
        //char letra = '@';
        char letra = 'E';// como borre la "e" de "vowels", sale false, eso er violacion de la postcondicion
        Vocal vocal = new Vocal();
        boolean resultado2 = vocal.isVowel(letra);
        System.out.println(resultado2);

    }
}
