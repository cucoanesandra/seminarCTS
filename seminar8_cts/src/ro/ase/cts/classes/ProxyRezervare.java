package ro.ase.cts.classes;

public class ProxyRezervare implements IRezervare{
	private static final int NR_MINIM_PERSOANE = 4;
	private Rezervare rezervare;
	
	
	public ProxyRezervare(Rezervare rezervare) {
		super();
		this.rezervare = rezervare;
	}


	@Override
	public void anuntaRezervare() {
		if(rezervare.getNrPersoane()>=NR_MINIM_PERSOANE) {
			rezervare.anuntaRezervare();
		} else {
			System.out.println("Se poate prezenta fizic la restaurant.");
		}
	}

}
