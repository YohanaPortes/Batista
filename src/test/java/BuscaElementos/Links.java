package BuscaElementos;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Links extends Metodos{

	Elementos elem = new Elementos();

	
	
	@Before
	public void setUp() throws Exception {
	iniciarTeste("https://automacaocombatista.herokuapp.com/treinamento/home");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException, IOException {
		clique(elem.getBotaoBuscarElem());
		Thread.sleep(1000);
		clique(elem.getBotaoLinks());
		Thread.sleep(1000);
		clique(elem.getOk200());
		screnShot("OK 200");
		Thread.sleep(1000);
		clique(elem.getVoltar());
		Thread.sleep(1000);
		clique(elem.getErro400());
		screnShot("Erro 400");
		Thread.sleep(1000);
		clique(elem.getVoltar());
		Thread.sleep(1000);
		clique(elem.getErro404());
		screnShot("Erro 404");
		Thread.sleep(1000);
		clique(elem.getVoltar());
		Thread.sleep(1000);
		clique(elem.getErro500());
		screnShot("Erro 500");
	}	

}
