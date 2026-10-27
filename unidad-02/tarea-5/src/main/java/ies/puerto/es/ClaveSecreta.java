package ies.puerto.es;

import java.util.Scanner;

public class ClaveSecreta {

    //o O = 0
    //i I = 2
    //u U = 3
    //e E = *
    //a A =

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        String sContasenia = teclado.nextLine();

    }
    static String generarClaveSegura(String sPalabra){
        String clave = "";

        if (sPalabra == null || sPalabra.isEmpty()){
            return "";
        }
        sPalabra.replace("a", "?");
        sPalabra.replace("A", "?");


        return clave;
    }
}
