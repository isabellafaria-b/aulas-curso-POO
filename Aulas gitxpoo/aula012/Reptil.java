public class Reptil extends Animal {
    // Atributos
    private String corEscamas;
    protected boolean carnivoro;

    // Metodos
	@Override
	public void locomover() {
		System.out.println("O reptil esta se rastejando");
	}

	@Override
	public void alimentarse() {
		if (this.getCarnivoro()) {
			System.out.println("O reptil esta comendo carne");
		} else {
			System.out.println("O reptil esta comendo plantas");
		}
	}

	@Override
	public void emitirSom() {
		System.out.println("O reptil emitiu um som!");
	}

    // Getters e Setters
	public String getCorEscamas() {
		return corEscamas;
	}

	public void setCorEscamas(String corEscamas) {
		this.corEscamas = corEscamas;
	}

	public boolean getCarnivoro() {
		return carnivoro;
	}

	public void setCarnivoro(boolean carnivoro) {
		this.carnivoro = carnivoro;
	}

}
