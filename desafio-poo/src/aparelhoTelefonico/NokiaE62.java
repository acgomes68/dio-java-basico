package aparelhoTelefonico;

public class NokiaE62 implements AparelhoTelefonico {
    private String dispositivo = "Nokia E62";

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
