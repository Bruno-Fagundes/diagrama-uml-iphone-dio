import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        System.out.print("\n\nReprodutor de Musica");

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        reprodutorMusical.selecionarMusica();
        reprodutorMusical.pausar();
        reprodutorMusical.tocar();

        System.out.print("\n\nTelefone");

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico("18 99777-1234");

        aparelhoTelefonico.ligar(aparelhoTelefonico.numero);
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        System.out.print("\n\nNavegador Web");

        NavegadorInternet navegadorInternet = new NavegadorInternet("https://github.com/Bruno-Fagundes/diagrama-uml-iphone-dio");

        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba("https://github.com/Bruno-Fagundes");
        navegadorInternet.exibirPagina();
    }
}