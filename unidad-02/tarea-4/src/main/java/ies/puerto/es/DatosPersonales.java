package ies.puerto.es;

import java.util.Scanner;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public class DatosPersonales {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String sNombre = teclado.nextLine();
        System.out.println("Introduce la edad: ");
        String sEdad =teclado.nextLine();
        System.out.println("Introduce la altura: ");
        String sAltura =teclado.nextLine();
        System.out.println("Introduce la matricula: ");
        String sMatricula =teclado.nextLine();

        double dAltura = convertirAltura(sAltura);
        int edad = convertirEdad(sEdad);
        boolean bMatricula = convertirMatricula(sMatricula);
        boolean bMayorEdad = esMayorDeEdad(edad);
        String ficha = formatearFicha(sNombre,sEdad,sAltura,bMatricula,bMayorEdad);
        System.out.println(ficha);
    }

    /**
     * Pasa la edad de texto a int con Integer.valueOf().
     * valueOf da un Integer y lo pasa solo a int.
     * @param sEdad La edad en texto, por ejemplo "21"
     * @return La edad como int, o 0 si llega null.
     * @throws NumberFormatException Si el texto no es un número entero.
     */
    static int convertirEdad(String sEdad) {
        if (sEdad == null) {
            return 0;
        }
        return Integer.valueOf(sEdad);
    }

    /**
     * Pasa la altura de texto a Double con Double.valueOf().
     * Va en metros y con punto, no con coma.
     * @param sAltura La altura en texto, por ejemplo "1.68".
     * @return La altura como Double, o 0.0 si llega null.
     * @throws NumberFormatException Si el texto no es un número.
     */
    static Double convertirAltura(String sAltura) {
        if (sAltura == null) {
            return 0.0;
        }
        return Double.valueOf(sAltura);
    }

    /**
     * Pasa la matrícula de texto a boolean con Boolean.parseBoolean().
     * Solo da true con "true", cualquier otra cosa da false aunque esté mal escrita.
     * @param sMatricula "true" o "false" en texto.
     * @return true si está matriculada.
     */
    static boolean convertirMatricula(String sMatricula) {
        return Boolean.parseBoolean(sMatricula);
    }

    /**
     * Mira si es mayor de edad, o sea 18 o más.
     * @param edad La edad.
     * @return true si tiene 18 o más.
     */
    static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    /**
     * Pasa la edad de int a Integer.
     * @param edad La edad como int.
     * @return La edad como Integer.
     */
    static Integer convertirEdadAEnvolvente(int edad) {
        return Integer.valueOf(edad);
    }

    /**
     * Pasa la edad de Integer a int.
     * Si llega null devuelvo 0.
     * @param edadEnvolvente La edad como Integer.
     * @return La edad como int, o 0 si llega null.
     */
    static int recuperarEdadPrimitiva(Integer edadEnvolvente) {
        if (edadEnvolvente == null) {
            return 0;
        }
        return edadEnvolvente.intValue();
    }

    /**
     * Funcion que formatea la ficha
     * @param sNombre Sring nombre de la ficha
     * @param edad integer edad de la ficha
     * @param dAltura double altura de la ficha
     * @param bMatricula boolean matricula de la ficha
     * @param bMayorEdad boolean mayor de edad de la ficha
     * @return
     */
    static String formatearFicha(String sNombre,int edad, double dAltura
                ,boolean bMatricula, boolean bMayorEdad){
        return "Ficha:" +sNombre+", edad"+edad+", altura"+ dAltura + ", matricula"+bMatricula+
                ", mayor de edad"+bMayorEdad;

    }
}