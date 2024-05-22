package reprodutorMusical;

public class IPod implements ReprodutorMusical {
    private String dispositivo = "iPod";

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
