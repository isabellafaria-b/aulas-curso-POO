public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String modelo, float ponta, String cor) { // construtor
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("\nModelo: " + modelo);
        System.out.println("Ponta: " + ponta);
        System.out.println("Cor: " + cor);
        System.out.println("Tampada: " + tampada);
    }
}
