package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase para ordenar un array de menor a mayor sin tocar el original.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio07Ordenar {
    private Ejercicio07Ordenar() { }

    /**
     * Programa principal con un ejemplo.
     */
    public static void main(String[] args) {
        int[] numeros = {5, -2, 9, 1, 5};
        int[] ordenado = ordenar(numeros);
        System.out.println("Original: " + Arrays.toString(numeros));
        System.out.println("Ordenado: " + Arrays.toString(ordenado));
    }

    /**
     * Devuelve una copia del array ordenada de menor a mayor.
     * Si es null da error.
     * @param numeros int[] array que queremos ordenar
     * @return int[] array nuevo ordenado de menor a mayor
     */
    public static int[] ordenar(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }
        int[] copia = Arrays.copyOf(numeros, numeros.length);
        Arrays.sort(copia);
        return copia;
    }
}