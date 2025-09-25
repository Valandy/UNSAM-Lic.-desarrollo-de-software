public class Estudiante {
    String nombre;
    double nota1, nota2, nota3;

    Estudiante(String n, double n1, double n2, double n3) {
        nombre = n;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }

    public static void main() {
       
        Estudiante est1 = new Estudiante("Pepito", 10, 7, 4);
        Estudiante est2 = new Estudiante("Laurita", 4, 6, 10);

        System.out.println(est1.nombre + " " + calcularPromedio(est1));
        System.out.println(est2.nombre + " " + calcularPromedio(est2));

    }

    static double calcularPromedio(Estudiante estudiante) {
        return (estudiante.nota1+estudiante.nota2+estudiante.nota3)/3;
    }
}
