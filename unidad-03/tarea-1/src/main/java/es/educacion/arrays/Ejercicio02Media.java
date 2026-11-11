package es.educacion.arrays;

/**
 * Clase para calcular la media de un array de notas.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio02Media {
    private Ejercicio02Media() { }

    /**
     * Programa principal con un ejemplo.
     * @param args no se usan
     */
    public static void main(String[] args) {
        int[] notas = {8, 7, 3, 3, 10};
        double resultado = media(notas);
        System.out.println("La media es igual: " + resultado);
    }

    /**
     * Calcula la media de las notas.
     * Si es null o esta vacio da error.
     * @param notas int[] con las notas
     * @return double con la media de las notas
     */
    public static double media(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException("No hay notas");
        }
        double suma = 0;
        for (double nota : notas) {
            suma = suma + nota;
        }
        double resultado = suma / notas.length;
        return resultado;
    }
}