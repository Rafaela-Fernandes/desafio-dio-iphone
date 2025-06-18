package src.loja;

import src.loja.eletronico.smartphone.SmartPhoneBase;
import src.loja.eletronico.smartphone.apple.Iphone;


public class Loja {
    public static void main(String[] args) {

        // criando instancia
        Iphone iphone = new Iphone("Iphone 13");


        //iphone usando reprodutor musical
        iphone.selecionarMusica("ele vive");
        iphone.pausar();
        iphone.tocar();

        // iphone fazendo ligacoes
        iphone.ligar("7199145253");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // informações gerais do  celular
        iphone.getInformacoesSistema();

        // iphone usando navegador
        iphone.exibirPagina("https://web.dio.me/track/formacao-java-developer");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
    }
}
