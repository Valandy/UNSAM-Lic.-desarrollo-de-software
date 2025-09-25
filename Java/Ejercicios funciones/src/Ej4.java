public class Ej4 {
    
    public static void main() {

        factorial(6);

    }

    static void factorial(int a)  {

        for (int i = a-1 ; i > 0; i--) {
            
            a = a*i;

        }

        System.out.println(a);

    }

}
