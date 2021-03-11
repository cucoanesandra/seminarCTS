package ro.ase.cts.classes;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.readere.AplicantReader;
import ro.ase.cts.readere.StudentReader;

public class Program {

	public static List<Aplicant> citesteAplicanti(AplicantReader reader) throws NumberFormatException, FileNotFoundException{
		return reader.citesteAplicanti();
	}
	
	public static void main(String[] args) {
		System.out.println(Student.getSumaFinantare());
		System.out.println(Angajat.getSumaFinantare());
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti(new StudentReader("studenti.txt"));
			Proiect proiect=new Proiect(80);
			for(Aplicant angajat:listaAplicanti) 
			{
				System.out.println(angajat.toString());
				angajat.afiseazaStatus(proiect);
				System.out.println(angajat.getSumaFinantata());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
