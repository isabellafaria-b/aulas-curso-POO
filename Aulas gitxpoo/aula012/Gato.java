public class Gato extends Mamifero {
    // Metodos
    @Override
	public void locomover() {
		System.out.println("O gato esta andando");
	}

	@Override
	public void alimentarse() {
			System.out.println("O gato esta comendo peixe");
	}

	@Override
	public void emitirSom() {
		System.out.println("O gato miou!");
	}


    public void pular() {
        System.out.println("O gato pulou");
    }
}