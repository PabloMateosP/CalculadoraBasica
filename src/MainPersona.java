public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Torrente", "segura");
        Persona persona4 = new Persona("Belen", "Esteban");

        System.out.println("Persona1");
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Persona2");
        System.out.println("Nombre: " + persona2.nombre);
        System.out.println("Edad: " +persona2.edad);
        System.out.println("Persona3");
        System.out.println("Nombre: " + persona3.nombre);
        System.out.println("Edad: " + persona3.edad);
        System.out.println("Persona4");
        System.out.println("Nombre: " + persona4.nombre);
        System.out.println("Edad: " +persona4.edad);
    }
}
