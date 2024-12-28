public class NavegadorInternet {
    String url;

    NavegadorInternet (String url) {
        this.url = url;
    }

    public void exibirPagina() {
        System.out.print("Entrando em: " + url);
    }

    public void adicionarNovaAba(String novoUrl) {
        System.out.print("Adicionando nova aba\n " +
                "Entrando em " + novoUrl);
    }

    public void atualizarPagina() {
        System.out.print("Atualizando pagina/n" + url);
    }
}
