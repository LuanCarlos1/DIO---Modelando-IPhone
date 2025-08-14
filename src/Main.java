public class Main {
    public static void main(String[] args) {

            iPhone meuIphone = new iPhone("iPhone 13", "Preto", 128);

            // Testando Reprodutor Musical
            meuIphone.tocar();
            meuIphone.pausar();
            meuIphone.avancar();

            // Testando Aparelho Telefônico
            meuIphone.fazerChamada("123456789");
            meuIphone.atenderChamada();
            meuIphone.desligarChamada();

            // Testando Navegador Internet
            meuIphone.abrirPagina("www.google.com");
            meuIphone.pesquisar("Java");
            meuIphone.conectarInternet();
    }
}
