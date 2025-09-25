/*
Ingresar un valor en mm y convertirlo a pulgadas (Dato: 1" = 25,4 mm).
*/

import java.util.Scanner;

public class Ej_1 {  
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una medida en mm: ");
        double milimetros = sc.nextDouble();
        double pulgadas = milimetros/25.4;

        System.out.println("Usted ingreso " + milimetros + " milimetros. Lo que da " + pulgadas + " pulgadas");


        sc.close();

    }
}