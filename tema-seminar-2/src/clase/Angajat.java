package clase;

import java.util.Arrays;

public class Angajat extends Aplicant implements IProiect {
	private String ocupatie;
	private int salariu;
	private int nrProiecte;
	private String[] denumireProiecteArray;

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiecteArray,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
		this.nrProiecte = nr_proiecte;
		this.denumireProiecteArray = denumireProiecteArray;
	}

	public Angajat() {
		super();
	}

	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", NrProiecte=" + nrProiecte + ", DenumireProiect="
				+ Arrays.toString(denumireProiecteArray) + "Ocupatie=" + ocupatie + ", Salariu=" + salariu;
	}

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public int finantare() {
		int s = 10;
		// TODO Auto-generated method stub
		System.out.println("Angajatul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
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
}
