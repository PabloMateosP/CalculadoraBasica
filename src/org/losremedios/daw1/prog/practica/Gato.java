package org.losremedios.daw1.prog.practica;

public class Gato {
    private String nombre;
    private static String raza;
    Gato (String nombre){
        this.nombre = nombre;
    }
    String getNombre() {
        return nombre;
    }
    String getRaza() {
        return raza;
    }
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    void setRaza(String raza){
        this.raza = raza;
    }
}
