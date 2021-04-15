package ro.ase.cts.classes;

public class Item implements IOptiuniMeniu{
	private String numeItem;

	public Item(String numeItem) {
		super();
		this.numeItem = numeItem;
	}

	@Override
	public void adaugaNod(IOptiuniMeniu optiune) throws Exception {
		
		throw new Exception("Exceptie");
	}

	@Override
	public void stergeNod(IOptiuniMeniu optiune){
		
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public IOptiuniMeniu getNod(int index) {
		
		throw new IllegalArgumentException("Exceptie");
	}

	@Override
	public void descriere() {
		
		System.out.println("Item: "+numeItem);
	}
	
	
}
