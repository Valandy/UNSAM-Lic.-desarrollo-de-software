public class Ej6 {
    
    public static void main() {

        farenheitAcelsius(32);

    }

    static void farenheitAcelsius(float f) {

        if (f < -459.67) {

            System.out.println("Valor no válido");

        } else {

            float c = ((f-32)/9)*5;
            System.out.println("La temperatura en celsius es de: " + c + " grados");

        }

    }

}
