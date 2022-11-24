package org.losremedios.daw1.prog.practica.ut3;

public class Main {
    final static Integer A = 2;
    final static Integer B = 3;

    /**
     * Si declarasemos tres valores a = 2,b = 3,c = 4 con la sobrecarga podemos llamar
     * basica.suma(a,c);
     * basica.suma(a,b,c);
     * y según los parámetros que pidamos en nuestra calculadorabásica y los parámetros que tenga nuestra opercion se eligirá una basica.suma o otra.
     * para hacerlo con números decimales debemos crear un:
     * final static Float A = 2.5F;
     * final static Float B = 3.3F;
     * final static Float C = 4.2F;
     * basica.suma(A,B);
     * basica.suma(A,B,C);
     */
    enum Operacion {
        suma, resta, multiplicacion, division
    }

    public static void main(String[] args) {
        CalculadoraBasica basica = new CalculadoraBasica();
        Operacion operacionSeleccionada = Operacion.suma;//Se pone .suma por poner un predefinido pero se puede poner uno cualquiera
        switch (operacionSeleccionada){
            case suma:
                System.out.println("La suma de " + A + " + " + B + " = " + basica.suma(A,B));
                break;
            case resta:
                System.out.println("La resta de " + A + " - " + B + " = " + basica.resta(A,B));
                break;
            case division:
                System.out.println("La division de " + A + " / " + B + " = " + basica.division(A,B));
                break;
            case multiplicacion:
                System.out.println("La multiplicacion de " + A + " x " + B + " = " + basica.multiplicacion(A,B));
        }
        //integer resultadoSUMA = basica.suma(A,B)
        //System.out.println("La suma de " + A + " + " + B + " = " + basica.suma(A,B));
        //integer resultadoRESTA = basica.resta(A,B)
        //System.out.println("La resta de " + A + " - " + B + " = " + basica.resta(A,B));
        //integer resultadoMULTIPLICACION = basica.multiplicacion(A,B)
        //System.out.println("La multiplicacion de " + A + " x " + B + " = " + basica.multiplicacion(A,B));
        //integer resultadoDIVISION = basica.division(A,B)
        //System.out.println("La division de " + A + " / " + B + " = " + basica.division(A,B));
    }
}