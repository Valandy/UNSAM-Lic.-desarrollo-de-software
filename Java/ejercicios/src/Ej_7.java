/*
Ingresar 3 valores enteros, escribirlos primero en el orden que fueron ingresados y luego mostrarlos
ordenarlos en forma creciente.
 */

import java.util.Scanner;

public class Ej_7 {
    
    public static void main(String[] args){

        int mem;

        int[] numeros = new int[3];

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar un número: ");
        numeros[0] = sc.nextInt();
        System.out.print("Ingresar un número: ");
        numeros[1] = sc.nextInt();
        System.out.print("Ingresar un número: ");
        numeros[2] = sc.nextInt();

        System.out.println("En el orden ingresado los valores son estos: ");

        for (int num : numeros) {
            System.out.println(num);
        }

        for (int i=0; i < numeros.length-1; i++) {

            for(int j = 1; j < numeros.length ;j++){
                
                if (numeros[i] < numeros[j]) {
                    mem = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = mem;
                }
            }
        }

        System.out.println("Ordenados de mayor a menor los valores son estos: ");
        for (int num:numeros){
            System.out.println(num);
        }

        sc.close();
    }

}
