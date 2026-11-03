package es.dampro.unidad2.tarea6;

/**
 * @author ahdodev
 * @version 1.0.0
 */
public final class NumeroPrimo {

    private NumeroPrimo() {
        // Clase de algoritmos estáticos.
    }

    /**
     * Funcion que mira si un numero es primo. Lo paso a int con parseInt y voy probando a dividirlo entre
     * 2,3,4 hasta el numero anterior. Si alguna division da de resto 0 es que no es primo.
     * @param numero String con el numero que queremos mirar
     * @return boolean, true si es primo y false si no
     */
    public static boolean esPrimo(String numero) {
        if (numero == null || numero.isEmpty()) {
            throw new IllegalArgumentException("El numero no puede ser null.");
        }
        int iNumero = Integer.parseInt(numero);
        if(iNumero < 2){
            return false;
        }
        for (int i = 2; i <iNumero ; i++) {
            if (iNumero % i == 0) {
                return false;
            }

        }
        return true;
    }

}
