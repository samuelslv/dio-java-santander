import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    // Adiciona um livro ao catálogo.
    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    // Calcula a soma de todos os números na lista e retorna o resultado.
    public int calcularSoma() {
        int total = 0;

        for (Integer i : listaNumeros)
            total += i;
        return total;
    }

    // Encontra o maior número na lista e retorna o valor.
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()) {
          for (Integer numero : listaNumeros) {
            if (numero >= maiorNumero) {
              maiorNumero = numero;
            }
          }
          return maiorNumero;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    // Encontra o menor número na lista e retorna o valor.
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
          for (Integer numero : listaNumeros) {
            if (numero <= menorNumero) {
              menorNumero = numero;
            }
          }
          return menorNumero;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    // Retorna uma lista contendo todos os números presentes na lista.
    public void exibirNumeros() {
        if (!listaNumeros.isEmpty()) {
            System.out.println(this.listaNumeros);
          } else {
            System.out.println("A lista está vazia!");
          }
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(2000);
        numeros.adicionarNumero(2015);
        numeros.adicionarNumero(2020);
        numeros.adicionarNumero(1995);
        numeros.adicionarNumero(2004);
        numeros.adicionarNumero(1998);
    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");
    numeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos números = " + numeros.calcularSoma());

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior número = " + numeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor número = " + numeros.encontrarMenorNumero());
    }
}