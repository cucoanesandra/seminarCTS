package ro.ase.cts.singleton;



public class Croaziera {
	private String numeVas;
	private int numarPasageri;
	private int Durata;
	private static Croaziera croaziera = null;
	
	private Croaziera(String numeVas, int numarPasageri, int durata) {
		super();
		this.numeVas = numeVas;
		this.numarPasageri = numarPasageri;
		Durata = durata;
	}
	
	public static synchronized Croaziera getInstance(String numeVas, int numarPasageri, int durata) {
		if (croaziera == null) {
			croaziera = new Croaziera(numeVas, numarPasageri, durata);
		}
		return croaziera;
	}

	@Override
	public String toString() {
		return "Croaziera [numeVas=" + numeVas + ", numarPasageri=" + numarPasageri + ", Durata=" + Durata + "]";
	}
	
	
}
