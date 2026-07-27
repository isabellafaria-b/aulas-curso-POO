public class Aula05 {
    public static void main(String[]    args) {
        Banco b1 = new Banco();
        b1.setNumConta(2010);
        //b1.setTipo("CoC");
        b1.setDono("Lumine");
        b1.abrirConta("CoC");
        b1.depositar(100);
        b1.sacar(150);

        b1.estadoAtual();
}
}