public class Banco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Mais metodos
    public void estadoAtual() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    //Metodos
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if (t.equals("CoC")) {
            setSaldo(50);
        } else if (t.equals("CoP")) {
            setSaldo(150);
        }
        System.out.println("Conta criada com sucesso!");
    }
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta esta com saldo, nao eh possivel fechar");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta esta em debito, nao eh possivel fechar");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Foi feito um deposito no valor de " + v + " para " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta inexistente");
        }

    }
    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado no valor de " + v + " para " + this.getDono());
            } else {
                System.out.println("Nao ha saldo suficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta que nao existe");
        }

    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo() == "CoC") {
            v = 12;
        } else if (this.getTipo() == "CoP") {
            v = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo() > v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso no valor de " + v);
            } else {
                System.out.println("Falha ao pagar mensalidade, saldo insuficiente");
            }
        }
    }


     //metodos especiais
    public Banco(){ //Metodo construtor
        this.setSaldo(0);
        this.setStatus(false);
    }


    public int getNumConta() { //getters e setters
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}