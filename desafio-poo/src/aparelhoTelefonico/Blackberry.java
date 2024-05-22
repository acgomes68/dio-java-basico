package aparelhoTelefonico;

public class Blackberry implements AparelhoTelefonico {
    private String dispositivo = "Blackberry";

    public void ligar(String numero) {
        System.out.println("Ligar para o numero " + numero + " no " + this.dispositivo);
    }
    public void atender() {
        System.out.println("Atender o " + this.dispositivo);
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz no " + this.dispositivo);
    }

}
