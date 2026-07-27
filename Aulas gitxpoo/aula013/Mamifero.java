public class Mamifero extends Animal {
    // Atributos
    private String corPelo;

    // Metodos
    @Override
    public void emitirSom() {
        System.out.println("O mamifero emitiu um som!");
    }

    // Getter e Setter
    public String getCorPelo() {
        return this.corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

   
}
