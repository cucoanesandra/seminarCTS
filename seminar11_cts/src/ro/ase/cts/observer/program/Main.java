package ro.ase.cts.observer.program;

import ro.ase.cts.observer.classes.ClientAbonat;
import ro.ase.cts.observer.classes.Sala;

public class Main {

	public static void main(String[] args) {
		
		ClientAbonat c1=new ClientAbonat("Pop");
		ClientAbonat c2=new ClientAbonat("Ana");
		ClientAbonat c3=new ClientAbonat("Dan");
		
		Sala sala=new Sala("SALA X");
		
		sala.aboneazaClient(c3);
		sala.aboneazaClient(c2);
		sala.aboneazaClient(c1);
		sala.anuntaMeciFotbal();
		sala.dezaboneazaClient(c3);
		sala.anuntaMeciVolei();
		

	}

}
