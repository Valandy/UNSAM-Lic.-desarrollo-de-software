public class Libro {
    
    String titulo;
    String autor;
    int año;

    Libro(String t, String a, int y){
        titulo = t;
        autor = a;
        año = y;
    }

    public static void main() {

        Libro libro1 = new Libro("Las ciudades invisibles","Italo Calvino",1965);
        Libro libro2 = new Libro("El cementerio de Praga","Umberto Eco",1962);
        Libro libro3 = new Libro("El evangelio según Jesucristo","Saramago",1943);

        mostrarInfo(libro1);
        mostrarInfo(libro2);
        mostrarInfo(libro3);

    }


    static void mostrarInfo(Libro l) {
        System.out.println("Título: " + l.titulo + " - Autor: " + l.autor + " - Año: " + l.año);
    }

}
