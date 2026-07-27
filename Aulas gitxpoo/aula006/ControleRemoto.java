public class ControleRemoto implements Controlador {
    // Atributos
    private int vol;
    private boolean ligado;
    private boolean tocando;

    // Construtor
    public ControleRemoto() {
        this.vol = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // Getters
    public int getVol() {
        return vol;
    }

    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    // Setters
    public void setVol(int vol) {
        this.vol = vol;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }


    // Sobreescrevendo Metodos abstratos
    public void liga(){
        this.setLigado(true);
    }
    public void desliga(){
        this.setLigado(false);
    }
    
    public void abrirMenu(){
        System.out.println("----- MENU -----");
        System.out.println("O menu esta ligado? " + this.getLigado());
        System.out.println("O menu esta tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVol());

        for (int i = 0; i <= this.getVol(); i+=10){
            System.out.print("|");
        }
        System.out.println("");
    }

    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    public void maisVolume(){
        if (this.getLigado()){
            this.setVol(this.getVol() + 5);
        } else {
            System.out.println("Impossivel aumentar volume, o aparelho esta desligado");
        }

    }
    public void menosVolume(){
        if (this.getLigado()){
            this.setVol(this.getVol() - 5);
        } else {
            System.out.println("Impossivel diminuir volume, o aparelho esta desligado");
        }
    }
    
    public void ativaMudo(){
        if (this.getLigado() && this.getVol() > 0){
            this.setVol(0);
        }
    }
    public void desativaMudo(){
        if (this.getLigado() && this.getVol() == 0){
            this.setVol(50);
        }
    }
    
    public void play(){
        if (this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Impossivel reproduzir, o aparelho esta desligado");
        }
    }
    public void pausa(){
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Impossivel pausar, o aparelho esta desligado");
        }
    }

}