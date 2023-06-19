public class LanzamientoDados {
    //EJEMPLO 2. refactorizando
    private final int NUMERO_DE_LADOS = 6;
    //  private final RandomGenerator rnd = RandomGenerator.getDefault();
    private final NumerosAleatorios rnd;

    public LanzamientoDados(NumerosAleatorios r){
        this.rnd = r;
    }

    public String asText(){
        int lanzado = rnd.nextInt(NUMERO_DE_LADOS) + 1;
        return String.format("Sacastes un %d",lanzado);
    }
}
