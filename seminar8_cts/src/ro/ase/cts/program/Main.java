package ro.ase.cts.program;

import ro.ase.cts.classes.IOptiuniMeniu;
import ro.ase.cts.classes.IRezervare;
import ro.ase.cts.classes.Item;
import ro.ase.cts.classes.ProxyRezervare;
import ro.ase.cts.classes.Rezervare;
import ro.ase.cts.classes.Sectiune;

public class Main {

	public static void main(String[] args) {
		
		IOptiuniMeniu meniu=new Sectiune("Meniu Restaurant");
		
		IOptiuniMeniu optiune1=new Sectiune("bauturi");
		IOptiuniMeniu optiune2=new Sectiune("desert");
		
		IOptiuniMeniu item1=new Item("apa minerala");
		IOptiuniMeniu item2=new Item("frappe");
		IOptiuniMeniu item3=new Item("papanasi");
		
		try {
			optiune1.adaugaNod(item1);
			optiune1.adaugaNod(item2);
			
			optiune2.adaugaNod(item3);
			
			meniu.adaugaNod(optiune1);
			meniu.adaugaNod(optiune2);
			
			
			optiune1.stergeNod(item2);
			optiune2.adaugaNod(item2);
			
			meniu.descriere();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		IRezervare rezervarePtDouaPers=new Rezervare(3, 2);
		rezervarePtDouaPers.anuntaRezervare();
		
		ProxyRezervare proxy=new ProxyRezervare((Rezervare) rezervarePtDouaPers);
		proxy.anuntaRezervare();
		((Rezervare) rezervarePtDouaPers).setNrPersoane(4);
		proxy.anuntaRezervare();

	}

}
