package clase;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = Utils.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Elev> listaElevi;
		try {
			listaElevi = Utils.readPupil("elevi.txt");
			for(Elev elev:listaElevi)
				System.out.println(elev.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Student> listaStudenti;
		try {
			listaStudenti = Utils.readStudents("studenti.txt");
			for(Student student:listaStudenti)
				System.out.println(student.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
