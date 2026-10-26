package ies.puerto.es;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase que gestiona las notas de un alumno. Pide las notas por teclado,
 * las guarda en una lista y calcula la media, la máxima, la mínima
 * y los aprobados y suspensos.
 * @author ahdodev
 * @version 1.0.0
 */

public class GestorCalificaciones {

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        do{
            Double nota = solicitarNotaValida();
            notas.add(nota);
            System.out.println("¿Deseas añadir otra nota?: true/false");
            String sSalir = teclado.nextLine();
           salir = Boolean.parseBoolean(sSalir);
        }while (salir);

        System.out.println("Lista de notas: " + notas);
        double media = calcularMedia(notas);
        System.out.println("La nota media es: " +media);
        double minimo =obtenerMinimo(notas);
        System.out.println("El valor minimo es: " + minimo);
        double maximo =obtenerMaxima(notas);
        System.out.println("El valor maximo es: " + maximo);


    }

    /**
     * Función que pasa la cantidad de notas de String a int con Integer.parseInt.
     * @param sNumero String con la cantidad de notas
     * @return int con la cantidad de notas
     */
    static int convertirNumeroNotas(String sNumero) {
        return Integer.parseInt(sNumero);
    }

    /**
     * Función que pasa una nota de String a double con Double.parseDouble.
     * La nota tiene que llevar punto (por ejemplo "7.5")
     * @param sNota String con la nota
     * @return double con la nota
     */
    static double convertirNota(String sNota) {
        return Double.parseDouble(sNota);
    }
    /**
     * Función que mira si una nota es válida, o sea que esté entre 0 y 10
     * (el 0 y el 10 valen). NaN e Infinity no valen
     * @param dNota double con la nota
     * @return boolean, true si es válida y false si no
     */
    static boolean esNotaValida(double dNota) {
        if (Double.isNaN(dNota) || Double.isInfinite(dNota)) {
            return false;
        }
        if (dNota < 0 || dNota > 10) {
            return false;
        }
        return true;
    }

    /**
     * Funcion que comprueba si el numero introducido es valido.
     * @return Devuelve la nota válida.
     */
    static Double solicitarNotaValida() {
        Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una nota: ");
        String sNota = teclado.nextLine();
    Double dNota = null;
try{
     dNota = convertirNota(sNota);
} catch (NumberFormatException e) {
    throw new RuntimeException("El numero introducido es incorrecto.");


}
boolean bValida = esNotaValida(dNota);
return dNota;
}

    /**
     * Funcion que calcula la media de la lista de notas.
     * @param dNotas Lista de double que almacena las notas.
     * @return Devuelve el valor de la media.
     */
    static double calcularMedia(List<Double> dNotas){
        double media = 0;
        double suma = 0;
    for (int i = 0; i <dNotas.size() ; i++) {
        suma = suma + dNotas.get(i);
    }
        media = suma/dNotas.size();
        return media;
}

    /**
     * Funcion que obtieme la maxima de la lista de notas
     * @param lNotas Lista de double que almacena las notas.
     * @return Devuelve la nota máxima de la lista.
     */

static double obtenerMaxima(List<Double> lNotas){
        double maximo = 0;
    for (int i = 0; i < lNotas.size() ; i++) {
        if (lNotas.get(i) > maximo) {
            maximo = lNotas.get(i);
        }
        if (maximo == 10){
            return maximo;
        }
    }
        return maximo;
 }

    /**
     * Funcion que obtieme la minima de la lista de notas
     * @param lNotas Lista de double que almacena las notas.
     * @return Devuelve la nota mininma de la lista.
     */
    static double obtenerMinimo(List<Double> lNotas){
        double minimo = 10;
        for (int i = 0; i < lNotas.size() ; i++) {
            if (lNotas.get(i) < minimo) {
                minimo = lNotas.get(i);
            }
            if (minimo == 0){
                return minimo;
            }
        }
        return minimo;
    }
}