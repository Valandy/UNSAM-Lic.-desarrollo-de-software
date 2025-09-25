/*
Ingresar tres valores enteros que representan los valores de cada lado de un triángulo. Determinar e
informar si el triángulo es equilátero (3 lados iguales), isósceles (2 lados iguales), o escaleno (3 lados
distinto).
*/

import java.util.Scanner;

public class Ej_6 {

    public static void main (String[] args){

        int lado1,lado2,lado3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el lado del triangulo: ");
        lado1 = sc.nextInt();
        System.out.print("Ingrese el lado del triangulo: ");
        lado2 = sc.nextInt();
        System.out.print("Ingrese el lado del triangulo: ");
        lado3 = sc.nextInt();        

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("El triangulo es equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("El triangulo es isósceles");
        } else {
            System.out.println("El triangulo es escaleno");
        }

        sc.close();

    }

}
