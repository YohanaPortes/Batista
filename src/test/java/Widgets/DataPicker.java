package Widgets;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;




public class DataPicker extends Metodos{
	
	Elementos elem = new Elementos();

	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/widgets/datapicker");
	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws InterruptedException, IOException {
		
		dataPicker(elem.getElementoMes(), elem.getElementoAno(), "2025", "October", 14);
		screnShot("Datapicker");

	}

}
