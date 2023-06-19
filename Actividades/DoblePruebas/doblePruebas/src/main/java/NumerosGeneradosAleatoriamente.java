import java.util.random.RandomGenerator;

public class NumerosGeneradosAleatoriamente implements NumerosAleatorios{
    private final RandomGenerator rnd = RandomGenerator.getDefault();
    @Override
    public int nextInt(int upperBoundExclusive){
        return rnd.nextInt(upperBoundExclusive);
    }
}
