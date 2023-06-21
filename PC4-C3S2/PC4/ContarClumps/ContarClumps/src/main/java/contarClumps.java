
public class contarClumps {
    /**
     *Cuenta cuantos grupos hay
     * @param array Longitud > 0 y array no nulo,
     * @return Si Lon_arreglo = 0  o nula ,return 0
     *         Else cantidad de grupos.
     */
    public int contar(int[] array){
        // verificamos las PreCondiciones
        if(array.length==0 || array == null ){
            return 0;
        }
        int grupos = 0;
        int i = 0;
        while( i < array.length){
            int contador = 1;
            while (i + 1 < array.length && array[i] == array[i + 1]) {
                contador++;
                i++;
            }
            if(contador >= 2){
                grupos ++;
            }
            i++;
        }
        return grupos;
    }
}


















