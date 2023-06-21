public class main {
    public static void main(String[] args){
        contarClumps cuenta = new contarClumps();

        int[] arreglo = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int numGrupos = cuenta.contar(arreglo);
        System.out.println("Número de clumps(Grupos): " + numGrupos);

    }
}
