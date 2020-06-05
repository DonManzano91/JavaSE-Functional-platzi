package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NobresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NobresUtils.obtenLista("Java", "C#", "POO");
        /*Esto es una lambda, es una función que se genera de forma puntual, y solo puede ser usada de esa forma
        * en ese momento solamente, para esta acción solamente*/
        cursos.forEach(curso -> System.out.println(curso));

        /*En esta parte tambien se ejecuta el uso de una lambda*/
        BiFunction<Integer, Integer, Integer> s = (x, y) -> x * y;

        /*Implementación de una lambda cuyos argumentos estan vacio y el valor de retorno esta previamente declarado*/
        usarCero(() ->2);

        /*Implentación de la sintaxis, de lambda en un predicado, recordar que estas funciones se usan para obtener
        * booleanos, sirven bien para las validaciones, esta lambda esta definida por un tipo, el cual esta declarado
        * en el metodo abstracto que la define*/

        usarPredicado(texto -> texto.isEmpty());

        /*Como la lambda que se aprecia mas arriba para una BiFunction, esta primera genera el mismo resultado, pero
        * auxiliada de un metodo estatico declarado aparte*/
        usarBiFuncion((x, y) -> x*y);
        /*La funcion anterior, puede tener una implementación con un alcanc un poco mayor al ser habilitado el uso
        * de las llaves para obtener una serie de resultados mas elaborados, esto acorde la logica de negocio que sea
        * requerida*/
        usarBiFuncion((x,y) ->{
            System.out.println("Retorna x: "+ x +"elevado a la potencia y: " + y);
            Integer z = x^y;
            return z;
        }); /*Aqui si hay que usar el return, por normatividad cuando se usan llaves, se usa el return*/

        /*Sintaxis un poco mañosa, no recibe ningun parametro, y no devuelve ningun resultado*/
        //usarNada(()->{});
        /*Implementandole una funcionalidad adicional*/
        usarNada(()->{
            System.out.println("Hola desde la lambda sin argumento, que arroja nada");
        });




    }

    static void usarPredicado(Predicate<String> predicado){

    }

    static void usarCero(CeroArgumentos ceroArgumentos){

    }

    static void usarBiFuncion(BiFunction<Integer, Integer, Integer> operacion){

    }

    static void usarNada(OperarNada operarNada){

    }

    @FunctionalInterface
    interface CeroArgumentos {
        int get();
    }

    @FunctionalInterface
    interface OperarNada{
        void nada();
    }
}
