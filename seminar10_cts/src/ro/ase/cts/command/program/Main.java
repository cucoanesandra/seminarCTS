package ro.ase.cts.command.program;

import ro.ase.cts.command.classes.Constituire;
import ro.ase.cts.command.classes.ContBancar;
import ro.ase.cts.command.classes.ManagerComenzi;
import ro.ase.cts.command.classes.Retragere;

public class Main {

	public static void main(String[] args) {
		ManagerComenzi manager=new ManagerComenzi();
		manager.invoca(new Constituire(new ContBancar("Nume"), 500));
		manager.invoca(new Retragere(new ContBancar("Nume2"), 200));
		
		manager.executaComanda();

	}

}
