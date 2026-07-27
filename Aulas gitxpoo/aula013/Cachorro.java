public class Cachorro extends Lobo {
    // Sobreescrevendo Metodos
    @Override
    public void emitirSom(){
        System.out.println("O cachorro latiu: Au! Au!");
    }

    // Mais metodos
    public void reagirModoDeFala(String tom) {
        if (tom.equals("Carinhoso")) {
            System.out.println("O cachorro " + this.getNome() + " abanou o rabo e deu voltas como resposta!");
        } else {
            System.out.println("O cachorro " + this.getNome() + " nao gostou do seu tom e rosnou!");
        }
    }
    public void reagirHorario(int hora, int minuto) {
        if (hora <= 12) {
            System.out.println("O cachorro " + this.getNome() + " apenas abanou o rabo com a sua interacao, ainda estava muito cedo");
        } else if (hora >= 18) {
            System.out.println("O cachorro " + this.getNome() + " estava cansado e apenas igorou");
        } else {
            System.out.println("O cachorro " + this.getNome() + " abanou o rabo e latiu em aprovacao");
        }
    }
    public void reagirDesconhecido(boolean dono) {
        if (dono == true) {
            System.out.println("O cachorro " + this.getNome() + " abanou o rabo e latiu para cumprimentar o dono");
        } else {
            System.out.println("O cachorro " + this.getNome() + " latiu e rosnou, pois nao reconheceu a pessoa");
        }
    }
    
}
