public class aula13 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.setNome("Frederico");
        c.setPeso(5.3f);
        c.setIdade(10);
        c.setCorPelo("Pintado de azul");
        System.out.println("--- Cachorro " + c.getNome() + " ---");
        System.out.println("Peso: " + c.getPeso() + "kg");
        System.out.println("Idade: " + c.getIdade());
        System.out.println("Cor do pelo: " + c.getCorPelo());
        
        //c.reagirModoDeFala("Carinhoso");
        c.reagirHorario(19, 47);

        System.out.println("-----------------------");

        Lobo l = new Lobo();
        l.setNome("Loghan");
        l.setPeso(15.3f);
        l.setIdade(7);
        l.setCorPelo("Cinza azulado");
        System.out.println("--- Lobo " + l.getNome() + " ---");
        System.out.println("Peso: " + l.getPeso() + "kg");
        System.out.println("Idade: " + l.getIdade());
        System.out.println("Cor do pelo: " + l.getCorPelo());
        l.emitirSom();
    }
}
