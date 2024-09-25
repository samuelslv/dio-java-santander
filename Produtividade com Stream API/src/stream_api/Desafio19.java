package stream_api;

import java.util.Arrays;
import java.util.List;

/*
 * Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
Com a Stream API, encontre a soma dos números da lista que são divisíveis
tanto por 3 quanto por 5 e exiba o resultado no console.
 */
public class Desafio19 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos = numeros.stream()
                .filter(Desafio17::ehPrimo) // Usar método auxiliar para verificar se é primo
                .toList();

        // Exibir os números primos
        System.out.println("Numeros primos:" + numerosPrimos);
    }

    // Método auxiliar para verificar se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
