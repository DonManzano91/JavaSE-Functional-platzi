package com.platzi.functional._14_optionals;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

/**
 * @author Alex Manzano
 * Uso y ejemplos de las funciones "Optional"
 * */
public class Opcionales {
    public static void main(String[] args) {
        List<String> nombres = obtenNombres();
        if (nombres != null){
             /*Operar con esta lista, aqui se puede generar una validación para generar datos por default, por
             * ejemplo */
        }

        Optional<List<String>> nombresOpcionales = obtenerNombresOpcionales();
        if (nombresOpcionales.isPresent()){
            /*Esta es otra forma de hacer lo de arriba, iterar sobre null, pero con funciones optional, sin
            * embargo, esto puede ser mejor optimizado para ser mas funcional*/
        }

        /*Instanciado el objeto anterior, esta otra funcion genera una lambda para poder así operar solo cuando
        * el objeto no sea nulo*/
        nombresOpcionales.ifPresent(nombresContenidos -> nombresContenidos.forEach(System.out::println));

        Optional<String> jugadorValioso = jugadorDeValorOpcional();

        String valorJugadorValioso = jugadorValioso.orElseGet(() -> "No hay dato");



    }
    /*Estos metodos serviran para la operación de arriba, estos metodos NO utilizan "optional" */
    static List<String> obtenNombres(){
        List<String> lista = new LinkedList<>();

        return Collections.emptyList();
    }

    static String JugadoresMasValiosos(){
        //return ""; Esta es la diferencia entre devolver un conjunto vacio, y regresar un nulo
        return null;
    }

    static int objetoMasCaro(){
        return -1;
    }
    /*Estos metodos serviran para llenar la operación del metodo main, estos utilizaran "optional"*/
    static Optional<List<String>> obtenerNombresOpcionales(){
        List<String> listaNombres = new LinkedList<>();
        /*Arriba bien que mal se debe llenar o no, los datos que le pudieran entrar a este metodo*/
        return Optional.of(listaNombres);
    }

    static Optional<String> jugadorDeValorOpcional(){
        /*Simulación de un caso cuando una llamada a base de datos regresa un nulo, encontraremos que en este caso,
        * podremos devolver un objeto vacio para evitar un nullpointer*/
        //return Optional.ofNullable();

        try {
            //Operaciones y validación correcta de un tipo
            return Optional.of("simul Valor encontrado ok");
        } catch (Exception e){
            e.printStackTrace();
        }

        return Optional.empty();
    }

}
