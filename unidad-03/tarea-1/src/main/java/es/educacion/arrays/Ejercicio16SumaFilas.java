package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio16SumaFilas {
    private Ejercicio16SumaFilas() { }

    public static void main(String[] args) {
        int [][] matriz = {{1,2,3}, {4,5}, {1,2}};
        System.out.println("Suma de cada fila: " + Arrays.toString(sumarFilas(matriz)));
    }
    /**
     * Devuelve un array con la suma de cada fila
     * Si la matriz o alguna fila es null da error
     * @param matriz int[][] matriz de numeros
     * @return int [] suma de cada fila
     */

    public static int[] sumarFilas(int[][] matriz) {
        if(matriz == null ){
            throw new IllegalArgumentException();
        }


        int[] resultado = new int [matriz.length];
        for( int i =0; i < matriz.length; i++){
            int sumaFila = 0;
            int[] fila = matriz[i];
            if(fila == null) {
                throw new IllegalArgumentException();
            }
            /**
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila = sumaFila +j;
            }
             **/
            for (int columna:fila){
                sumaFila += columna;
            }
            resultado[i] = sumaFila;
        }
        return resultado;
    }
}
