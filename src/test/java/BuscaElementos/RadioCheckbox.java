package BuscaElementos;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class RadioCheckbox extends Metodos {
	Elementos elem = new Elementos();

	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/buscaelementos/radioecheckbox");
	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws IOException {
		clique(elem.getRed());
		validarCheckBox(elem.getValidarRed());
		System.out.println("Red Validado");
		clique(elem.getBlue());
		validarCheckBox(elem.getValidarBlue());
		System.out.println("Blue Validado");
		clique(elem.getYellow());
		validarCheckBox(elem.getValidarYellow());
		System.out.println("Yellow Validado");
		clique(elem.getGreen());
		validarCheckBox(elem.getValidarGreen());
		System.out.println("Green Validado");
		clique(elem.getPurple());
		validarCheckBox(elem.getValidarPurple());
		System.out.println("Purple Validado");
		clique(elem.getGrey());
		validarCheckBox(elem.getValidarGrey());
		System.out.println("Grey Validado");
		clique(elem.getBlack());
		validarCheckBox(elem.getValidarBlack());
		System.out.println("Black Validado");
		clique(elem.getWhite());
		validarCheckBox(elem.getValidarWhite());
		System.out.println("White Validado");
		screnShot("Radio e Checkbox");

	}

}
