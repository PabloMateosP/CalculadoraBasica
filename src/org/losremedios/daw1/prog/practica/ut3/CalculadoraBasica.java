package org.losremedios.daw1.prog.practica.ut3;

public class CalculadoraBasica {
    Integer suma(Integer A, Integer B) {
        return A + B;
    }
    Integer resta(Integer A, Integer B) {
        return A - B;
    }
    Integer multiplicacion(Integer A, Integer B) {
        return A * B;
    }
    Integer division(Integer A, Integer B){
        return A / B;
    }
}
/**
 * Haciendo una sobrecarga de datos podemos hacer que haya integer con mismos nombre aunque se hará una cosa según el número de parámetros dentro (Mejor explicado en main)
 * integer suma (a, b) se llamará a la operación "basica.suma(de dos parámetros)"
 * mientras que si ponemos un integer suma (a,b,c) será llamada la operación "básica.suma(de tres parámetros)"
 * Si queremos hacer con numeros decimales deberemos hacer un:
 * Float suma (A, B){
 *     return a + b y buscará el valor de dos parametros float
 * }
 * +CON UN FLOAT NO OLVIDAR LA F DESPUES DEL VALOR+
 */