package es.educacion.arrays;

/**
 * Clase para sacar el numero mas grande de un array.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio03Maximo {
    private Ejercicio03Maximo() { }

    /**
     * Programa principal con un ejemplo.
     */
    public static void main(String[] args) {
        int[] numeros = {-4, 12, 7, -1, 9};
        int resultado = maximo(numeros);
        System.out.println("El maximo es = " + resultado);
    }

    /**
     * Devuelve el numero mas grande del array.
     * Si es null o esta vacio da error.
     * @param numeros int[] array de enteros
     * @return int con el numero mas grande
     */
    public static int maximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacio");
        }
        int maximo = numeros[0];
        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }
}