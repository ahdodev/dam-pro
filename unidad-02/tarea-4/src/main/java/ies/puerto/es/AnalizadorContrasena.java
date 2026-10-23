package ies.puerto.es;

import java.util.Scanner;

/**
 * @author ahdodev
 * @version 1.0.0
 */

public class AnalizadorContrasena {

    /**
     * Programa principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce la contraseña: ");
        String sContrasenia = teclado.nextLine();
        String resultado = generarInforme(sContrasenia);
        System.out.println(resultado);

    }

    /**
     * Función que cuenta el número de mayusculas de una cadena
     * @param sContrasenia String cadena de texto
     * @return int con el número de mayúsculas
     */
    static int contarMayusuculas(String sContrasenia) {
        int numero = 0;
        //Java2026! = |J|a|v|a|2|0|2|6|!|
        //            |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c)

        for (int i = 0; i < sContrasenia.length(); i++) {
            char character = sContrasenia.charAt(i);
            if (Character.isUpperCase(character)) {
                numero++;
            }

        }
        return numero;
    }

    /**
     * Función que cuenta el número de minúsculas de una cadena
     * @param sContrasenia String cadena de texto
     * @return
     */
        static int contarMinusculas(String sContrasenia){
            int numero = 0;
            return sContrasenia.length() - contarMayusuculas(sContrasenia) - contarDigitos(sContrasenia) - (contarSimbolos(sContrasenia));
            //numero = 9 - 1 - 4 - 1
            //Java2026! = |J|a|v|a|2|0|2|6|!|
            //            |0|1|2|3|4|5|6|7|8|
            //Character.isUpperCase(c)
/*
            for (int i = 0; i < sContrasenia.length(); i++){
                char character = sContrasenia.charAt(i);
                if (Character.isAlphabetic(character) && Character.isLowerCase(character)){
                    numero++;
                }
            }*/
    }
     static int contarDigitos(String sContrasenia){
        int numero = 0;
        //Java2026! = |J|a|v|a|2|0|2|6|!|
        //            |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c)

        for (int i = 0; i < sContrasenia.length(); i++){
            char character = sContrasenia.charAt(i);
            if (Character.isDigit(character)) {
                numero++;
            }
        }
        return numero;
    }
    static int contarSimbolos(String sContrasenia){
        int numero = 0;
        //Java2026! = |J|a|v|a|2|0|2|6|!|
        //            |0|1|2|3|4|5|6|7|8|
        //Character.isUpperCase(c)

        for (int i = 0; i < sContrasenia.length(); i++){
            char character = sContrasenia.charAt(i);
            if (!Character.isLetterOrDigit(character)) {
                numero++;
            }
        }
        return numero;
    }
    static boolean tieneLongitudminima(String sContrasenia){

        if(sContrasenia.length()<8){
            return false;
        }
        return true;
    }

    static boolean esContrasenaValida(String sContrasenia){
        if (!tieneLongitudminima(sContrasenia)){
            return false;
        }
        if (contarMayusuculas(sContrasenia) <1) {
            return false;
        }
        if (contarMinusculas(sContrasenia) <1) {
            return false;
        }
        if (contarDigitos(sContrasenia) <1) {
            return false;
        }
        return true;
    }

    static String generarInforme(String sContrasenia){
        return "Digitos: " + contarDigitos(sContrasenia)
                + ", Resultado: " + esContrasenaValida(sContrasenia);
    }
}


