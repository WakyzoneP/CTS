package clase;

public abstract class Aplicant extends Persoana {
	protected int punctaj;

	public void statut() {
		if (punctaj > 80)
			System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
		else
			System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj) {
		super(nume, prenume, varsta);
		this.punctaj = punctaj;
	}

}
