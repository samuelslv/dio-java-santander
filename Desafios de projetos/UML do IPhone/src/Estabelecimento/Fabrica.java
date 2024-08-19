package Estabelecimento;

import componentes.internet.Safari;
import componentes.iphone.Iphone;
import componentes.ipod.Ipod;
import componentes.ipod.ReprodutorMusical;
import componentes.phone.Telefone;

public class Fabrica {
    public static void main(String[] args) {
        Safari browser = new Safari();
        Ipod ipod = new Ipod();
        Telefone telefone = new Telefone();

        Iphone iphone = new Iphone();

        ReprodutorMusical ipodNano = new Iphone();

        browser.adicionarNovaAba();
        iphone.adicionarNovaAba();
        telefone.iniciarCorrerioVoz();
        iphone.iniciarCorrerioVoz();
        ipod.selecionarMusica();
        iphone.selecionarMusica();

        ipodNano.tocar();

    }
}
