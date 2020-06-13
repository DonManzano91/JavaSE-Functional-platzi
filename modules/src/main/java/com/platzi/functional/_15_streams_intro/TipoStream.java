package com.platzi.functional._15_streams_intro;

import java.util.stream.IntStream;

public class TipoStream {
    public static void main(String[] args) {
        IntStream streamInfinito = IntStream.iterate(0, x -> x+1);
        streamInfinito.limit(1000)
                .parallel() //Esta funcion ayuda para poder correr este proceso en un nucleo paralelo
                .filter(x-> x % 2 == 0)
                .forEach(System.out::println);
    }
}
