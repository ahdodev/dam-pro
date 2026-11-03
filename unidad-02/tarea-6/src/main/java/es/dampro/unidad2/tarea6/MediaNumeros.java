package es.dampro.unidad2.tarea6;

import java.util.Scanner;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public final class MediaNumeros {
    private MediaNumeros() { }
    //numeros = 1234
    /**
     * Funcion que calcula la media de los digitos de un texto.
     * @param numeros String con los numeros
     * @return double con la media
     */
    public static double calcularMedia(String numeros) {
        if (numeros == null  || numeros.isEmpty()) {
            return 0;
        }
        double suma = 0; //10 double 10.0
        for (int i = 0; i < numeros.length(); i++) {
            char cNumero = numeros.charAt(i);
            String sNumero = String.valueOf(cNumero);
            int numero = Integer.parseInt(sNumero);
            suma = suma + numero;
        }
        int totalNumeros = numeros.length();
        return suma/totalNumeros;

    }
}
