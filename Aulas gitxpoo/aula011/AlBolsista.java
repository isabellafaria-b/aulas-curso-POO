public class AlBolsista extends Aluno {
    // Atributos
    private float descontoBolsa;
    private boolean bolsaRenovada;

    // Metodos
    public void renovarBolsa() {
        System.out.println("Bolsa de " + this.getNome() + " renovada com sucesso!");
    }

    @Override
    public void pagarMensal() {
        if (this.getBolsaRenovada() == true) {
        System.out.println("O aluno " + this.getNome() + " eh bolsista, sua mensalidade foi facilitada e paga com sucesso!");
        } else {
            System.out.println("Nao foi possivel pagar a mensalidade de " + this.getNome() + " de forma facilitada, a bolsa nao pôde ser renovada");
        }
    }

    // toString
    @Override
    public String toString() {
        return "\nDados de aluno" +
                "\n{ matricula: " + matricula +
                " | curso: " + curso + " | valor da mensalidade: " + (this.getValor() - descontoBolsa) +
                " }\n";
    }

    
    // Getters e Setters
    public float getBolsa() {
        return descontoBolsa;
    }

    public void setBolsa(float bolsa) {
        this.descontoBolsa = bolsa;
    }

    public boolean getBolsaRenovada() {
        return bolsaRenovada;
    }

    public void setBolsaRenovada(boolean bolsaRenovada) {
        this.bolsaRenovada = bolsaRenovada;
    }
}
