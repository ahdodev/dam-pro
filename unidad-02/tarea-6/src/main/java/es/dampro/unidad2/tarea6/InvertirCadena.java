package es.dampro.unidad2.tarea6;

/**
 * Clase que sirve para invertir un texto y que se lea al revés.
 * @author ahdodev
 * @version 1.0.0
 */
public final class InvertirCadena {

    private InvertirCadena() {

    }

    /**
     * Función que sirve para invertir un texto. Recorre la cadena desde la
     * última letra hasta la primera y las va juntando. Los espacios y las
     * mayúsculas se quedan igual. Si el texto es null da error.
     * @param texto String con el texto que queremos invertir
     * @return String con el texto al revés
     * @throws IllegalArgumentException si el texto es null
     */
    public static String invertir(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser null");
        }
        String sTextoInvertido = "";
        //Hola = |H|o|l|a|
        //       |0|1|2|3|
        //empiezo en la 3 y bajo hasta la 0
        for (int i = texto.length() - 1; i >= 0; i--) {
            char caracter = texto.charAt(i);
            sTextoInvertido = sTextoInvertido + caracter;
        }
        return sTextoInvertido;
    }
}