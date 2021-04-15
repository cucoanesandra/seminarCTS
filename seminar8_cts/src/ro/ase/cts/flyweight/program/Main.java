package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.classes.FabricaRezervari;
import ro.ase.cts.flyweight.classes.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1=new Rezervare(1, 3, "12:00");
		Rezervare rezervare2=new Rezervare(3, 5, "16:30");
		Rezervare rezervare3=new Rezervare(7, 4, "19:30");
		
		FabricaRezervari fabrica=new FabricaRezervari();
		fabrica.getClient("ionel@hotmail.com").afisareInformatii(rezervare1);
		fabrica.getClient("ionel@hotmail.com").afisareInformatii(rezervare2);
		fabrica.getClient("email@email.com").afisareInformatii(rezervare3);
		
	}

}
