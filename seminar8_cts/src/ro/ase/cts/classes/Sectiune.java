package ro.ase.cts.classes;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IOptiuniMeniu{
	List<IOptiuniMeniu> lista;
	private String numeSectiune;
	public Sectiune(String numeSectiune) {
		this.lista = new ArrayList<IOptiuniMeniu>();
		this.numeSectiune = numeSectiune;
	}
	@Override
	public void adaugaNod(IOptiuniMeniu optiune) {
		lista.add(optiune);
		
	}
	@Override
	public void stergeNod(IOptiuniMeniu optiune) {
		lista.remove(optiune);
		
	}
	@Override
	public IOptiuniMeniu getNod(int index) {
		
		return lista.get(index);
	}
	@Override
	public void descriere() {
		System.out.println("Sectiunea: "+numeSectiune);
		for(IOptiuniMeniu optiune: lista) {
			optiune.descriere();
		}
		
	}
	
	
}
