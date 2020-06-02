package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NobresUtils;

import java.util.List;
import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {
        Function<Integer, String> fCambiaPorString = x -> "CambioPorDos: " + (x*2);

        List<String> alumnos = NobresUtils.obtenLista("Juan", "Pepito", "Sutano");
        /*Aqui la inferencia de tipos es explicita, se declara el tipo de dato de la variable "nombre" */
        alumnos.forEach((String nombre) -> System.out.println(nombre));
        /*Aqui la inferencia de tipos es implicita, no hace falta la declaración explicita del tipo String */
        alumnos.forEach(nombre -> System.out.println(nombre));
        /*Aqui se declara el operador de referencia*/
        alumnos.forEach(System.out::println);
    }
}
