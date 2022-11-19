package BuscaElementos;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Metodos.Metodos;

public class Botoes extends Metodos {

	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/buscaelementos/botoes");

	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws IOException, InterruptedException {
		clique(getRaised());
		Thread.sleep(1000);
		clique(getFloating());
		Thread.sleep(1000);
		clique(getFlat());
		Thread.sleep(1000);
		clique(getSubmmit());
		Thread.sleep(1000);
		validarAtributo(getDisable(), "btn-large disabled", "class");
		screnShot("Botoes");
		getBotaoVoltar();
	}

}
