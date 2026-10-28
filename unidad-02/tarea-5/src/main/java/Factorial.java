import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int numero = teclado.nextInt();
        int resultado = calcular(numero);
        System.out.println("Factorial: " +resultado);
    }

    /**
     * Calcula el factorial de un numero.
     * @param numero int para el calculo del factorial
     * @return Int con el resultado
     */
    static int calcular (int numero) {
        if (numero <= 1 ) {
            return 1;
        }
        int resultado = 1;
        for (int i = 2; i <= numero ; i++) {
            resultado *= i;

        }
        return resultado;
    }
}
