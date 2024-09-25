package stream_api;

import java.util.Arrays;
import java.util.List;

/*
 * Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo
e exiba o resultado no console.
 */
public class Desafio15 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroNegativo = numeros.stream()
                .anyMatch(num -> num < 0);

        System.out.println("Existe algum numero neagtico? " + ((numeroNegativo) ? "Sim" : "Não"));
    }
}
