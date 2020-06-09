package com.platzi.functional._10_chaining;

public class ExplicacionChaining {

    public static void main(String[] args) {
        StringBuilder creaCadenas = new StringBuilder();
        creaCadenas.append("Hola")
                .append("Mundo");
        /*El Stringbuilder es la clase que usaremos como ejemplo para el concepto de chaining, arriba la forma en que
        * se invoca, abajo, crearemos una persalizada para entender como funciona*/
        Encadenador encadenador = new Encadenador();
        encadenador.diHola().diAdios();
        Encadenador encadenador1 = new Encadenador();
        encadenador1.diAdios().diHola();
        /*Lo que estamos viendo aqui, es como vamos encadenando diferentes funciones aun objeto, así como
        lo haciamos en el append, aca va con distintos metodos del mismo objeto de modo que trabajamos con
        dicho objeto sin almacenar cada resultado por aparte.  */
    }

    /**
     * Devuelve una instancia de Encadenador en cada iteracion
     * */
    static class Encadenador{
        public Encadenador diHola(){
            System.out.println("Hola desde Chainer");
            return this;
        }

        public Encadenador diAdios(){
            System.out.println("Adios desde chainer");
            return this;
        }
    }
}
