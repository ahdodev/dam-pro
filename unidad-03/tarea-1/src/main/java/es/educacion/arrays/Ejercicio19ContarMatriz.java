package es.educacion.arrays;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio19ContarMatriz {
    public static void main(String[] args) {
        int [][] matriz = {{2,9,2}, {4,2,5}, {9,6,6}};
        System.out.println("El 2 sale: " +contar(matriz,2));
    }

    private Ejercicio19ContarMatriz() { }

    /**
     *Cuenta cuantas veces sale un numero en la matriz
     * Si la matriz o alguna fila es null da error
     * @param matriz int [][] matriz de numeros
     * @param objetivo obejtivo int numero que quiero contar
     * @return int veces que sale
     */
    public static int contar(int[][] matriz, int objetivo) {
        if (matriz==null){
            throw new IllegalArgumentException();
        }
        int resultado = 0;
        for (int i = 0; i < matriz.length ; i++) {
            int [] fila = matriz[i];
            if (fila == null){
                throw new IllegalArgumentException();
            }
            for (int columna : fila){
                if (columna == objetivo){
                    resultado++;
                }
            }

        }
        return  resultado;
    }
}
