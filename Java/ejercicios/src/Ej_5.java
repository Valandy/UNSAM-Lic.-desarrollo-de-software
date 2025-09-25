/*
Leer 2 valores y mostrar el mayor de ellos, si son iguales mostrar cualquiera de los dos.
 */

import java.util.Scanner;

public class Ej_5 {
    
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese uno de los dos valores: ");
        int valor1 = sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int valor2 = sc.nextInt();

        if (valor1 > valor2) {
            System.out.println("El primer valor (" + valor1 + ") es el mayor");
        } else if (valor2 > valor1) {
            System.out.println("El segundo valor (" + valor2 + ") es el mayor");
        } else {
            System.out.println("Son iguales");
        }

    sc.close();
    }

}
