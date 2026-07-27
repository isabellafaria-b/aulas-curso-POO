public class aula09 {
public static void main(String[] args){
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[2];

    // Pessoas
    p[0] = new Pessoa("Isabella", 19, "Masculino");
    p[1] = new Pessoa("Aurora", 25, "Feminino");

    // Livros
    l[0] = new Livro("As Cronicas de Narnia", "C.S. Lewis", 752, p[0]);
    l[1] = new Livro("Jurassic Park", "Michael Crichton", 528, p[1]);

    // Ações
    p[0].fazerAniversario();

    l[0].abrir();
    l[0].folhear(576);
    l[0].avancarPag();
    l[1].voltarPag();

    // Detalhes dos livros
    System.out.println("Detalhes dos livros: \n");
    if (l[0] != null) {
        System.out.println(l[0].detalhes());
    } else {
        System.out.println("Livro 1 não disponível");
    }
    if (l[1] != null) {
        System.out.println(l[1].detalhes());
    } else {
        System.out.println("Livro 2 não disponível");
    }

    }
}