package ro.ase.cts.state_V2.program;

import ro.ase.cts.state_V2.classes.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa1=new Masa(1);
		masa1.rezervaMasa();
		
		masa1.rezervaMasa();
//		masa1.setStareMasa(new StareLibera());
//		masa1.rezervaMasa();
		
		masa1.ocupaMasa();
		masa1.elibereazaMasa();
	}

}
