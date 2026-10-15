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
        teclado.nextLine(); // limpia el Enter que deja nextFloat

        System.out.println();
        System.out.println("Hola, " + nombre + ".");

        float ahorroActual = ahorroInicial;
        float totalAportado = 0;
        int aportaciones = 0;
        String respuesta;

        do {
            System.out.print("Introduce una cantidad para ahorrar: ");
            float aportacion = teclado.nextFloat();
            teclado.nextLine(); // limpia el Enter otra vez

            ahorroActual = ahorroActual + aportacion;
            totalAportado = totalAportado + aportacion;
            aportaciones++;

            System.out.println("Aportación registrada. Ahorro actual: " + ahorroActual + " euros");

            System.out.print("¿Deseas realizar otra aportación? (S/N): ");
            respuesta = teclado.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

    }
}