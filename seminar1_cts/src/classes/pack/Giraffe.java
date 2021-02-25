package classes.pack;

public class Giraffe extends Animal{

	private float inaltime;

	public Giraffe(String name, float greutate) {
		super(name, greutate);
	}
	public Giraffe(String name, float greutate, float inaltime) {
		super(name, greutate);
		this.inaltime = inaltime;
	}
	
	public float getInaltime() {
		return inaltime;
	}
	public void setInaltime(float inaltime) {
		this.inaltime = inaltime;
	}
	
	
}
