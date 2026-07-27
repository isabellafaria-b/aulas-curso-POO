public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status () {
        System.out.println("Uma Caneta " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Qual a ponta? " + this.ponta);
        System.out.println("E o modelo? " + this.modelo);

    }

    void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Agora posso rabiscar");
        }

    }

    void tampar () {
        this.tampada = true;
    }

    void destampar () {
        this.tampada = false; 
    }

}