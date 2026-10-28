import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int numero2 = teclado.nextInt();
        boolean iguales = igual(numero1,numero2);
        System.out.println("Ambos numeros son iguales: "+iguales);
        int mayor = mayor(numero1, numero2);
        System.out.println("El numero mayor es: " +mayor);
        int menor = menor(numero1,numero2);
        System.out.println("El numero menor es: " +menor);
    }

    static int mayor(int numero1, int numero2) {
        if (numero1 > numero2) {
            return numero1;

        }
        return numero2;
    }

    static int menor(int numero1, int numero2) {
        if (numero1 < numero2) {
            return numero1;
        }
        return numero2;
    }

    static boolean igual(int numero1, int numero2) {
        if (numero1 == numero2){
            return true;
        }
        return false;
    }
}
