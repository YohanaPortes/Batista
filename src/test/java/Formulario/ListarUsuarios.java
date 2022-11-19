package Formulario;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class ListarUsuarios extends Metodos {
	
	
	Elementos elem = new Elementos();
	
	@Before
	public void setUp() throws Exception {
	iniciarTeste("https://automacaocombatista.herokuapp.com/treinamento/home");	
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException, InterruptedException {
	clique(elem.getBotaoFormulario());
	Thread.sleep(1000);
	clique(elem.getBotaoListar());
	screnShot("Lista de Usuarios - pagina 01");
	Thread.sleep(1000);
	clique(elem.getProximaPagina());
	screnShot("Lista de Usuarios - pagina 02");
	Thread.sleep(1000);
	clique(elem.getUltimaPagina());
	screnShot("Lista de Usuarios - ultima pagina");
		
	
	}

}
