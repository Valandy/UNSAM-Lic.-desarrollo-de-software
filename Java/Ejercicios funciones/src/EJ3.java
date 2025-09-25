public class EJ3 {
    
    public static void main() {

        conversionHoraMinuto(119);

    }

    static void conversionHoraMinuto(int minuto) {

        int horas = minuto / 60;
        int resto = minuto % 60;

        System.out.println(minuto + " minutos es equivalente a " + horas + " horas y " + resto + " minutos.");

    }

}
