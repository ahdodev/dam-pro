package es.educacion.arrays;

import java.util.Arrays;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio14Interseccion {
    private Ejercicio14Interseccion() { }

    public static void main(String[] args) {
        int[] primero = {1,5,6,7,8,2};
        int[] segundo = {2,5,7,4};
        System.out.println("Comunes: " +Arrays.toString(interseccion(primero, segundo)));
    }
    /**
     * Devuelve los numeros que estan en los dos arrays sin repetir
     * Si alguno es null da error
     * @param primero int [] primer array
     * @param segundo int[] segundo array
     * @return int[] numeros que estan en los dos
     */
    public static int[] interseccion(int[] primero, int[] segundo) {
        if (primero == null || segundo == null) {
            throw new IllegalArgumentException();
        }
        int[] resultado = new int[primero.length];
        int cantidad = 0;
        for (int numero : primero) {
            boolean encontrado = false;
            for (int otroNumero : segundo) {
                if (otroNumero == numero) {
                    encontrado = true;
                    break;
                }
            }
            boolean repetido = false;
            for (int i = 0; i < cantidad; i++) {
                if (resultado[i] == numero) {
                    repetido = true;
                    break;
                }
            }
                if (encontrado && !repetido) {
                    resultado[cantidad] = numero;
                    cantidad++;
                 }
                }
        return Arrays.copyOf(resultado, cantidad);
    }
     }