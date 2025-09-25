public class Ej7 {
    
    public static void main() {


        System.out.println(esBisiesto(2400));

    }

    static boolean esBisiesto(int a) {

        if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {

            return true;

        } else {
            return false;
        }
    }
}
