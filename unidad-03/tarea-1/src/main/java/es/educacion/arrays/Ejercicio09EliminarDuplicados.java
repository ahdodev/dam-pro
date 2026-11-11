package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase para quitar los numeros repetidos de un array.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio09EliminarDuplicados {
    private Ejercicio09EliminarDuplicados() { }

    /**
     * Programa principal con un ejempl
     */
    public static void main(String[] args) {
        int[] numeros = {3, 1, 3, 2, 1, 4};
        int[] sinRepetidos = sinDuplicados(numeros);
        System.out.println("Sin repetidos: " + Arrays.toString(sinRepetidos));
    }

    /**
     * Devuelve un array nuevo sin numeros repetidos.
     * Si es null da error.
     * @param numeros int[] array con posibles repetidos
     * @return int[] array nuevo sin repetidos
     */
    public static int[] sinDuplicados(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }
        int[] temporal = new int[numeros.length];
        int cantidad = 0;
        // |3|1|3|2|1|4|
        // |3|1|2|4|
        for (int numero : numeros) {
            boolean repetido = false;
            for (int i = 0; i < cantidad; i++) {
                if (temporal[i] == numero) {
                    repetido = true;
                }
            }
            if (!repetido) {
                temporal[cantidad] = numero;
                cantidad++;
            }
        }
        return Arrays.copyOf(temporal, cantidad);
    }
}