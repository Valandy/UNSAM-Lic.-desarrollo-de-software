public class CocheMejorado {
    
    String marca;
    String modelo;
    int año;
    int velocidad;

    CocheMejorado(String mar, String mod, int a){
        marca = mar;
        modelo = mod;
        año = a;
        velocidad = 0;
    }
    public static void main() {

        CocheMejorado coche1 = new CocheMejorado("Chevrolet","Siena",1998);
        CocheMejorado coche2 = new CocheMejorado("Fiat","Uno",2006);

        mostrarInfo(coche1);
        mostrarInfo(coche2);

        coche1.cambiarVelocidad(25);
        getVelocidad(coche1);

        coche1.cambiarVelocidad(-50);
        getVelocidad(coche1);

        coche2.cambiarVelocidad(75);
        getVelocidad(coche2);
        
        coche2.cambiarVelocidad(10);
        getVelocidad(coche2);
    }

    static void mostrarInfo(CocheMejorado coche){
        System.out.println("Marca: " + coche.marca + ". Modelo: " + coche.modelo + ". Año: " + coche.año);
    }

    void cambiarVelocidad(int delta){
        velocidad += delta;
    }

    static void getVelocidad(CocheMejorado coche) {
        System.out.println("La velocidad actual del " + coche.marca + " es de " + coche.velocidad + " Km/h.");
    }

}


