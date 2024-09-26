
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente samuel = new Cliente();
		samuel.setNome("Samuel");

		Conta veniltonCC = new ContaCorrente(venilton);
		Conta veniltonCP = new ContaPoupanca(venilton);
		Conta samuelCP = new ContaPoupanca(samuel);

		veniltonCC.depositar(100);
		veniltonCC.transferir(100, veniltonCP);

		samuelCP.depositar(500);
		samuelCP.transferir(5, veniltonCP);

		veniltonCC.imprimirExtrato();
		veniltonCP.imprimirExtrato();
		samuelCP.imprimirExtrato();
	}

}
