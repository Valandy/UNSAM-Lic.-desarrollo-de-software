public class Ej5 {
    
    public static void main() {

        System.out.println(esPrimo(999999999989L));
        
    }

    static boolean esPrimo(long a) {

        long b = Math.round(Math.sqrt(a));
        
        for (long i = b; i>1; i--) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
