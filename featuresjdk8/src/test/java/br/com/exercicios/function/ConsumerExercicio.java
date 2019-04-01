package br.com.exercicios.function;

//Cronometrar um trecho de código utilizando uma função lambda


import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

public class ConsumerExercicio {

    @Test
    public void cronometrar() {
        Consumer<String> consumer = ConsumerExercicio::printNames;
        consumer.accept("Claudio");
        consumer.accept("Embracon");
    }

    private static void printNames(String name) {
        System.out.println(name);
    }

}
