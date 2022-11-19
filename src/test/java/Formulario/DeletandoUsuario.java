package Formulario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class DeletandoUsuario {
	
	Metodos met = new Metodos();
	Elementos elem = new Elementos();
	

	@Before
	public void setUp() throws Exception {
		met.iniciarTeste("https://automacaocombatista.herokuapp.com/users?page=3");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		met.clique(elem.getBotaoDeletarUsuario());
		met.aceitarAlerta();
		
	}
	
	

}
