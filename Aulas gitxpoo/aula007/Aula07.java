public class Aula07 {
    public static void main(String[] args){
        Lutador [] l = new Lutador[2];
        l[0] = new Lutador("John", "Brasil", 26, 175f, 80.0f, 14, 0, 1);
        l[1] = new Lutador("Jane", "Alemanha", 30, 180f, 75.0f, 10, 2, 0);

        Luta i123 = new Luta();
        i123.marcarLuta(l[0], l[1]);
        i123.lutar();

        //l[0].apresentar();
        //l[0].status();
        
        //l[1].apresentar();
        //l[1].status();

    }
}