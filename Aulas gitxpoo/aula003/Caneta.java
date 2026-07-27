public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;
    public void status () {
        System.out.println("Ha uma Caneta " + this.cor);
        System.out.println("Ela esta tampada? " + this.tampada);
        System.out.println("Qual a ponta? " + this.ponta);
        System.out.println("E o modelo? " + this.modelo);
        System.out.println("E quanto de carga ela tem? " + this.carga + "%");

    }

    public void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Erro! Não da para rabiscar, a caneta esta tampada!");
        } else if (this.carga == 0) {
            System.out.println("Erro! Não da para rabiscar, a caneta esta sem carga!");
        } else if (this.tampada == false && this.carga > 0) {
            System.out.println("Otimo! Agora eh possivel rabiscar");
        }

    }

    public void tampar () {
        this.tampada = true;
    }

    public void destampar () {
        this.tampada = false; 
    }

}