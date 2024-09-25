package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/*
 * Desafio 12 - Encontre o produto de todos os números da lista:
Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
 */
public class Desafio12 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> multiplicar = (num1, num2) -> num1 * num2;

        // Imprimir o resultado da soma
        System.out.println("O produto de todos os números é: " + numeros.stream().reduce(1, multiplicar));

        System.out.println(
                "O produto de todos os números é: " + numeros.stream().reduce(1, new BinaryOperator<Integer>() {

                    @Override
                    public Integer apply(Integer num1, Integer num2) {
                        return (num1 * num2);
                    }

                }));
    }
}
