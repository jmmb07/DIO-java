public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

    @Override
	public void imprimirInfosComuns() {
		System.out.println("\n==== Extrato Conta Poupança ====");
		super.imprimirInfosComuns();
	}
}