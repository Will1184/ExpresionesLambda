package org.will1184.lambda.aritmetica;

import java.util.function.BiFunction;
public class Calculadora {
    public  double computar(double a, double b, Aritmetica lambda){ //en lambda recibe sumar y restar
        return lambda.operacion(a,b);
    }
    public double computarConBiFuncional (double a , double b , BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a,b);
    }
}
