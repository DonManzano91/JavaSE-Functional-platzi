package com.platzi.functional._09_defaults;

public class FuncionString {

    @FunctionalInterface
    interface OperacionesString{
        /*Metodo abstracto que no tiene una definicion*/
        int obtenMonto();
        /*Este metodo si tiene una definición, al estar dentro de una interfaz, es necesario declararlo con la
        * palabra default, esta palabra ayuda a definir el cuerpo de dicho metodo*/
        default void operate(String texto){
            int x = obtenMonto(); /*damos valor a una variable, utilizando  metodo sin definicion*/
            while ( x --> 0){
                System.out.println(texto);
            }
        }
    }

    @FunctionalInterface
    interface HazOperacion{
        void toma(String texto);

        default void ejecutar(int x, String texto){
            while (x-->0){
                toma(texto);
            }
        }
    }

    public static void main(String[] args) {
        OperacionesString seis = () -> 6; /*Generamos una función basada in la interfaz anterior creada*/
        seis.operate("Alejandro");

        HazOperacion texto = texto1 -> System.out.println(texto1);
        texto.ejecutar(5, "Alej0");
    }
}
