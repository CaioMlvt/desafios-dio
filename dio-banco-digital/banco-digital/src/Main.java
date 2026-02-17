
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();

		Cliente caio = banco.criarCliente("Caio Malavota", "111.123.456.88", "caio@gmail.com");
		Cliente maria = banco.criarCliente("Maria Silva", "123.456.789.00", "maria@gmail.com");

		Conta ccCaio = banco.abrirContaCorrente(caio, 500, 10.0);
		Conta cpMaria = banco.abrirContaPoupanca(maria, 0.05);

		ccCaio.depositar(1500);
		cpMaria.depositar(2000);

		ccCaio.transferirPara(cpMaria, 200);

		//aplicando tarifa
		if(cpMaria instanceof ContaPoupanca){
			((ContaPoupanca) cpMaria).aplicarJurosMensal();
		}

		//cobrar tarifa c corrente
		if(ccCaio instanceof ContaCorrente){
			((ContaCorrente) ccCaio).cobrarTarifaMensal();
		}

		 System.out.println("--- Contas ---");
        banco.listarContas().forEach(System.out::println);

        System.out.println("\n--- Extrato Conta Caio ---");
        ccCaio.getExtrato().forEach(System.out::println);

        System.out.println("\n--- Extrato Conta Maria ---");
        cpMaria.getExtrato().forEach(System.out::println);

        // exemplo de uso de Collections/Stream: contas com saldo > 1000
        System.out.println("\n--- Contas com saldo > 1000 ---");
        banco.contasComSaldoMaiorQue(1000).forEach(System.out::println);



	}

}
