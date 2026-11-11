package es.educacion.arrays;

/**
 * Clase para sumar todos los numeros de un array.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio01Sumar {
    private Ejercicio01Sumar() {
    }

    /**
     * Programa principal con un ejemplo.
     * @param args no se usan
     */
    public static void main(String[] args) {
        int[] elementos = new int[6]; // |0|0|0|0|0|0|
        elementos[0] = 7;
        elementos[1] = 8;
        elementos[2] = 2;
        elementos[3] = 3;
        elementos[4] = 414;
        elementos[5] = 280;

        int sumaElementos = sumar(elementos);
        System.out.println("La suma de elementos es = " + sumaElementos);
    }

    /**
     * Suma todos los numeros del array.
     * Si esta vacio da 0 y si es null da error.
     * @param numeros int[] array de enteros
     * @return int con la suma de todos los numeros
     */
    public static int sumar(int[] numeros) {
        if (numeros == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }
        int suma = 0;
        for (int numero : numeros) {
            suma = suma + numero;
        }
        return suma;
    }
}