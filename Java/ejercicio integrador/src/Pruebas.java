import java.util.Scanner;

public class Pruebas {
    
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese apellido y nombre del ciudadano a registrar: ");
        Ciudadano c1 = new Ciudadano(sc.nextLine(), sc.nextLine(), new Fecha(0, 0, 0));

        System.out.println("Ingrese fecha de nacimiento del ciudadano en este orden: dia, mes, año: ");
        c1.nacimiento.dia = sc.nextInt();
        c1.nacimiento.mes = sc.nextInt();
        c1.nacimiento.año = sc.nextInt();

        System.out.println("Apellido: "+ c1.apellido);
        System.out.println("Nombre: " + c1.nombre);
        System.out.print(c1.nacimiento.dia + "/");
        System.out.print(c1.nacimiento.mes+"/");
        System.out.println(c1.nacimiento.año);

        System.out.println(c1.getEdad());

        c1.setTramite();



        sc.close();
    }

}
