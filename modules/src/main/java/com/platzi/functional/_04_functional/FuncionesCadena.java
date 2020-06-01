package com.platzi.functional._04_functional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class FuncionesCadena {
    public static void main(String[] args) {
        /*Este es un operador basado en una función que toma y arroja el mismo tipo de objeto*/
        UnaryOperator<String> quote = texto -> "\"" + texto+ "\"";
        UnaryOperator<String> exclamacion = texto -> texto + "!";
        String encomillar = quote.apply("hola culero ");
        String exclamar = exclamacion.apply(encomillar);
        System.out.println(exclamar);

        BiFunction<Integer, Integer, Integer> multiplica = (x, y) -> x*y;
        Integer resultado = multiplica.apply(5, 5);
        System.out.println(resultado);

        BiFunction<String, Integer, String> sangriaIzquierda =
                (text, espacios) -> String.format("%" + espacios +  "s" , text);

        String palabraConSangria = sangriaIzquierda.apply("Alex", 20);

        System.out.println(palabraConSangria);
    }
}
