package src.loja.eletronico.smartphone.motorola;

import src.loja.eletronico.smartphone.NavegadorBase;
import src.loja.eletronico.smartphone.ReprodutorMusicalBase;
import src.loja.eletronico.smartphone.SmartPhoneBase;

public class MotoG85 extends SmartPhoneBase implements NavegadorBase, ReprodutorMusicalBase {

    public MotoG85(String modelo, String fabricante, String sistemaOperacional) {
        super(modelo, fabricante, sistemaOperacional);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Estou ligando" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Inicializando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica(String musica) {

    }
}
