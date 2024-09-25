package stream_api;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Desafio 14 - Encontre o maior número primo da lista:
Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
 */
public class Desafio14 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maiorPrimo = numeros.stream()
                .sorted((Integer n1, Integer n2) -> n2.compareTo(n1))
                .filter(num -> num % 2 != 0)
                .toList();

        System.out.println(maiorPrimo.get(0));

        List<Integer> maiorPrimo1 = numeros.stream().sorted(new Comparator<Integer>() {

            @Override
            public int compare(Integer n1, Integer n2) {
                return n2.compareTo(n1);
            }

        }).filter(new Predicate<Integer>() {

            @Override
            public boolean test(Integer num) {
                if (num % 2 != 0) {
                    return true;
                } else {
                    return false;
                }
            }

        }).toList();

        System.out.println(maiorPrimo1.get(0));
    }
}
