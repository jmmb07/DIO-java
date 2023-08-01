public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Maria");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);

		cc.depositar(250);
		cc.transferir(poupanca, 300);


		cc.imprimirInfosComuns();
		poupanca.imprimirInfosComuns();

	}

}