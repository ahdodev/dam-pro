package ies.puerto;

/**
 * @author ahdodev
 * @version 1.0.1
 */

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("         CONVERSOR DAM-PRO");
        System.out.println("====================================");
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenida/o " + nombre);

        int opcion = 0;
        int conversiones = 0;

        System.out.println();
        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a centímetros");
        System.out.println("3. Kilómetros a millas");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opción: ");
        opcion = scanner.nextInt();
        System.out.println("Has elegido la opción " + opcion);

        scanner.close();
    }
}