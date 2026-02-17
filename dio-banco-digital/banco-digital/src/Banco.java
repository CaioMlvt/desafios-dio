import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Banco {

	private final Map<Integer, Conta> contas = new HashMap<>();
	private final List<Cliente> clientes = new ArrayList<>();
	private final AtomicInteger sequenciaConta = new AtomicInteger(1000);

	public Cliente criarCliente(String nome, String cpf, String email){
		Cliente c = new Cliente(nome, cpf, email);
		clientes.add(c);
		return c;
	}

	  public Conta abrirContaCorrente(Cliente cliente, double limite, double tarifaMensal) {
        int numero = sequenciaConta.getAndIncrement();
        ContaCorrente cc = new ContaCorrente(numero, cliente, limite, tarifaMensal);
        contas.put(numero, cc);
        return cc;
    }

    public Conta abrirContaPoupanca(Cliente cliente, double taxaJurosAnual) {
        int numero = sequenciaConta.getAndIncrement();
        ContaPoupanca cp = new ContaPoupanca(numero, cliente, taxaJurosAnual);
        contas.put(numero, cp);
        return cp;
    }

	public Optional<Conta> buscarConta(int numero){
		return Optional.ofNullable(contas.get(numero));
	}

	public List<Conta> listarContas(){
		return new ArrayList<>(contas.values());
	}

	public List<Conta> contasComSaldoMaiorQue(double limite){
		return contas.values().stream().filter(c -> c.getSaldo() > limite).collect(Collectors.toList());
	}

	public boolean fecharConta(int numero){
		return contas.remove(numero) != null;
	}




}
