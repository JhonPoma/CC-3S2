public class Triangulo {

    /**
     *
     * @param a, angulo a > 0
     * @param b, angulo b > 0
     * @param c, angulo c > 0 ; a+b+c=180.
     * @return  RIGHT,   if a = 90 or b = 90 or c = 90;
     *          OBTUSE,  if a > 90 or b >=90 or c > 90
     *          else ACUTE
     */
    public TriangleType reportTriangle(double a, double b, double c){
        if(a<0 || b<0 || c<0){
            return TriangleType.ERROR;
        }
        if(a==90 || b==90 || c==90){
            return TriangleType.RIGHT;
        }
        if (a>90||b>90||c>90) {
            return TriangleType.OBTUSE;
        }
        else{
            return TriangleType.ACUTE;
        }
    }

    public static void main(String[] args){
        double a = 90;
        double b = -45;
        double c = 135;

        Triangulo trian = new Triangulo();
        TriangleType result = trian.reportTriangle(a,b,c);
        System.out.println(result);

    }

}

