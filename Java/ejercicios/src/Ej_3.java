/*
Ingresar dos valores enteros, el primero corresponde a la cantidad de lápices en stock y el segundo a la
cantidad de lápices que se pueden colocar en una caja. Calcule cuantas cajas completas se pueden llenar
con los lápices disponibles y cuantos lápices sueltos quedarían
 */

import java.util.Scanner;

public class Ej_3 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de lápices: ");
        int lapices = sc.nextInt();
        System.out.print("Ingrese la capacidad de las cajas: ");
        int cantidad = sc.nextInt();

        int sobrante = lapices % cantidad;
        int cajasLlenas = lapices / cantidad;

        System.out.print("La cantidad de cajas que se pueden llenar es: " + cajasLlenas + ". La cantidad de lapices sobrantes es de: " + sobrante);
        
        sc.close();

    }

}
