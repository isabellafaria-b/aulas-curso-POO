public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;

    // Metodos
    public void receberAumento(float au) {
        this.salario += au;
    }

    // Getters and Setters
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String esp) {
        this.especialidade = esp;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}