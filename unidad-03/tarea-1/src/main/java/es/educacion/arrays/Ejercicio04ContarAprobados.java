package es.educacion.arrays;

/**
 * Clase para contar cuantas notas estan aprobadas y cuantas suspendidas.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() {
    }

    /**
     * Programa principal con un ejemplo.
     * @param args no se usan
     */
    public static void main(String[] args) {
        int[] notas = {5, 2, 1, 10, 8};
        int aprobados = contarAprobados(notas);
        int suspendidos = contarSuspenso(notas);
        System.out.println("Numero de aprobados = " + aprobados);
        System.out.println("Numero de suspendidos = " + suspendidos);
    }

    /**
     * Cuenta las notas de 5 o mas.
     * Si es null da error.
     * @param notas int[] con las notas
     * @return int con el numero de aprobados
     */
    public static int contarAprobados(int[] notas) {
        if (notas == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }
        int aprobados = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    /**
     * Cuenta las notas de menos de 5.
     * Si es null da error.
     * @param notas int[] con las notas
     * @return int con el numero de suspensos
     */
    public static int contarSuspenso(int[] notas) {
        if (notas == null) {
            throw new IllegalArgumentException("El array no puede ser null");
        }
        int suspendidos = 0;
        for (int nota : notas) {
            if (nota < 5) {
                suspendidos++;
            }
        }
        return suspendidos;
    }

    /**
     * Cuenta los suspensos restando los aprobados al total.
     * @param notas int[] con las notas
     * @return int con el numero de suspensos
     */
    public static int contarSuspensoTop(int[] notas) {
        return notas.length - contarAprobados(notas);
    }
}