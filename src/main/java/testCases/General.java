package testCases;

public class General extends dataDefinition.General{
	
	public void press7() {
		initializeDriver();
		click(button7);
		
	}
	
	public void pressNumer(String number) {
		clickByTextButton(number);
	}

	public void iniciarApp() {
		initializeDriver();
	}

	public void pressOption(String option) {
		clickByTextTextView(option);
	}

	public void unidadInicial() {
		click(from);
	}

	public void unidadFinal() {
		click(to);
	}
	
	public void scrollo(int x,int y) {
		scroll(x, y);
	}
	
}
