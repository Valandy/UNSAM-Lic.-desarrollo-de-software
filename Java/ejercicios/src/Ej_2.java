/* 
Dado un Nº del 1 al 7 determinar (mostrar) el nombre del día de la semana que corresponde. Si el nro
está fuera de rango infórmelo como un error de ingreso de datos. Considere usar un enum.
*/

import java.util.Scanner;

public class Ej_2 {
    
    public static void main(String[] args) {

        enum Dias {
            LUNES,
            MARTES,
            MIERCOLES,
            JUEVES,
            VIERNES,
            SABADO,
            DOMINGO
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número de 1 al 7: ");
        int ndia = sc.nextInt();

        switch (ndia) {
            case 1:
                System.out.println("Su día es: " + Dias.LUNES);
                break;
            case 2:
                System.out.println("Su día es: " + Dias.MARTES);
                break;
            case 3:
                System.out.println("Su día es: " + Dias.MIERCOLES);
                break;
            case 4:
                System.out.println("Su día es: " + Dias.JUEVES);
                break;
            case 5:
                System.out.println("Su día es: " + Dias.VIERNES);
                break;
            case 6:
                System.out.println("Su día es: " + Dias.SABADO);
                break;
            case 7:
                System.out.println("Su día es: " + Dias.DOMINGO);
                break;
            default:
                System.out.println("Error de ingreso de datos");
                break;
        }
        sc.close();
    }

}
