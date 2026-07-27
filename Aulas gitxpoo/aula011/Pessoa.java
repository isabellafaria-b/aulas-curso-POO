public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;

    // Metodos
    public void FzAniversario() {
        this.idade++;
        System.out.println("Parabéns! " + getNome() + " fez aniversário e agora tem " + getIdade() + " anos!");
    }

    // toString
    @Override
    public String toString() {
        return "\nDados de individuo" +
                "\n{ nome: " + nome +
                " | i: " + idade + " | s: " + sexo +
                " }\n";
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}