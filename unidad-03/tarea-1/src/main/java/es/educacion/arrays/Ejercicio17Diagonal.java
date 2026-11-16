package es.educacion.arrays;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio17Diagonal {
    private Ejercicio17Diagonal() { }

    public static void main(String[] args) {
        int [][] matriz = {{3,9,4}, {4,2,5}, {8,6,6}};
        System.out.println("Suma de la diagonal: " +sumarDiagonal(matriz));
    }

    /**
     * Suma la diagonal de una matriz cuadrada
     * Si es null o no es cuadrada da error
     * @param matriz int[][] matriz cuadrada
     * @return int suma de la diagonal
     */
    public static int sumarDiagonal(int[][] matriz) {
        if(matriz==null){
            throw new IllegalArgumentException();
        }
        int resultado = 0;
        for (int i = 0; i < matriz.length ; i++) {
            int[] fila = matriz [i];
            if(fila==null || fila.length != matriz.length){
                throw new IllegalArgumentException();
            }
            resultado += fila [i];

        }
        return resultado;
    }
}
