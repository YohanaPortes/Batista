package MudancaDeFoco;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Metodos.Metodos;

public class iframe extends Metodos {

	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/mudancadefoco/iframe");

	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws IOException {
		iframe("id_do_iframe");
		escrever("Maria", getPrimeiroNome());
		String nome = yohana.findElement(getPrimeiroNome()).getAttribute("value");
		assertEquals("Maria", nome);
		screnShot("Iframe");

	}

}
