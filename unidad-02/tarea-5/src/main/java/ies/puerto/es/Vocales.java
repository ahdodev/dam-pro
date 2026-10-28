package ies.puerto.es;

import java.util.Scanner;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public class Vocales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena de texto: ");
        String cadenaTexto = teclado.nextLine();
        int resultado = contarVocales(cadenaTexto);
        System.out.println("El numero de vocales es: " + resultado);
    }
    static int contarVocales (String sCadena){
        if (sCadena == null || sCadena.isEmpty()){
            return  0;
    }
    int resultado = 0;
        sCadena =sCadena.toLowerCase();

        for (int i = 0; i <sCadena.length() ; i++) {
            char caracter = sCadena.charAt(i);
            if (caracter == 'a' || caracter == 'á' || caracter == 'é' || caracter == 'e'
                    || caracter == 'í' || caracter == 'i' || caracter == 'ó' || caracter == 'o'
                    || caracter == 'ú' ||caracter == 'u') {
                resultado = resultado + 1;
            }
        }
        return resultado;
   }
    static int contarVocales2 (String sCadena){
        if (sCadena == null || sCadena.isEmpty()){
            return  0;
        }
        int resultado = 0;
        sCadena =sCadena.toLowerCase();

        for (int i = 0; i <sCadena.length() ; i++) {
            char caracter = sCadena.charAt(i);
            switch (caracter){
                case 'a','á','é','e','i','í','o','ó','u','ú':
                    resultado = resultado +1;
            }






            if (caracter == 'a' || caracter == 'á' || caracter == 'é' || caracter == 'e'
                    || caracter == 'í' || caracter == 'i' || caracter == 'ó' || caracter == 'o'
                    || caracter == 'ú' ||caracter == 'u') {
                resultado = resultado + 1;
            }
        }
        return resultado;
    }
}
