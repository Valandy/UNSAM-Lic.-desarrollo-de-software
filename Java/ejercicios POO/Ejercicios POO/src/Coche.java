public class Coche {
    
    String marca;
    String modelo;
    int año;

    Coche(String mar, String mod, int a){
        marca = mar;
        modelo = mod;
        año = a;
    }
    public static void main() {

        Coche coche1 = new Coche("Chevrolet","Siena",1998);
        Coche coche2 = new Coche("Fiat","Uno",2006);

        mostrarInfo(coche1);
        mostrarInfo(coche2);
    }


    static void mostrarInfo(Coche coche){
        System.out.println("Marca: " + coche.marca + ". Modelo: " + coche.modelo + ". Año: " + coche.año);
    }

}
