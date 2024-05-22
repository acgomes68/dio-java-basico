import aparelhoTelefonico.Blackberry;
import aparelhoTelefonico.MotorolaQ;
import aparelhoTelefonico.NokiaE62;
import aparelhoTelefonico.PalmTreo;
import navegadorInternet.InternetExplorer;
import navegadorInternet.Safari;
import reprodutorMusical.IPod;

public class Dispositivo {

    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        Blackberry blackberry = new Blackberry();
        MotorolaQ motorolaQ = new MotorolaQ();
        NokiaE62 nokiaE62 = new NokiaE62();
        PalmTreo palmTreo = new PalmTreo();
        InternetExplorer internetExplorer = new InternetExplorer();
        Safari safari = new Safari();
        IPod iPod = new IPod();

        iphone.ligar("11 91642 0691");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        blackberry.ligar("11 99220 7620");
        blackberry.atender();
        blackberry.iniciarCorreioVoz();

        motorolaQ.ligar("11 99220 7620");
        motorolaQ.atender();
        motorolaQ.iniciarCorreioVoz();        

        nokiaE62.ligar("11 99220 7620");
        nokiaE62.atender();
        nokiaE62.iniciarCorreioVoz(); 

        palmTreo.ligar("11 99220 7620");
        palmTreo.atender();
        palmTreo.iniciarCorreioVoz();        

        iphone.exibirPagina("http://java.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        internetExplorer.exibirPagina("http://java.com");
        internetExplorer.adicionarNovaAba();
        internetExplorer.atualizarPagina();
        
        safari.exibirPagina("http://java.com");
        safari.adicionarNovaAba();
        safari.atualizarPagina();        

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Catedral");

        iPod.tocar();
        iPod.pausar();
        iPod.selecionarMusica("Catedral");        
    }

}
