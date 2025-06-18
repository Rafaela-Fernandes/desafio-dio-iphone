package src.loja.eletronico.smartphone;

public abstract class SmartPhoneBase {

    protected  String modelo;
    protected  String fabricante ;
    protected  String sistemaOperacional;

    public SmartPhoneBase(String modelo, String fabricante, String sistemaOperacional) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.sistemaOperacional = sistemaOperacional;
    }

    public abstract void ligar (String numero);
    public abstract void atender();
    public abstract  void iniciarCorreioVoz();

    protected void informacoesGeraisSmartPhone(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
    }
}

