public class main {
    public static void main(String[] args){
        double a = 90;
        double b = -45;
        double c = 135;
        Triangulo trian = new Triangulo();
        TriangleType resultado = trian.reportTriangle(a,b,c);
        System.out.println(resultado);




    }
}
