
public class ContaPoupanca extends Conta {

	private final double taxaJurosAnual; //ex: 0.05 = 5% ao ano
	  public ContaPoupanca(int numero, Cliente cliente, double taxaJurosAnual) {
        super(numero, cliente);
        this.taxaJurosAnual = taxaJurosAnual;
    }

    @Override
    protected boolean podeSacar(double valor) {
        return saldo >= valor;
    }

    // aplicar juros simples mensal (aprox): taxaAnual / 12
    public void aplicarJurosMensal() {
        double juros = saldo * (taxaJurosAnual / 12.0);
        saldo += juros;
        extrato.add(new Transacao(Transacao.Tipo.JUROS, juros, "Juros mensais"));
    }

	
}
