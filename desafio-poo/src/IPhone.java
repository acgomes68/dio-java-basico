import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private String dispositivo = "iPhone";

    public void ligar(String numero) {
        System.out.println("Ligar para o numero " + numero + " no " + this.dispositivo);
    }
    public void atender() {
        System.out.println("Atender o " + this.dispositivo);
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz no " + this.dispositivo);
    }
    
    public void exibirPagina(String url) {
        System.out.println("Exibir a página " + url + " no " + this.dispositivo);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba no " + this.dispositivo);
    }
    public void atualizarPagina() {
        System.out.println("Exibir página no " + this.dispositivo);
    }

    public void tocar() {
        System.out.println("Tocar música no " + this.dispositivo);
    }
    public void pausar() {
        System.out.println("Pausar música no " + this.dispositivo);
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar a música " + musica + " no " + this.dispositivo);
    }    

}
