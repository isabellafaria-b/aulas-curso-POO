public class Ave extends Animal {
    // Atributos
    private String corPenas;

    // Metodos
    @Override
    public void alimentarse() {
        System.out.println("A ave está se alimentando.");
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave está cantando.");
    }

    @Override
    public void locomover() {
        System.out.println("A ave está voando.");
    }

    public void fazerNinho() {
        System.out.println("A ave construiu um ninho");
    }

    // Getters e Setters
    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
}
