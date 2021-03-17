package ro.ase.cts.classes;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare=30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	public static float getSumaFinantare() {
		return sumaFinantare;
	}
	public static void setSumaFinantare(float sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}
	
	@Override
	public String toString() {
		return "Elev: "+super.toString()+ "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nrProiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int finantare() {
		int suma=30;
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+suma+" Euro/zi in proiect.");
		return suma;
	}
	@Override
	public float getSumaFinantata() {
		return sumaFinantare;
	}
	
}
