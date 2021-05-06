package ro.ase.cts.command.classes;

public class ContBancar {
	private String detinator;
	private float suma;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.suma = 0;
	}
	
	public void constituire(float suma) { 
		System.out.println("Contul a fost constituit");
		this.suma=suma;
	}
	
	public void retragere(float suma) {
		if(this.suma>=suma) {
			this.suma=this.suma-suma;
			System.out.println("O retragere in valoare de "+suma+" a fost efectuata.");
		}else {
			System.out.println("Fonduri insuficiente.");
		}
	}
	
	public void depunere(float suma) {
		this.suma=this.suma+suma;
		System.out.println("Suma de "+suma+" de lei a fost depusa in cont.");
	}
	
}
