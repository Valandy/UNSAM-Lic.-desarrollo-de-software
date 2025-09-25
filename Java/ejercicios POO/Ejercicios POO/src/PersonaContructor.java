public class PersonaContructor {
    
    String nombre;
    int edad;

    PersonaContructor(String n, int e){
        nombre = n;
        edad = e;
    }
    public static void main() {

        PersonaContructor p1 = new PersonaContructor("josé", 34);
        PersonaContructor p2 = new PersonaContructor("florencia", 25);
        PersonaContructor p3 = new PersonaContructor("pepito", 78);

        saludar(p1);
        saludar(p2);
        saludar(p3);  
    }

    static void saludar(PersonaContructor persona) {
        System.out.println(persona.nombre + " " + persona.edad);
    }

}
