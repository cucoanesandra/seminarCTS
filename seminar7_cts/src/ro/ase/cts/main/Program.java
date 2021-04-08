package ro.ase.cts.main;

import ro.ase.cts.adapter.AdapterCreditCls;
import ro.ase.cts.adapter.AdapterCreditObj;
import ro.ase.cts.adapter.InterfataCredit;
import ro.ase.cts.adapter.Leasing;
import ro.ase.cts.decorator.AbstractDecorator;
import ro.ase.cts.decorator.Card;
import ro.ase.cts.decorator.ConcretDecorator;
import ro.ase.cts.decorator.ICard;

public class Program {
	
	public static void oferaInfoCredit(InterfataCredit credit, String numeClient, float suma) {
		credit.acordaCredit(numeClient, suma);
	}

	public static void main(String[] args) {
		Leasing leasing=new Leasing();
		AdapterCreditObj adapter=new AdapterCreditObj(leasing);
		oferaInfoCredit(adapter, "Ionel", 240.45f);
		
		AdapterCreditCls adapter2=new AdapterCreditCls();
		oferaInfoCredit(adapter2, "Gigel", 371.43f);
		
		ICard card=new Card("Maria");
		card.platesteFizic();
		card.platesteOnline();
		
		AbstractDecorator decoratorContactless=new ConcretDecorator(card);
		decoratorContactless.platesteContactless();
		
	}

}
