public abstract class Animal {
    // Atributos
    protected String nome;
    protected String raca;
    protected float peso;
    protected int idade;
    protected int membros;

    // Metodos
    public abstract void locomover();
    public abstract void alimentarse();
    public abstract void emitirSom();

    // Getters e Setters
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return this.membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}