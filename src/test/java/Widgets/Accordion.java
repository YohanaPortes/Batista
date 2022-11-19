package Widgets;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Accordion extends Metodos {

	Elementos elem = new Elementos();

	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/widgets/accordion");

	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws IOException, InterruptedException {
		clique(elem.getFirst());
		Thread.sleep(1000);
		validarTexto(elem.getTextoFirst(), "Primeiro Texto.");
		screnShot("Accordion - Primeiro");
		clique(elem.getSecond());
		Thread.sleep(1000);
		validarTexto(elem.getTextoSecond(), "Segundo Texto.");
		screnShot("Accordion - Segundoo");
		clique(elem.getThird());
		Thread.sleep(1000);
		validarTexto(elem.getTextoThird(), "Terceiro Texto.");
		screnShot("Accordion - Terceiro");
	}
}
