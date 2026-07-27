public class Lutador {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Metodos
    public void apresentar(){
        System.out.println("-- Apresentacao de lutador --");
        System.out.println("Lutador: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura() + "cm");
        System.out.println("Peso: " + getPeso() + "Kg");
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Saldo de vitorias: " + getVitorias());
        System.out.println("Saldo de derrotas: " + getDerrotas());
        System.out.println("Saldo de empates: " + getEmpates() + "\n");
    }

    public void status(){
        System.out.println("----- Saldo Atual de " + getNome() + " -----");
        System.out.println(getVitorias() + " vitorias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
        System.out.println("-------------------------------");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
        System.out.println("O lutador " + getNome() + " ganhou uma luta!\n");
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
        System.out.println("O lutador " + getNome() + " perdeu uma luta!\n");
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
        System.out.println("O lutador " + getNome() + " empatou uma luta!\n");
    }

    // Metodo construtor
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52f) {
            this.categoria = "Nao ha categoria";
        } else if (this.peso <= 70.3f) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.7f) {
            this.categoria = "Medio";
        } else if (this.peso <= 120.5f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Nao ha categoria";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
}