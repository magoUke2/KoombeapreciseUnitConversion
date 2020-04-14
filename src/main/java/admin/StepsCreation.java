package admin;

import java.util.logging.Level;

import configuration.Utils;
import testCases.General;
import testCases.MenuSeleccion;

public class StepsCreation extends Utils {
	private General test;
	private MenuSeleccion menu;
	
	public StepsCreation() {
		test=new General();
		menu=new MenuSeleccion();
	}
	
	public void press7() {
		logger.log(Level.INFO, "Iniciando presionar 7");
		test.press7();
	}
	
	public void pressNumero(String numero) {
		logger.log(Level.INFO, "Iniciando presionar "+numero);
		test.pressNumer(numero);
	}

	public void iniciarApp() {
		logger.info("iniciando app");
		test.iniciarApp();
	}
	
	public void clickMenu() {
		menu.pressMainMenu();
	}

	public void pressOption(String option) {
		test.pressOption(option);
	}

	public void clickVolumen() {
		menu.clickVolumen();
	}

	public void unidadInicial() {
		test.unidadInicial();
	}

	public void unidadFinal() {
		test.unidadFinal();
	}

	public void scroll(String x, String y) {
		test.scroll(Integer.parseInt(x), Integer.parseInt(y));
	}

	public void scroll2(String text) {
		test.scroll2element(text);
		
	}

	public void screenshot(String x) {
		test.screenshot(x);
	}
}
