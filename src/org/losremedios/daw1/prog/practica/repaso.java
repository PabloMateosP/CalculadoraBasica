package org.losremedios.daw1.prog.practica;

import org.losremedios.daw1.prog.practica.Gato;

public class repaso {
    public static void main(String[] args){
        System.out.println("Hello world");
        Saludar("Manolo");

        //Creamos un gato
        String s = "miCadena";
        //Constructor por defecto es el mismo de nombre que la clase en este caso org.losremedios.daw1.prog.practica.Gato
        Gato misifu = new Gato("Misifú");
        Gato isidoro = new Gato ("Isidoro");
        Gato sonia = new Gato ("Sonia");
        System.out.println("Mi gato se llama: " + misifu.getNombre());
        System.out.println("Mi gato se llama: " + isidoro.getNombre());
        System.out.println("Mi gato se llama: " + sonia.getNombre());

        //Cambiamos nombre al gato
        //Cuando ponemos el punto (operador de acceso) nos aparecen las funciones que se pueden hacer
        misifu.setNombre("Pedro");
        System.out.println("Mi gato Misifu ahora se llama: " + misifu.getNombre());

    }
    public static void Saludar (String nombre){
        System.out.println("Hola " + nombre);
    }
}