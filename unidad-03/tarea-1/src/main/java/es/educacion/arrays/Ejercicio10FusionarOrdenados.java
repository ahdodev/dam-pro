package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase para juntar dos arrays ordenados en uno solo que siga ordenado.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio10FusionarOrdenados {
    private Ejercicio10FusionarOrdenados() { }

    /**
     * Programa principal con un ejemplo
     */
    public static void main(String[] args) {
        int[] primero = {1, 4, 7};
        int[] segundo = {2, 4, 8, 9};
        int[] juntos = fusionar(primero, segundo);
        System.out.println("Juntos: " + Arrays.toString(juntos));
    }

    /**
     * Junta dos arrays ordenados en uno nuevo ordenado.
     * Si alguno es null da error
     * @param primero int[] primer array ordenado
     * @param segundo int[] segundo array ordenado
     * @return int[] array nuevo con los dos juntos y ordenados
     */
    public static int[] fusionar(int[] primero, int[] segundo) {
        if (primero == null || segundo == null) {
            throw new IllegalArgumentException("Los arrays no pueden ser null");
        }
        int[] resultado = new int[primero.length + segundo.length];
        int i = 0;
        int j = 0;
        int k = 0;
        // |1|4|7| y |2|4|8|9|
        // |1|2|4|4|7|8|9|
        while (i < primero.length && j < segundo.length) {
            if (primero[i] <= segundo[j]) {
                resultado[k] = primero[i];
                i++;
            } else {
                resultado[k] = segundo[j];
                j++;
            }
            k++;
        }
        // lo que quede del primero
        while (i < primero.length) {
            resultado[k] = primero[i];
            i++;
            k++;
        }
        // lo que quede del segundo
        while (j < segundo.length) {
            resultado[k] = segundo[j];
            j++;
            k++;
        }
        return resultado;
    }
}