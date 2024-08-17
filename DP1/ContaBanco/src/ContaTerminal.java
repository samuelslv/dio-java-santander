import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, qual o seu nome?");
        nomeCliente = scanner.nextLine();
        System.out.println("qual o número da sua Agência?");
        agencia = scanner.nextLine();
        System.out.println("qual o número da sua Conta?");
        numero = scanner.nextInt();
        System.out.println("defina o seu saldo");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}

public static void main(String[] args) {
    double alturaJoao = 1.46;
    double alturaMarcos = 1.37;
    if (alturaMarcos > alturaJoao)
        System.out.println("João é mais alto que Marcos");
    else
        System.out.println("Marcos é mais baixo que João");
}
