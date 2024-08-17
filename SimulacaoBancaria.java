import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            /*
             * System.out.println("1- Depositar\r\n" + //
             * "2- Sacar\r\n" + //
             * "3- Consultar Saldo\r\n" + //
             * "4- Encerrar");
             */
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.print("Deposito: ");
                    saldo = scanner.nextDouble();
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.print("Saque: ");
                    double valor = scanner.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo = saldo - valor;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    }

                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}