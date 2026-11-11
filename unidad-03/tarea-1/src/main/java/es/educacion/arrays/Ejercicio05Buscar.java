package es.educacion.arrays;

/**
 * Clase para buscar en que posicion esta un numero dentro de un array.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio05Buscar {
    private Ejercicio05Buscar() { }

    /**
     * Programa principal con un ejemplo
     */
    public static void main(String[] args) {
        int[] numeros = {8, 3, 5, 6};
        System.out.println("El 5 esta en la posicion = " + buscar(numeros, 5));
        System.out.println("El 9 esta en la posicion = " + buscar(numeros, 9));
    }

    // |8|3|5|6|
    // |0|1|2|3|

    /**
     * Busca la primera posicion del numero.
     * Si no esta devuelve -1 y si es null da error.
     * @param numeros int[] array donde se busca
     * @param objetivo int numero que se busca
     * @return int con la posicion del numero, o -1 si no esta
     */
    public static int buscar(int[] numeros, int objetivo) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }
        for (int i = 0; i < numeros.length; i++) {
            int numero = numeros[i];
            if (numero == objetivo) {
                return i;
            }
        }
        return -1;
    }
}