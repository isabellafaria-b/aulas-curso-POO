public class Peixe extends Animal {
    // Atributos
    private String corEscamas;

    //Metodos
    @Override
    public void locomover() {
        System.out.println("o peixe esta nadando");
    }

    @Override
    public void alimentarse() {
        System.out.println("O peixe esta comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao emite sons..");
    }

    public void soltarBolhas(){
        System.out.println("O peixe soltou bolhas!");
    }

    // Getter e setter
    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }
}
