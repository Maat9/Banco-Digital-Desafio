
public class Main {

	public static void main(String[] args) {
		Cliente matheus = new Cliente();
		matheus.setNome("Matheus");
		
		Conta cc = new ContaCorrente(matheus);
		Conta cp = new ContaPoupanca(matheus);

		cc.depositar(100);
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cc.transferir(100, cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cp.transferir(50, cc);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
