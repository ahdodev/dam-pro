package ies.puerto.es;

import java.util.Scanner;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public class Palindrome {

    /**
     * Funcion principal que permite que el usuario pueda introducir la palabra/frase, para poder también almacenarla.
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la palabra o frase para analizar: ");
        String sFrase = teclado.nextLine();
        boolean bPalindrome = esPalindrome(sFrase);
        System.out.println("La palabra/frases es palindrome = " +bPalindrome);
    }

    /**
     *Funcion que recibe una palabra o frase que verifica si es palindrome.
     * @param frase
     * @return true/false
     */
    static boolean esPalindrome(String frase){
        if (frase == null || frase.isEmpty()) {
            return false;
        }
frase = frase.toLowerCase(); // Transforma a miniscula
        frase = frase.replace(" ", "");
        for (int i = 0; i < frase.length(); i++) {
            char letraIzquierda = frase.charAt(i);
            char letraDerecha = frase.charAt(frase.length()-1-i);
            if (letraIzquierda != letraDerecha) {
                return false;
            }
        }
        return true;
    }

}
