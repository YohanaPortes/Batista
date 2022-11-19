package Outros;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Scroll extends Metodos{
	
	Elementos elem = new Elementos();
	
	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/outros/scroll");
	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws IOException {
		scroll(0, 1800);
		screnShot("Scroll");
		
	}
}
