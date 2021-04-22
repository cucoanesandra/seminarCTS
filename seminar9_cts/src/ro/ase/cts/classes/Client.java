package ro.ase.cts.classes;

public class Client {
	private String numeClient;
	private ModPlata modPlata;
	
	public ModPlata getMdPlata() {
		return modPlata;
	}
	
	public void setMdPlata(ModPlata mdPlata) {
		this.modPlata = mdPlata;
	}

	public Client(String numeClient, ModPlata modPlata) {
		super();
		this.numeClient = numeClient;
		this.modPlata = modPlata;
	}
	
	public Client(String numeClient) {
		super();
		this.numeClient = numeClient;
		this.modPlata = new Cash();
	}
	
	public void platesteNota(double suma) {
		System.out.println(numeClient+" trebuie sa realizeze o plata.");
		modPlata.plateste(suma);
	}
	
	
}
