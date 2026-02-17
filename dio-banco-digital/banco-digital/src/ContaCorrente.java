
public class ContaCorrente extends Conta {

	private final double limite; //cheque especial
	private final double tarifaMensal;

	public ContaCorrente(int numero, Cliente cliente, double limite, double tarifaMensal){
		super(numero, cliente);
		this.limite = limite;
		this.tarifaMensal = tarifaMensal;
	}
	
	@Override
	protected boolean podeSacar(double valor){
		return saldo + limite >= valor;
	}

	public void cobrarTarifaMensal(){
		double valor = tarifaMensal;
		saldo -= valor;
		extrato.add(new Transacao(Transacao.Tipo.TARIFA, -valor, "Tarifa mensal"));
	}

}
