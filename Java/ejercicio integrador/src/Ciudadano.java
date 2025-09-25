import java.util.Scanner;

public class Ciudadano {
    
    String apellido;
    String nombre;
    enum Tramite {
        NINGUNO,
        DOCUMENTO,
        REGISTRO_AUTO,
        ABRIR_EMPRESA};
    Tramite tramite;
    Fecha nacimiento;
    
    Ciudadano(String a, String nom, Fecha nac) {

        apellido = a;
        nombre = nom;
        tramite = Tramite.NINGUNO;
        nacimiento = nac;

    }

    public int getEdad() {

        return nacimiento.distanciaEnAnios(Fecha.hoy());

    }

    public void setTramite() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Elija el trámite a realizar");
        int nrotramite = sc.nextInt();

        switch (nrotramite) {
            case 1:
                this.tramite = Tramite.DOCUMENTO;
                break;
            case 2:
                if (this.getEdad() < 16) {
                    System.out.println("Para realizar el trámite requiere ser mayor o tener 16 años");
                    tramite = Tramite.NINGUNO;
                } else {
                    this.tramite = Tramite.REGISTRO_AUTO;
                }
                break;
            case 3:
                if (this.getEdad() < 18) {
                    System.out.println("Para realizar el trámite requiere ser mayor o tener 18 años");
                    tramite = Tramite.NINGUNO;
                } else {
                    this.tramite = Tramite.ABRIR_EMPRESA;
                }
                break;
        
            default:
                this.tramite = Tramite.NINGUNO;
                break;
        }              
        System.out.println("Su situación actual es: " + tramite);
        sc.close();
    }

}

