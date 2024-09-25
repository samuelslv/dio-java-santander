package stream_api;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

/*
 * Desafio 13 - Filtrar os números que estão dentro de um intervalo:
Utilize a Stream API para filtrar os números que estão dentro de um intervalo
específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
 */
public class Desafio13 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Scanner ler = new Scanner(System.in);

        System.out.print("Intervalo entre: ");
        final Integer num1 = ler.nextInt();
        System.out.print(" e ");
        final Integer num2 = ler.nextInt();

        // Imprimir o resultado da soma
        System.out.println(
                "O intervalo de numeros entre 5 e 10 é: "
                        + numeros.stream().sorted().filter(num -> num1 < num && num < num2).toList());

        // Imprimir o resultado da soma
        System.out.println(
                "O intervalo de numeros entre 5 e 10 é: " + numeros.stream().sorted().filter(new Predicate<Integer>() {

                    @Override
                    public boolean test(Integer num) {
                        if (num1 < num && num < num2) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }).toList());
        ler.close();
    }
}
