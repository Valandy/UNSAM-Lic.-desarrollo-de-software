public class Pelicula {
    
    String titulo;
    String director;
    int duracion;

    Pelicula(String t, String d, int l) {
        titulo = t;
        director = d;
        duracion = l;
    }

    public static void main() {

        Pelicula peli1 = new Pelicula("El septimo sello", "Ingmar Bergman", 160);
        Pelicula peli2 = new Pelicula("Underground", "Kusturika", 110);
        
        mostrarInfo(peli1);
        esLarga(peli1);
        mostrarInfo(peli2);
        esLarga(peli2);        
    }


    static void mostrarInfo(Pelicula peli) {
        System.out.println("Título: " + peli.titulo + " - Director: " + peli.director + " - Año: " + peli.duracion);
    }

    static void esLarga(Pelicula peli) {
        if (peli.duracion > 120) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
