package stream_api;

import java.util.Arrays;
import java.util.List;

/*
 * Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
 */

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().filter(numero -> ((numero % 5 == 0 || numero % 3 == 0) && numero % 2 != 0))
                .forEach(System.out::println);

    }
}

/*
 * numeros.stream().filter(new Predicate<Integer>() {
 * 
 * @Override
 * public boolean test(Integer numero) {
 * if ((numero % 5 == 0 || numero % 3 == 0) && numero % 2 != 0) {
 * return true;
 * } else {
 * return false;
 * }
 * }
 * 
 * }).forEach(System.out::println);
 */
