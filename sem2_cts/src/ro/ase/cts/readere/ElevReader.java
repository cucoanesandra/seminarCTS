package ro.ase.cts.readere;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Elev;

public class ElevReader extends AplicantReader {
	public ElevReader(String fileName) {
		super(fileName);
	}

	public List<Aplicant> citesteAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.getFileName()));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev elev=new Elev();
			super.citesteAplicant(input, elev);
			int clasa = input.nextInt();
			String tutore = input.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input.close();
		return elevi;
	}
}
