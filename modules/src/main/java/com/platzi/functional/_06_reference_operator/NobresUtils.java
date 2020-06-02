package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NobresUtils {
    public static void main(String[] args) {
        List<String> profesores = obtenLista("ale", "d", "fer", "jonas");
        Consumer<String> impresor = texto -> System.out.println(texto);
        profesores.forEach(impresor);
        System.out.println("----DIVISOR----");
        /*El operador :: ayuda para que al invocar un metodo, este  busca la funcion directamente definida
        * en el objeto que lo invoca, en estcaso, imprimira directamente el unico metodo referenciado*/
        profesores.forEach(System.out::println);
        /*De esta nueva forma, no sera necesario generar un consumer nuevo*/

    }


    public static <T> List<T> obtenLista(T... elements){
        return Arrays.asList(elements);
    }
}
