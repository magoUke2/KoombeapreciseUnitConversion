package stepsDefinition;

import java.util.Map;

import admin.App;
import admin.StepsCreation;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class Steps {
	App aplicacion=new App();
	StepsCreation steps= aplicacion.loadSteps();
	
	@Then("^presionar 7$")
	public void press7() {
		steps.press7();
	}
	
	@Then("^press (.*)$")
	public void press(int arg1) {
	    System.out.println("aaa");
	}
	
	@Then("^presionar numero (.*)$")
	public void pressNumber(String numero) {
		steps.pressNumero(numero);
	}
	
	@Then("^presionar opcion (.*)$")
	public void pressOption(String option) {
		steps.pressOption(option);
	}
	
	@Given("^iniciar app$")
	public void iniciarApp() {
		steps.iniciarApp();
	}
	
	@Then("^presionar menu principal$")
	public void pressMainMenu() {
		steps.clickMenu();
	}
	
	@Then("^Seleccionar Volumen$")
	public void volumen() {
		steps.clickVolumen();
	} 
	
	@Then("^esperar (.*)$")
	public void esperar(String wait) {
		try {
			Thread.sleep(Integer.parseInt(wait)*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	@Then("^Seleccionar Unidad Inicial$")
	public void unidadInicial() {
		steps.unidadInicial();
	} 
	
	@Then("^Seleccionar Unidad final$")
	public void unidadFinal() {
		steps.unidadFinal();
	} 

	@Then("^Scroll al item (.*)$")
	public void scroll(String x) {
		//steps.scroll(x,y);
		steps.scroll2(x);
	}
	
	@Then("^Tomar screenshot (.*)$")
	public void screenshot(String x) {
		steps.screenshot(x);
	}
	
	
	
	
}

