public class aula03 {
    public static void main(String[]args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Spiro";
        c1.cor = "vermelha";
        c1.ponta = 0.2f;
        c1.carga = 0;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
