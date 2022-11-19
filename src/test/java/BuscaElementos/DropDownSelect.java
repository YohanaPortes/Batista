package BuscaElementos;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class DropDownSelect extends Metodos {

	Elementos elem = new Elementos();

	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/buscaelementos/dropdowneselect");
	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws IOException, InterruptedException {

		clique(elem.getMailBox());
		clique(elem.getInbox());
		clique(elem.getMailBox());
		clique(elem.getUnread());
		clique(elem.getMailBox());
		clique(elem.getSent());
		clique(elem.getMailBox());
		Thread.sleep(1000);
		clique(elem.getOutbox());
		screnShot("Dropdown");

	}

}
