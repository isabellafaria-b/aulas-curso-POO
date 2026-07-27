public class Visualizacao {
    // Atributos
    private Gafanhoto espectador;
    private Video filme;

    // Construtor
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;

        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    // Metodos (sobrecarga)
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porctg) {
        int total = 0;
        if (porctg <= 20) {
            total = 3;
        } else if (porctg <= 50) {
            total = 5;
        } else if (porctg <= 90) {
            total = 8;
        } else {
            total = 10;
        }
        this.filme.setAvaliacao(total);
    }

    //Getters e Setters
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    // toString
    @Override
    public String toString() {
        return "Visualizacao" +
                "\nDetalhes do espectador: " + espectador +
                "\nDetalhes do filme: " + filme;
    }
}
