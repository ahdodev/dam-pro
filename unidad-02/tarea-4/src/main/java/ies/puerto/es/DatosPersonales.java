package ies.puerto.es;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public class DatosPersonales {

    /**
     * Prueba las funciones con los datos inventados y lo enseña por pantalla.
     * @param args No se usan
     */
    public static void main(String[] args) {
        int edad = convertirEdad("21");
        System.out.println("Edad: " + edad);
        Double altura = convertirAltura("1.68");
        System.out.println("Altura: " + altura + " m");
        boolean matriculada = convertirMatricula("true");
        System.out.println("Matriculada: " + matriculada);
        boolean mayorDeEdad = esMayorDeEdad(edad);
        System.out.println("Mayor de edad: " + mayorDeEdad);
        Integer edadEnvolvente = convertirEdadAEnvolvente(edad);
        System.out.println("Edad como Integer: " + edadEnvolvente);
        int edadPrimitiva = recuperarEdadPrimitiva(edadEnvolvente);
        System.out.println("Edad como int: " + edadPrimitiva);
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
        return edad;
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
        return edadEnvolvente;
    }
}