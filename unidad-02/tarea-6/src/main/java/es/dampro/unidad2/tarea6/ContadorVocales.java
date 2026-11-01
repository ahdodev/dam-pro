package es.dampro.unidad2.tarea6;

/**
 * Clase para contar cuántas vocales tiene un texto, contando también
 * las vocales con tilde y la ü.
 * @author ahdodev
 * @version 1.0.0
 */
public final class ContadorVocales {
    private ContadorVocales() { }

    /**
     * Función que cuenta las vocales de un texto. Voy letra por letra, la paso
     * a minúscula y si es una vocal sumo uno. Cuentan las vocales con tilde y
     * la ü, en mayúscula o minúscula. Si el texto es null da error.
     * @param texto String con el texto que queremos mirar
     * @return int con el número de vocales
     */
    public static int contarVocales(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        int numero = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = Character.toLowerCase(texto.charAt(i));
            if (esVocal(letra)) {
                numero++;
            }
        }
        return numero;
    }

    /**
     * Función que mira si una letra es una vocal (con o sin tilde, o la ü).
     * La letra tiene que llegar ya en minúscula.
     * @param letra char con la letra que queremos mirar
     * @return boolean, true si es vocal y false si no
     */
    static boolean esVocal(char letra) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            return true;
        }
        if (letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó' || letra == 'ú') {
            return true;
        }
        if (letra == 'ü') {
            return true;
        }
        return false;
    }
}