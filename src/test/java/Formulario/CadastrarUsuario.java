package Formulario;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Elementos.Elementos;
import Metodos.Metodos;

public class CadastrarUsuario {

	Metodos met = new Metodos();
	Elementos elem = new Elementos();

	@Before
	public void setUp() throws Exception {

		met.iniciarTeste("https://automacaocombatista.herokuapp.com/users/new");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {

		met.escrever("Yohana", elem.getCampoNome());
		met.escrever("Portes", elem.getUltimoNome());
		met.escrever("yohana.portes@gmail.com", elem.getCampoEmail());
		met.escrever("Avenida Senador Salgado Filho ", elem.getEndereco());
		met.escrever("E2e Treinamentos", elem.getUniversidade());
		met.escrever("Analista de Teste", elem.getProfissao());
		met.escrever("Feminino", elem.getGenero());
		met.escrever("42", elem.getIdade());
		met.screnShot("execucao");
		met.clique(elem.getBotaoCriar());
		met.screnShot("cadastro");
	}

}
