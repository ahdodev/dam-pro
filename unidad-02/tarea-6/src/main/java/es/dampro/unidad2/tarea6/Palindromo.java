package es.dampro.unidad2.tarea6;

/**
 * Clase para saber si un texto es un palíndromo, o sea que se lee
 * igual del derecho que del revés.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Palindromo {

    private Palindromo() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Función que mira si un texto es un palíndromo. Le quito los espacios,
     * lo paso a minúsculas y lo comparo con el mismo texto al revés usando
     * InvertirCadena. Las tildes y los signos sí cuentan. Si se queda vacío
     * no es palíndromo, y si es null da error.
     * @param texto String con el texto que queremos comprobar
     * @return boolean, true si es palíndromo y false si no
     */
    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        //"Luz azul" -> "luzazul"
        String sLimpio = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (caracter != ' ') {
                sLimpio = sLimpio + Character.toLowerCase(caracter);
            }
        }
        if (sLimpio.length() == 0) {
            return false;
        }
        String sAlReves = InvertirCadena.invertir(sLimpio);
        if (sLimpio.equals(sAlReves)) {
            return true;
        }
        return false;
    }
}