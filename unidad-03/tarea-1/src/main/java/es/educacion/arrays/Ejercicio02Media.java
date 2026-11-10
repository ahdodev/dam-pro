package es.educacion.arrays;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio02Media {
    private Ejercicio02Media() { }

    public static void main(String[] args) {
        int[] notas = {8,7,3,3,10};
        double resultado = media(notas);
        System.out.println("La media es igual: " + resultado);
    }

    /**
     * Calcula la media de un array de notas
     * @param notas int [] de notas
     * @return double con el resultado
     * @exception IllegalArgumentException
     */
    public static double media(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException();
        }
        double suma = 0;
        for (double nota : notas) {
            suma = suma +nota;
        }
        double resultado = suma/notas.length;
        return resultado;
    }
}
