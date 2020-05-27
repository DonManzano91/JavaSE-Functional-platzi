package com.platzi.functional._04_functional;

import java.util.function.Function;

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
                return x*x;
            }
        };

        System.out.println(cuadrado.apply(12));
    }
}
