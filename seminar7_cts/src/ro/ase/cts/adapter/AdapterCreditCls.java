package ro.ase.cts.adapter;

public class AdapterCreditCls extends Leasing implements InterfataCredit{

	
	public AdapterCreditCls() {
		super();
	}

	@Override
	public void acordaCredit(String numeClient, float suma) {
		super.oferaLeasing(numeClient, suma);
	}

}
