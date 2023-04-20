package Main;
import java.lang.*;
public class CalculadoraSimple {
    private boolean status;
    public CalculadoraSimple(){
        this.status = true;
    }
    public boolean getStatus(){
        return status;
    }


    public  int addition(int a, int b){
        return a+b;
    }
    public  int resta(int a, int b){
        return a-b;
    }
    public int division(int a,int b){
        if(b==0){
            throw new IllegalArgumentException("Nose puede dividir por cero");
        }
        else{
            return a/b;
        }
    }

    //
    public int multiplicacion(int a, int b){
        return a*b;
    }
    public double RaizCuadrada(int a){
        if(a < 0){
            throw new IllegalArgumentException("No se puede de un Negativo");
        }
        else{
            return Math.sqrt(a);
        }
    }
    public double Porcentaje(int a , int b){
        if(b < 0){
            throw new IllegalArgumentException("No se puede de un Negativo");
        }
        else{
            return a*b/100;
        }


    }
}
