package es.dampro.unidad2.tarea6;

/**
 * Clase para sumar los dígitos de un número que llega como texto.
 * @author ahdodev
 * @version 1.0.0
 */
public final class SumaDigitos {

    private SumaDigitos() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Función que suma los dígitos de un número, por ejemplo "5832" da 18
     * porque 5+8+3+2. Voy dígito por dígito, lo paso a int y lo sumo.
     * Si el texto es null, está vacío o tiene algo que no sea un dígito
     * (un signo, una letra o un espacio) da error.
     * @param numero String con el número
     * @return int con la suma de los dígitos
     */
    public static int sumarDigitos(String numero) {
        if (numero == null || numero.length() == 0) {
            throw new IllegalArgumentException("El número no puede estar vacío");
        }
        //"5832" -> 5 + 8 + 3 + 2 = 18
        int suma = 0;
        for (int i = 0; i < numero.length(); i++) {
            char caracter = numero.charAt(i);
            if (!Character.isDigit(caracter)) {
                throw new IllegalArgumentException("Solo se pueden poner dígitos");
            }
            int digito = Integer.parseInt("" + caracter);
            suma = suma + digito;
        }
        return suma;
    }
}