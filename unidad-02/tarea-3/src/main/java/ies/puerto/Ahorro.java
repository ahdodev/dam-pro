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
        while (ahorroInicial < 0) {
            System.out.println("El ahorro no puede ser negativo.");
            System.out.print("¿Cuánto dinero tienes ahorrado? ");
            ahorroInicial = teclado.nextFloat();
        }
        teclado.nextLine();

        System.out.println();
        System.out.println("Hola, " + nombre + ".");

        float ahorroActual = ahorroInicial;
        float totalAportado = 0;
        int aportaciones = 0;
        String respuesta;

        do {
            System.out.print("Introduce una cantidad para ahorrar: ");
            float aportacion = teclado.nextFloat();
            while (aportacion <= 0) {
                System.out.println("La cantidad tiene que ser mayor que 0.");
                System.out.print("Introduce una cantidad para ahorrar: ");
                aportacion = teclado.nextFloat();
            }
            teclado.nextLine();

            ahorroActual = ahorroActual + aportacion;
            totalAportado = totalAportado + aportacion;
            aportaciones++;

            System.out.println("Aportación registrada. Ahorro actual: " + ahorroActual + " euros");

            System.out.print("¿Deseas realizar otra aportación? (S/N): ");
            respuesta = teclado.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println();
        System.out.println("====================================");
        System.out.println("         RESUMEN DEL AHORRO");
        System.out.println("====================================");
        System.out.println("Usuario: " + nombre);
        System.out.println("Ahorro inicial: " + ahorroInicial + " euros");
        System.out.println("Aportaciones realizadas: " + aportaciones);
        System.out.println("Total aportado: " + totalAportado + " euros");
        System.out.println("Ahorro final: " + ahorroActual + " euros");

    }
}