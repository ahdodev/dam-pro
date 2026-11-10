package es.educacion.arrays;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public final class Ejercicio04ContarAprobados {
    private Ejercicio04ContarAprobados() {
    }

    public static void main(String[] args) {
        int[] notas = {5, 2, 1, 10, 8};
        int aprobados = contarAprobados(notas);
        int suspendidos = contarSuspenso(notas);
        System.out.println("Numero de aprobados = " + aprobados);
        System.out.println("Numero de suspendidos = " + suspendidos);

    }

    public static int contarAprobados(int[] notas) {
        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException();
        }
        int aprobados = 0;
        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public static int contarSuspenso(int[] notas) {

        if (notas == null || notas.length == 0) {
            throw new IllegalArgumentException();
        }
        int suspendidos = 0;
        for (int nota : notas) {
            if (nota < 5) {
                suspendidos++;
            }
        }
        return suspendidos;
    }
    public static int contarSuspensoTop(int[] notas){


        return -contarAprobados(notas)+ notas.length;
    }
}
