import java.util.Scanner;

public class Ej_8 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        int cifras = num;

        System.out.print("La cantidad de cifras del numero es de: " + cifras);

        sc.close();

    }

}
