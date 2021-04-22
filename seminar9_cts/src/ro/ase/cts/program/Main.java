package ro.ase.cts.program;

import ro.ase.cts.strategy.classes.Card;
import ro.ase.cts.strategy.classes.Cash;
import ro.ase.cts.strategy.classes.Client;

public class Main {

	public static void main(String[] args) {
		Client client=new Client("Popescu");
		client.setMdPlata(new Cash());
		client.platesteNota(200.00);
		
		client.setMdPlata(new Card(500.00));
		client.platesteNota(350.00);
		client.platesteNota(200.00);
	}

}
