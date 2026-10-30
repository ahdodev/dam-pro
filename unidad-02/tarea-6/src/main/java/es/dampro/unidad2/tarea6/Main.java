package es.dampro.unidad2.tarea6;

/**
 * Programa principal que enseña los diez algoritmos de la tarea con ejemplos.
 * @author ahdodev
 * @version 1.0.0
 */
public final class Main {
    private Main() { }

    /**
     * Programa principal. Llama a cada algoritmo con un ejemplo y enseña
     * una línea con el nombre y el resultado.
     * @param argumentos argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] argumentos) {
        System.out.println("InvertirCadena: " + InvertirCadena.invertir("Hola Java"));
    }
}