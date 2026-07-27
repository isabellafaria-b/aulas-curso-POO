public class aula11 {
    public static void main(String[] args){
        Visitante v1 = new Visitante();
        v1.setNome("Faria");
        v1.setIdade(15);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Bella");
        a1.setIdade(15);
        a1.setSexo("Feminino");
        System.out.println(a1.toString());
        a1.pagarMensal();

        AlBolsista b1 = new AlBolsista();
        b1.setNome("Isa");
        b1.setIdade(15);
        b1.setSexo("Feminino");
        b1.setMatricula(2010);
        b1.setBolsa(12.5f);

        System.out.println(a1.toString());
        b1.setBolsaRenovada(true);
        b1.pagarMensal();
    }
}