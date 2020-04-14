package admin;

import testCases.General;

public class TempVoidMain {
private General test;
	public static void main(String[] args) {
		App app=new App() ;
			
		TempVoidMain t=new TempVoidMain();
		t.execute();
	}
	
	public void execute() {
		test= new General();
		test.press7();
	}

}
