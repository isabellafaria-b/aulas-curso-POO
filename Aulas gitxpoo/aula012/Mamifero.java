public class Mamifero extends Animal {
    // Atributos
    private String corPelagem;

    // Metodos
    @Override
    public void locomover(){
        System.out.println("O mamifero esta correndo");
    }

    @Override
    public void alimentarse() {
        System.out.println("O mamifero esta mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamifero emitiu um som!");
    }

    // Getter e Setter
    public String getCorPelagem() {
        return this.corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }
}