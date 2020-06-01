package com.platzi.functional._04_functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CLIArgumentosUtils {
    static void muestraAyuda(CLIArumentos cliArumentos){
        /*Interfaz generica que trabaja sobre un tipo de dato*/
        Consumer<CLIArumentos> consumerAyuda = cliArumentos1 -> {
            if (cliArumentos.isAyuda()){
                System.out.println("Se mando llamar la ayuda");
            }
        };

        consumerAyuda.accept(cliArumentos);
    }

    static CLIArumentos generaCLI(){
        Supplier<CLIArumentos> generador = () -> new CLIArumentos();

        return generador.get();
    }
}
