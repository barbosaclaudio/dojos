package br.com.exercicios.function;

//Cronometrar um trecho de código utilizando uma função lambda

import java.util.function.Supplier;

public final class Cronometro {

    public static <T> T cronometrar(Supplier<T> supplier) {
        long start = System.currentTimeMillis();
        T result = supplier.get();
        long end = System.currentTimeMillis();
        System.out.println("Milisegundos = " + (end - start));
        return result;
    }

}