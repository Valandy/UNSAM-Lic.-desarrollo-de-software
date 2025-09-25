public class Rectangulo {
    
    int ancho;
    int alto;

    Rectangulo(int h, int w){
        alto = h;
        ancho = w;
    }

    public static void main() {

        Rectangulo r1 = new Rectangulo(20,15);
        Rectangulo r2 = new Rectangulo(5, 8);

        r1.calcularArea(r1);
        r1.calcularPerimetro(r1);
        r2.calcularArea(r2);
        r2.calcularPerimetro(r2);
    }

    void calcularPerimetro(Rectangulo r) {
        System.out.println(2*r.ancho+2*r.alto);
    } 

    void calcularArea(Rectangulo r) {
        System.out.println(r.ancho*r.alto);
    } 
}
