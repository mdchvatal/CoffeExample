
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	private OldCoffeeMachine machine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine machine) {
		this.machine = machine;
	}
	
	public void chooseFirstSelection() {
		machine.selectA();
	}
	
	public void chooseSecondSelection() {
		machine.selectB();
	}

}
