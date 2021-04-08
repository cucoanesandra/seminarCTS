package ro.ase.cts.decorator;

public class ConcretDecorator extends AbstractDecorator {

	public ConcretDecorator(ICard card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		System.out.println(((Card)super.getCard()).getDetinatorCard()+" a platit contactless.");
		
	}

	

}
