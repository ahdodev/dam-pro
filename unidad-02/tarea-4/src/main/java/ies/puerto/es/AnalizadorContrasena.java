package ies.puerto.es;

import java.util.Scanner;

/**
 * Clase que analiza una contraseña que escribe el usuario por teclado.
 * Cuenta mayúsculas, minúsculas, dígitos y símbolos, y mira si cumple
 * lo que se pide para que sea válida.
 *
 * @author ahdodev
 * @version 1.0.0
 */

public class AnalizadorContrasena {

    /**
     * Programa principal. Pide la contraseña por teclado, llama a
     * generarInforme y enseña lo que devuelve por pantalla.
     *
     * @param args argumentos de la línea de comandos (aquí no se usan)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce la contraseña: ");
        String sContrasenia = teclado.nextLine();
        String resultado = generarInforme(sContrasenia);
        System.out.println(resultado);

    }

    /**
     * Función que cuenta el número de mayúsculas.
     * Va letra por letra y usa Character.isUpperCase para saber si es mayúscula.
     *
     * @param sContrasenia String con la contraseña que queremos analizar
     * @return int con el número de mayúsculas que tiene.
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
     * Función que cuenta el número de minúsculas.
     * No las cuenta una a una: le resta a la longitud total las mayúsculas,
     * los dígitos y los símbolos, y lo que queda son las minúsculas.
     *
     * @param sContrasenia String con la contraseña que queremos analizar
     * @return int con el número de minúsculas que tiene
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

    /**
     * Función que cuenta cuántos dígitos tiene.
     * Cuenta caracteres que son números (Character.isDigit), no suma sus valores.
     *
     * @param sContrasenia String con la contraseña que queremos analizar
     * @return int con el número de dígitos que tiene
     */
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

    /**
     * Función que cuenta los símbolos. Un símbolo es cualquier
     * carácter que no es letra ni dígito (Character.isLetterOrDigit),
     * así que los espacios también cuentan como símbolo.
     *
     * @param sContrasenia String con la contraseña que queremos analizar
     * @return int con el número de símbolos que tiene
     */
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

    /**
     * Función que mira si la contraseña llega a la longitud mínima,
     * que son 8 caracteres.
     *
     * @param sContrasenia String con la contraseña que queremos analizar
     * @return boolean, true si tiene 8 caracteres o más y false si tiene menos
     */
    static boolean tieneLongitudminima(String sContrasenia){

        if(sContrasenia.length()<8){
            return false;
        }
        return true;
    }

    /**
     * Función que decide si la contraseña es válida. Tiene que cumplir las
     * cuatro cosas a la vez: mínimo 8 caracteres, una mayúscula, una minúscula
     * y un dígito. Reutiliza las funciones de arriba en vez de volver a contar.
     *
     * @param sContrasenia String con la contraseña que queremos analizar
     * @return boolean, true si cumple todo y false si falla alguna condición
     */
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

    /**
     * Función que monta el informe de la contraseña en un texto. De momento
     * dice cuántos dígitos tiene y si la contraseña es válida o no.
     * No pide nada por teclado ni imprime nada, solo devuelve el texto.
     *
     * @param sContrasenia String con la contraseña que queremos analizar
     * @return String con el informe (dígitos y resultado de la validación)
     */
    static String generarInforme(String sContrasenia){
        return "Digitos: " + contarDigitos(sContrasenia)
                + ", Resultado: " + esContrasenaValida(sContrasenia);
    }
}