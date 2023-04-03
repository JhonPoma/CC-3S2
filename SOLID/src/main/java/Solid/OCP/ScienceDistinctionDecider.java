package Solid.OCP;

public class ScienceDistinctionDecider implements DistinctionDecider {
    @Override

    public void evaluateDistinction(Estudiante estudiante) {
        if (estudiante.score > 80) {
                System.out.println(estudiante.regNumber+" ha recibido una distincion en ciencias.");
        }
    }
}
