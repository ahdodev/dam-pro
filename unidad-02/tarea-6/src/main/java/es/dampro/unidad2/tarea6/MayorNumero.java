package es.dampro.unidad2.tarea6;

/**
 * Clase para sacar el número mayor de una lista de números separados por comas.
 * @author ahdodev
 * @version 1.0.0
 */
public final class MayorNumero {

    private MayorNumero() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Función que te da el número mayor de una lista tipo "12,-5,89".
     * Voy letra por letra juntando cada número hasta que llego a una coma,
     * lo paso a int y lo comparo con el mayor que llevo. Los espacios
     * me los salto. Si la lista está vacía o es null da error.
     * @param numeros String con los números separados por comas
     * @return int con el número mayor
     */
    public static int obtenerMayor(String numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }
        //le pongo una coma al final para que el último número también se cuente
        numeros = numeros + ",";

        int mayor = 0;
        boolean primero = true;
        String sNumero = "";
        for (int i = 0; i < numeros.length(); i++) {
            char caracter = numeros.charAt(i);
            if (caracter == ',') {
                int numero = Integer.parseInt(sNumero);
                //el primer número lo guardo como mayor
                if (primero) {
                    mayor = numero;
                    primero = false;
                }
                mayor = mayor(mayor, numero);
                sNumero = "";
            }
            if (caracter != ',' && caracter != ' ') {
                sNumero = sNumero + caracter;
            }
        }
        return mayor;
    }

    /**
     * Función que devuelve el mayor de dos números.
     * @param numero1 int con el primer número
     * @param numero2 int con el segundo número
     * @return int con el número mayor
     */
    static int mayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;
        }
        return numero2;
    }
}