package ies.puerto;

/**
 * @author ahdodev
 * @version 1.0.0
 */

import java.util.Scanner;

public class Ahorro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       SIMULADOR DE AHORRO");
        System.out.println("====================================");

        System.out.print("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("¿Cuánto dinero tienes ahorrado? ");
        float ahorroInicial = teclado.nextFloat();

        System.out.println();
        System.out.println("Hola, " + nombre + ".");
        System.out.println("Ahorro inicial: " + ahorroInicial + " euros");

    }
}