public class Aluno extends Pessoa {
    // Atributos
    protected int matricula;
    protected String curso;
    protected float valor;

    // Metodos
    public void pagarMensal() {
        System.out.println("Mensalidade de aluno " + this.getNome() + " paga com sucesso!");
    }

    // toString
    @Override
    public String toString() {
        return "\nDados de aluno" +
                "\n{ matricula: " + matricula +
                " | curso: " + curso + " | valor da mensalidade: " + valor +
                " }\n";
    }

    // Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
