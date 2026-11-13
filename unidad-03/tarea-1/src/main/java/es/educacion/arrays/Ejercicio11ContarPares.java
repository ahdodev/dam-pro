package es.educacion.arrays;

/**
 * Clase para contar cuantos numeros pares hay en un array
 * @author ahdodev
 * @version 1.0.0
 */

public final class Ejercicio11ContarPares {
    private Ejercicio11ContarPares() { }

    /**
     * Programa principal con un ejemplo
     */
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,0,-6};
        System.out.println("Pares: " +contarPares(numeros));
    }

    /**
     * Cuenta los numeros pares del array
     * Si es null da error y si esta vacio devuelve 0
     * @param numeros int[] array de numeros
     * @return
     */

    public static int contarPares(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede ser nulo");
        }
        int cuantosPares = 0;
        // |1|2|3|4|0|-6| - 4 pares
        for (int numero : numeros){
            if (numero % 2 == 0){
                cuantosPares++;
            }
        }
        return cuantosPares;
    }
}
