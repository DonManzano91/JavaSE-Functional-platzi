package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NobresUtils;

import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> listaCursos = NobresUtils.obtenLista("Java", "ANgular", "C++");

        for (String cursos: listaCursos) {
            /*Proceder tradicional para operar datos de una lista*/
            String nuevoNombreCurso = cursos.replace("!", "!!");
            System.out.println("Cursos ejemplo: " + cursos);
        }
        /*Nota: Los streams solo pueden ser consumidos una vez, en este caso se ajusta el consumo de los mismos
        * para poder obtener un resultado*/
        Stream<String> streamCursos = Stream.of("Java", "ANgular", "C++");
        Stream<String> enfasisCurso = streamCursos.map(curso -> curso + "!");
        Stream<String> cursoJava = enfasisCurso.filter(curso -> curso.contains("Java"));
        cursoJava.forEach(System.out::println);
    }
}
