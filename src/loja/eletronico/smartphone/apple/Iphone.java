package src.loja.eletronico.smartphone.apple;

public class Iphone implements Navegador , ReprodutorMusical ,Telefone {
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Iphone(String modelo) {
        this.modelo = modelo;
    }

    private String modelo = "Iphone 13";
 private final String fabricante = "Apple";
 private  final  String sistemaOperacional = "IOS";

    @Override
    public void ligar(String numero) {
        System.out.println("Estou ligando para o numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciei correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregando pagina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada");
    }

    public void getInformacoesSistema(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
    }
}
