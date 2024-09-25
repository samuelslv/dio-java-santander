package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/*
 * Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
Com a Stream API, encontre a soma dos números da lista que são divisíveis
tanto por 3 quanto por 5 e exiba o resultado no console.
 */
public class Desafio19 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0) // Usar método auxiliar para verificar se é primo
                .toList();

        String somaDivisivei3e5 = numeros.stream()
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0) // Usar método auxiliar para verificar se é primo
                .reduce(new BinaryOperator<Integer>() {

                    @Override
                    public Integer apply(Integer num1, Integer num2) {
                        return num1 + num2;
                    }

                }).toString();

        // Exibir os números primos
        System.out.println("Numeros primos:" + numerosPrimos);
        System.out.println("Numeros primos:" + somaDivisivei3e5);
    }

}
