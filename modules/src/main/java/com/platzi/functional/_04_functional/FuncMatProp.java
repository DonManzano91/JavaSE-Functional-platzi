package com.platzi.functional._04_functional;

import java.sql.SQLOutput;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Alex Manzano
 * @Version 1.0
 * @implNote Clase generada para ejemplificar funciones en java
 */
public class FuncMatProp {
    public static void main(String[] args) {
        Function<Integer, Integer> cuadrado = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(cuadrado.apply(12));
        /*Abajo dice: entra x, devuelve un boolean el modulo de x es igual a 1(aprox)*/
        Function<Integer, Boolean> esImpar = x -> x % 2 == 1;
        System.out.println("Resultado con Func: " + esImpar.apply(4));
        //En este caso Predicate hace lo mismo que la funcion de arriba de forma automatica
        //pero solo es para obtener estos boolean, cualquier otro tipo de resultado, sera de buscarlo
        //con Function
        Predicate<Integer> estaPar = x -> x % 2 == 0;
        estaPar.test(4);
        System.out.println("Resultado con Pred: " + estaPar.test(4));

        Predicate<Estudiante> aprobado = estudiante -> estudiante.getCalificacion() >= 6.0;
        System.out.println("Aprobo el estudiante: " + aprobado.test(new Estudiante(5.0)));

    }

    public static class Estudiante{
        private double calificacion;

        public Estudiante(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}
