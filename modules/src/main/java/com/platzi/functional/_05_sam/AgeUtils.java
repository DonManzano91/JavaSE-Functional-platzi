package com.platzi.functional._05_sam;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {

    public static void main(String[] args) {
        Function<Integer, String> agregaCeros = x -> x<10 ? "0" + x : String.valueOf(x);
        TriFuncion<Integer, Integer, Integer, LocalDate> fechaLocalParseada =
                (dia, mes, year) -> LocalDate.parse(year + "-" + agregaCeros.apply(mes) + "-" + agregaCeros.apply(dia) );

        TriFuncion<Integer, Integer, Integer, Integer> calculaEdad =
                (dia, mes, year) -> Period.between(fechaLocalParseada.apply(dia, mes, year),
                        LocalDate.now()
                ).getYears();

        Integer edadCalculada = calculaEdad.apply(21, 03, 1991);
        System.out.println("La edad calculada es: " + edadCalculada);
    }

    /*La forma en la que se define en esta parte sera de forma muy generica, para que cuando se implemnte, se cuente
    * con un mayor detalle de los tipos de datos a usar(polimorfismo)*/
    @FunctionalInterface
    interface TriFuncion<T, U, V, R>{
        R apply(T t, U u, V v);
    }
}
