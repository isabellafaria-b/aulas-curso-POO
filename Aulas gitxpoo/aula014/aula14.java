public class aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Fredericos no parque");
        v[1] = new Video("Isabella Faria estudando");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Enzo", 21, "masculino", "3750");
        g[1] = new Gafanhoto("Alice", 19, "feminino", "bahia");

        Visualizacao vis = new Visualizacao(g[0], v[0]);
        System.out.println(vis.toString());
        vis.avaliar();

        // System.out.println(v[0].toString());
        // System.out.println(g[0].toString());
    }
}