package BuscaElementos;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Metodos.Metodos;

public class Inputs extends Metodos {

	
	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/buscaelementos/inputsetextfield");
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
		escrever("Maria", getPrimeiroNome());
		String nome = yohana.findElement(getPrimeiroNome()).getAttribute("value");
		assertEquals("Maria", nome);
		
		escrever("Ferreira", getSobrenome());
		String sobrenome = yohana.findElement(getSobrenome()).getAttribute("value");
		assertEquals("Ferreira", sobrenome);
		
		escrever("senha123", getPassword());
		String password = yohana.findElement(getPassword()).getAttribute("value");
		assertEquals("senha123", password);
		
		escrever("mariaferreira22@uol.com.br", getEmail());
		String email = yohana.findElement(getEmail()).getAttribute("value");
		assertEquals("mariaferreira22@uol.com.br", email);
		
		clique(getTextArea());
		escrever("Futuros Q.A.'s em ação!!!!", getTextArea());
		String textArea = yohana.findElement(getTextArea()).getAttribute("value");
		assertEquals("Futuros Q.A.'s em ação!!!!", textArea);
		screnShot("Inputs e TextArea");
		
		clique(getBotaoVoltar());
	}

}
