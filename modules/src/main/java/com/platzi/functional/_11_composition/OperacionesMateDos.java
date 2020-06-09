package com.platzi.functional._11_composition;

import java.util.function.Function;

public class OperacionesMateDos {
    public static void main(String[] args) {
        Function<Integer,Integer> multiplicaPorTres = x -> {
            System.out.println("Multiplicando x: " + x + " Por tres");
            return x * 3;
        };

        /*Aqui al utilizar la composicion, primero se ejecuta la suma "local"  y despues la multiplicación de
        * la funcion que la invoca*/

        Function<Integer, Integer> sumMultipPorTres =
                multiplicaPorTres.compose(y -> {
                    System.out.println("Sumando uno al resultado de MultiplicaPorTres da: " + y);
                    return y + 1;
                });
        /*Aca se hace lo contrario acorde el orden de invocacion de funciones, primero se ejecuta la que invoca
        * despues se ejecuta lo "local" */
        Function<Integer, Integer> elevaAlCuadrad =
                multiplicaPorTres.andThen( z -> {
                    System.out.println("Se eleva al cuadrado el resultado de multiplicaPorTres: " + z);
                    return z*z;
                });



        /*En esta parte veremos como se hace la añadidura de ambas funciones*/
        System.out.println(sumMultipPorTres.apply(4));
        System.out.println(elevaAlCuadrad.apply(2));
    }
}
