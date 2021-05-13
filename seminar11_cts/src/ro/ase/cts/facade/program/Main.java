package ro.ase.cts.facade.program;

import ro.ase.cts.facade.classes.Facade;
import ro.ase.cts.facade.classes.Pacient;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pacient p1=new Pacient("X", false);
		Pacient p2=new Pacient("Y", true);
		
		System.out.println(Facade.verificaPacient(p1));
		System.out.println(Facade.verificaPacient(p2));
	}

}
