package org.losremedios.daw1.prog.practica.ut3;

public class aleatorio {
    public static void main(String[] args) {
    int max = 100;
    int A = (int)Math.floor(Math.random()*max);
    int b = (int)Math.floor(Math.random()*max);
        if ( A < b) {
            System.out.println("El mayor es: " + A);
        } else if (A == b) {
            System.out.println("Ambos números son iguales");
        } else {
            System.out.println("El mayor es: " + b);
        }
    }
}