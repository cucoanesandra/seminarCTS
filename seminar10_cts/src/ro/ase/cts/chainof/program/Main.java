package ro.ase.cts.chainof.program;

import ro.ase.cts.chainof.classes.Cont;
import ro.ase.cts.chainof.classes.ContCredit;
import ro.ase.cts.chainof.classes.ContCurent;
import ro.ase.cts.chainof.classes.ContEconomii;
import ro.ase.cts.chainof.classes.ContIndisponibil;

public class Main {
	public static void main(String[] args) {
		Cont contCurent=new ContCurent(1500, "Nume", null);
		Cont contEcon=new ContEconomii(2500, "Nume", null);
		Cont contCredit=new ContCredit(3200, "Nume", null);
		Cont contIndisp=new ContIndisponibil("Nume");
		
		contCurent.setSuccesor(contEcon);
		contEcon.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisp);
		
		contCurent.plateste(3500);
	}
}
