package br.com.core;

import java.util.Arrays;
import java.util.List;

/**
 * Mostra um exemplo de como normalmente é feito o
 * código para percorrer uma lista e imprimir os valores dentro dela.
 */
public class ImprimirLista {

    public static void main(String[] args) {

        /**
         * Sem Lambda
         */
        System.out.println("Imprime todos os elementos da lista!");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for(Integer n: list) {
            System.out.println(n);
        }

        /**
         * Com Lambda
         */
        System.out.println("Imprime todos os elementos da lista!");
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list2.forEach(n -> System.out.println(n));

        /***
         * Só os pares
         */
        System.out.println("Imprime todos os elementos pares da lista!");
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list3.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

        /**
         * O quadrado
         */
        System.out.println("Imprime o quadrado de todos os elementos da lista!");
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list4.forEach(n -> System.out.println(n * n));


    }

}
