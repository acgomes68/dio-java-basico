package navegadorInternet;

public class InternetExplorer implements NavegadorInternet {
    private String dispositivo = "Internet Explorer";

    public void exibirPagina(String url) {
        System.out.println("Exibir a página " + url + " no " + this.dispositivo);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba no " + this.dispositivo);
    }
    public void atualizarPagina() {
        System.out.println("Exibir página no " + this.dispositivo);
    }

}
