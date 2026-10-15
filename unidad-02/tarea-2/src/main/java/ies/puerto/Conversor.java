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

        switch (opcion) {
            case 1:
                System.out.print("Introduce el numero de kilometros: ");
                float kilometros = scanner.nextFloat();
                float resultadoMetros = kilometros * 1000;
                System.out.println("Resultado = " + resultadoMetros + " metros.");
                System.out.println("Conversión realizada correctamente.");
                conversiones++;
                break;
            case 2:
                System.out.print("Introduce el numero de metros: ");
                float metros = scanner.nextFloat();
                float resultadoCentimetros = metros * 100;
                System.out.println("Resultado = " + resultadoCentimetros + " centímetros.");
                System.out.println("Conversión realizada correctamente.");
                conversiones++;
                break;
            case 3:
                System.out.print("Introduce el numero de kilómetros: ");
                float km = scanner.nextFloat();
                float resultadoMillas = km * 0.621371f;
                System.out.println("Resultado = " + resultadoMillas + " millas.");
                System.out.println("Conversión realizada correctamente.");
                conversiones++;
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}