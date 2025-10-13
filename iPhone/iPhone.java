// Classe iPhone.java
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos do Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    // Métodos do Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Métodos do Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Método principal para testar
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
