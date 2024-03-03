package clase;

import java.util.Arrays;

public class Elev extends Aplicant implements IProiect {
	private int clasa;
	private String tutore;
	private int nrProiecte;
	private String[] denumireProiecteArray;

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nrProiecte, String[] denumireProiecteArray, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj);
		this.nrProiecte = nrProiecte;
		this.denumireProiecteArray = denumireProiecteArray;
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", NrProiecte=" + nrProiecte + ", DenumireProiecte="
				+ Arrays.toString(denumireProiecteArray) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	@Override
	public int finantare() {
		int s = 30;
		System.out.println("Elevul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
		return s;
	}

	@Override
	public int getNrProiecte() {
		return nrProiecte;
	}

	@Override
	public String[] getDenumireProiecteArray() {
		return denumireProiecteArray;
	}

	@Override
	public void setNrProiecte(int nrProiecte) {
		this.nrProiecte = nrProiecte;
	}

	@Override
	public void setDenumireProiecteArray(String[] denumireProiecteArray) {
		this.denumireProiecteArray = denumireProiecteArray;
	}

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

}
