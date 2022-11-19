package MudancaDeFoco;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Modal extends Metodos{

	Elementos elem = new Elementos();
	
	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/mudancadefoco/modal");
	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws IOException {
		clique(elem.getModalAbrir());
		screnShot("Modal");
		clique(elem.getModalFechar());
	}

}
