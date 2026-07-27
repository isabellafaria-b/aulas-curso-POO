public class Aula10 {
    public static void main (String[] args){
        // Codigo Principal
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Bianca");
        p2.setNome("Frederico");
        p3.setNome("Carlos");
        p4.setNome("Fabiana");

         // p1.setIdade(20);
         // p2.setIdade(20);
         // p3.setIdade(45);
         // p4.setIdade(30);

        p1.setSexo("F");
        p2.setSexo("M");
        p3.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("informatica");
        p3.setSalario(2300.00f);
        p4.setSetor("Limpeza");

        // Printlns
        System.out.println(p1.pessoa());
        System.out.println(p2.pessoa());
        System.out.println(p3.pessoa());
        System.out.println(p4.pessoa());
    }
}