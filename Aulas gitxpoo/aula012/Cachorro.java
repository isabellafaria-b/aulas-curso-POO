public class Cachorro extends Mamifero {

    // Metodos
    @Override
	public void locomover() {
		System.out.println("O cachorro esta correndo");
	}

	@Override
	public void alimentarse() {
		System.out.println("O cachorro esta comendo");
	}

	@Override
	public void emitirSom() {
		System.out.println("O cachorro latiu");
	}

    public void enterraOsso() {
    System.out.println("O cachorro enterrou o osso");
    }
    public void abanaRabo() {
    System.out.println("O cachorro abanou o rabo!");
    }
}
