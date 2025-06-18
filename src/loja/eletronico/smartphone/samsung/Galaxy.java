package src.loja.eletronico.smartphone.samsung;

import src.loja.eletronico.smartphone.NavegadorBase;
import src.loja.eletronico.smartphone.ReprodutorMusicalBase;
import src.loja.eletronico.smartphone.SmartPhoneBase;

public class Galaxy extends SmartPhoneBase implements NavegadorBase , ReprodutorMusicalBase {
    public Galaxy(String modelo, String fabricante, String sistemaOperacional) {
        super(modelo, fabricante, sistemaOperacional);
    }

    @Override
    public void ligar(String numero) {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioVoz() {

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
