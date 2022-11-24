package org.losremedios.daw1.prog.practica.ut3;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona("Torrente", "segura", 21);
        Persona persona4 = new Persona("Belen", "Esteban", 17);



        System.out.println("Persona1");
        System.out.println("Nombre: " + persona1.getNombre());
        persona1.setNombre("Francisco");
        persona1.NombreIniciales();

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        persona1.mayoredad();

        System.out.println("Persona2");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " +persona2.getEdad());
        persona2.mayoredad();
        persona2.NombreIniciales();

        System.out.println("Persona3");
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        persona3.mayoredad();

        System.out.println("Persona4");
        System.out.println("Nombre: " + persona4.getNombre());
        System.out.println("Edad: " +persona4.getEdad());
        persona4.mayoredad();



    }
}
