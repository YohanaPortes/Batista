package Formulario;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class EditandoUsuario {
	
	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();
	

	@Before
	public void setUp() throws Exception {
		metodo.iniciarTeste("https://automacaocombatista.herokuapp.com/users/3160");
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		metodo.clique(elemento.getBotaoEditar());
		Thread.sleep(2000);
		metodo.apagar(elemento.getEdicaoRua());
		metodo.escrever("Rua Alphaville", elemento.getEdicaoRua());
		metodo.clique(elemento.getBotaoCriarEdicao());
	}
	

}
