package es.educacion.arrays;

import java.util.Arrays;

/**
 * Clase para copiar un trozo de un array entre dos posiciones.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio08CopiarRango {
    private Ejercicio08CopiarRango() { }

    /**
     * Programa principal con un ejemplo.
     */
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int[] trozo = copiarRango(numeros, 1, 4);
        System.out.println("Trozo: " + Arrays.toString(trozo));
    }

    /**
     * Copia el array desde inicio hasta fin (sin incluir fin).
     * Si es null o el rango no vale da error.
     * @param numeros int[] array del que copiamos
     * @param inicio int posicion donde empieza la copia (incluida)
     * @param fin int posicion donde acaba la copia (sin incluir)
     * @return int[] array nuevo con el trozo copiado
     */
    public static int[] copiarRango(int[] numeros, int inicio, int fin) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }
        if (inicio < 0 || inicio > fin || fin > numeros.length) {
            throw new IllegalArgumentException("El rango no es valido");
        }
        // |10|20|30|40|50| con inicio 1 y fin 4 |20|30|40|
        return Arrays.copyOfRange(numeros, inicio, fin);
    }
}