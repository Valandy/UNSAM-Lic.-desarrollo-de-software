public class PersonaAmpliada {

    String nombre;
    int edad;

    public static void main (String[] args) {

        PersonaAmpliada p1 = new PersonaAmpliada();
        p1.edad = 34;
        p1.nombre = "José";

        PersonaAmpliada p2 = new PersonaAmpliada();
        p2.edad = 26;
        p2.nombre = "María";

        PersonaAmpliada p3 = new PersonaAmpliada();
        p3.edad = 87;
        p3.nombre = "Jesus";

        saludar(p3);
        saludar(p2);
        saludar(p1);
    }

    public static void saludar(PersonaAmpliada persona) {
        System.out.println(persona.nombre + " " + persona.edad);
    }



}
