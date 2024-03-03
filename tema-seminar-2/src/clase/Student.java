package clase;

import java.util.Arrays;

public class Student extends Aplicant implements IProiect {
	private String facultate;
	private int anStudii;
	private int nrProiecte;
	private String[] denumireProiecteArray;

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiecteArray,
			String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj);
		this.facultate = facultate;
		this.anStudii = anStudii;
		this.nrProiecte = nrProiecte;
		this.denumireProiecteArray = denumireProiecteArray;
	}

	@Override
	public String toString() {
		return "Student: Nume=" + nume + ", Prenume=" + prenume + ", Varsta=" + varsta + ", Punctaj=" + punctaj
				+ ", NrProiecte=" + nrProiecte + ", DenumireProiecte=" + Arrays.toString(denumireProiecteArray)
				+ "Facultate=" + facultate + ", AnStudii=" + anStudii;
	}

	public int finantare() {
		int s = 20;
		System.out.println("Studentul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
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

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

}
