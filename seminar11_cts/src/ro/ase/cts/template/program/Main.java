package ro.ase.cts.template.program;

import ro.ase.cts.template.classes.Spectator;
import ro.ase.cts.template.classes.SpectatorPeluza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Spectator spectator=new Spectator();
		spectator.intrareSpectator();
		
		SpectatorPeluza spectatorPeluza=new SpectatorPeluza();
		spectatorPeluza.intrareSpectator();
	}

}
