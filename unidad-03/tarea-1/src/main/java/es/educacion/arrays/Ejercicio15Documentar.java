package es.educacion.arrays;

/**
 * Clase con dos metodos para saber el tamanio de un array
 * y si tiene algun numero dentro.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio15Documentar {
    private Ejercicio15Documentar() { }

    /**
     * Devuelve cuantos numeros tiene el array.
     * Si el array es null da error.
     * @param numeros int[] array del que quiero saber el tamanio
     * @return int cantidad de numeros del array
     */
    public static int longitud(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("Array nulo");
        }
        return numeros.length;
    }

    /**
     * Dice si el array tiene al menos un numero.
     * Si el array es null da error.
     * @param numeros int[] array que quiero comprobar
     * @return boolean true si tiene numeros y false si esta vacio
     */
    public static boolean tieneElementos(int[] numeros) {
        return longitud(numeros) > 0;
    }
}