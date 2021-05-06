package ro.ase.cts.chainof.classes;

public abstract class Cont {
	private float sold;
	private String numeClient;
	private Cont succesor;
	
	public Cont(float sold, String numeClient, Cont succesor) {
		super();
		this.sold = sold;
		this.numeClient = numeClient;
		this.succesor = succesor;
	}
	
	public void setSuccesor(Cont succesor) {
		this.succesor=succesor;
	}
	
	public abstract void plateste(float suma);

	public float getSold() {
		return sold;
	}

	public void setSold(float sold) {
		this.sold = sold;
	}

	public String getNumeClient() {
		return numeClient;
	}

	public void setNumeClient(String numeClient) {
		this.numeClient = numeClient;
	}

	public Cont getSuccesor() {
		return succesor;
	}
	
	
}
