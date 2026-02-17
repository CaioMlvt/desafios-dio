import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public abstract class Conta {
	
	protected final int numero;
	protected final Cliente cliente;
	protected double saldo;
	protected final List<Transacao> extrato = new ArrayList<>();

	public Conta(int numero, Cliente cliente){
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0.0;
	}

	public int getNumero() {
		return numero;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor){
		if(valor <= 0) throw new IllegalArgumentException("Valor deve ser maior que 0");
		saldo += valor;
		extrato.add(new Transacao(Transacao.Tipo.DEPOSITO, valor, "Deposito"));
	}

	public boolean sacar(double valor){
		if(valor <= 0) throw new IllegalArgumentException("Valor deve ser maior que 0");
		if(!podeSacar(valor)){
			return false;
		}
		saldo -= valor;
		extrato.add(new Transacao(Transacao.Tipo.SAQUE, valor, "Saque"));
		return true;
	}

	protected abstract boolean podeSacar(double valor);

	public boolean transferirPara(Conta destino, double valor){
		if(this == destino) return false;
		boolean ok = this.sacar(valor);
		if(!ok) return false;
		destino.depositar(valor);
		this.extrato.add(new Transacao(Transacao.Tipo.TRANSFERENCIA_ENVIADA, -valor, "Transferido para conta:" + destino.getNumero()));
		destino.extrato.add(new Transacao(Transacao.Tipo.TRANSFERENCIA_RECEBIDA, +valor, "Transacao recebida da conta:" + this.getNumero()));
		return true;
	}

	public List<Transacao> getExtrato(){
		return Collections.unmodifiableList(extrato);
	}

	@Override
	public String toString(){
		return String.format("Conta #%d - %s - Saldo: %.2f", numero, cliente.getNome(), saldo);
	}
}
