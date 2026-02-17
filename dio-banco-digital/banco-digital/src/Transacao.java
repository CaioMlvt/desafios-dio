import java.time.LocalDateTime;

public class Transacao {
    public enum Tipo { DEPOSITO, SAQUE, TRANSFERENCIA_ENVIADA, TRANSFERENCIA_RECEBIDA, JUROS, TARIFA }


    private final Tipo tipo;
    private final double valor;
    private final LocalDateTime momento;
    private final String descricao;


    public Transacao(Tipo tipo, double valor, String descricao){
            this.tipo = tipo;
            this.valor = valor;
            this.descricao = descricao;
            this.momento = LocalDateTime.now();
    }

    public Tipo getTipo(){return tipo;}
    public double getValor(){return valor;}
    public LocalDateTime getMomento(){return momento;}
    public String getDescricao(){return descricao;}

    @Override
    public String toString(){
        return String.format("[%s] %s: %.2f - %s", momento, tipo, valor, descricao);
    }

}

