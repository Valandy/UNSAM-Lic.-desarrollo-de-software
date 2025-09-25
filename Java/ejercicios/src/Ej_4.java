/*
Dadas las medidas de dos ángulos de un triángulo, determinar la medida del tercero e informar el
resultado. Nota: La suma de los ángulos interiores de cualquier triángulo es siempre 180 grados
 */

import java.util.Scanner;

public class Ej_4 {
    
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la medida de un ángulo en grados (interior) del triangulo: ");
        int lado1 = sc.nextInt();
        System.out.print("Ingrese la medida de otro ángulo en grados (también interior) del triangulo: ");
        int lado2 = sc.nextInt();

        int lado3 = 180-lado1-lado2;

        System.out.println("El último ángulo mide " + lado3 + " grados");

        sc.close();


    }

}
