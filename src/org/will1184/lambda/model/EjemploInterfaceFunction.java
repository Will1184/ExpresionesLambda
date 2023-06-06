package org.will1184.lambda.model;

import org.will1184.lambda.aritmetica.Aritmetica;
import org.will1184.lambda.aritmetica.Calculadora;

public class EjemploInterfaceFunction {
    public static void main(String[] args) {
        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
        System.out.println(cal.computar(10, 5, (a, b) -> a * b));

        System.out.println(cal.computarConBiFuncional(10, 5, (a, b) -> a + b));
    }
}
