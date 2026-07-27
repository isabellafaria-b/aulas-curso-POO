public class Livro implements Publicacao {
    // Atributos
    private String titulo;
    private String autor;
    private int totalPags;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // Metodos
    public String detalhes() {
        return "Livro" +
                "\n{ titulo: '" + titulo +
                "\nautor: " + autor +
                "\ntotalPags: " + totalPags +
                "    pagAtual: " + pagAtual +
                "\naberto: " + aberto +
                "\nleitor: " + leitor.getNome() +
                " | i: " + leitor.getIdade() + " | s: " + leitor.getSexo() +
                " }\n";
    }

    // Construtor
    public Livro(String titulo, String autor, int totalPags, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPags = totalPags;
        this.pagAtual = 1;
        this.aberto = false;
        this.leitor = leitor;
    }

    // getters e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPags() {
        return totalPags;
    }

    public void setTotalPags(int totalPags) {
        this.totalPags = totalPags;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }


    // Sobreescrevendo metodos abstratos
    @Override
    public void abrir(){
        this.setAberto(true);
    }
    
    @Override
    public void fechar(){
        this.setAberto(false);
    }

    @Override
    public void folhear(int pags){
        if (pags > this.getTotalPags()) {
            this.setPagAtual(1);
            System.out.println("O livro possui apenas " + this.getTotalPags() + " páginas, nao foi possivel folhear " + this.getTitulo());
        } else {
            this.setPagAtual(pags);
        }

        if (this.getAberto() == false) {
            System.out.println("O livro " + this.getTitulo() + " esta fechado, abra-o para folhear");
        }
    }

    @Override
    public void avancarPag(){
        if (pagAtual > this.getTotalPags()) {
            this.setPagAtual(1);
            System.out.println("O livro possui apenas " + this.getTotalPags() + " páginas, nao foi possivel avancar as paginas de " + this.getTitulo());
        } else {
            this.setPagAtual(pagAtual + 1);
        }
    }

    @Override
    public void voltarPag(){
        if (this.getPagAtual() <= 1) {
            System.out.println("O livro " + this.getTitulo() + " ja esta na primeira pagina, nao eh possivel voltar mais paginas");
        } else {
            this.setPagAtual(pagAtual - 1);
        }
    }
}
