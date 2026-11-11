package es.educacion.arrays;

/**
 * Clase para dar la vuelta a un array sin tocar el original.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio06Invertir {
    private Ejercicio06Invertir() { }

    /**
     * Programa principal con un ejemplo.
     * @param args no se usan
     */
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] alReves = invertir(numeros);
        for (int numero : alReves) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    /**
     * Devuelve un array nuevo con los numeros al reves.
     * Si es null da error.
     * @param numeros int[] array que queremos invertir
     * @return int[] array nuevo con los numeros al reves
     */
    public static int[] invertir(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }
        int[] resultado = new int[numeros.length];
        // |1|2|3|
        // |3|2|1|
        // el de la posicion 0 va a la 2, el de la 1 a la 1, el de la 2 a la 0
        for (int i = 0; i < numeros.length; i++) {
            resultado[numeros.length - 1 - i] = numeros[i];
        }
        return resultado;
    }
}