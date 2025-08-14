import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String cor;
    private int armazenamento;

    // Construtor
    public iPhone(String modelo, String cor, int armazenamento) {
        this.modelo = modelo;
        this.cor = cor;
        this.armazenamento = armazenamento;
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void avancar() {
        System.out.println("Avançando para a próxima música...");
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Chamada desligada.");
    }

    // Métodos da interface NavegadorInternet
    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void pesquisar(String termo) {
        System.out.println("Pesquisando por: " + termo);
    }

    @Override
    public void conectarInternet() {
        System.out.println("Conectando à internet...");
    }
}