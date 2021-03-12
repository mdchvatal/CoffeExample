
public class NewCoffeeMachine {

	public static void main(String[] args) {
			OldCoffeeMachine old = new OldCoffeeMachine();
			CoffeeTouchscreenAdapter newCM = new CoffeeTouchscreenAdapter(old);
			newCM.chooseFirstSelection();
			newCM.chooseSecondSelection();
	}
	

}
