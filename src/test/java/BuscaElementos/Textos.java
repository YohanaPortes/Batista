package BuscaElementos;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Textos extends Metodos{
	
	Elementos elem = new Elementos();

	@Before
	public void setUp() throws Exception {
		iniciarTeste("https://automacaocombatista.herokuapp.com/buscaelementos/textos");
	}

	@After
	public void tearDown() throws Exception {
		fecharNavegador();
	}

	@Test
	public void test() throws IOException {
		validarTexto(elem.getTituloTexto1(), "Debugando com ByeByug.");
		validarTexto(elem.getTexto1(), "Você já passou pela situação de não estar conseguindo rodar um comando em testes, por algum motivo de elemento mapeado errado entre outras situaçōes. E ter que rodar seus testes de novo para ver se conseguiu mapear correto ou se funcionou o comando que você inseriu?");
		System.out.println("Texto 01 Validado");
		validarTexto(elem.getTituloTexto2(), "Trabalhando com verificações e esperas de elementos com o Capybara, SitePrism e Rspec.(Parte II)");
		validarTexto(elem.getTexto2(), "Você já passou pela situação de não encontrar um elemento na tela ou até mesmo ele estando lá e dar erro na sua automação: Então vou falar um pouco sobre alguns métodos para verificação de elementos e espera de elementos..");
		System.out.println("Texto 02 Validado");
		validarTexto(elem.getTituloTexto3(), "Aprenda por definitivo a usar CSS Selector(Adeus Xpath).");
		validarTexto(elem.getTexto3(), "Pra quem começa na área de testes automatizados a primeira coisa que aprende, é buscar elementos por Xpath pelo fato de existir umas ferramentas que auxiliam na busca de elementos.");
		System.out.println("Texto 03 Validado");
		validarTexto(elem.getTituloTexto4(), "Trabalhando com verificações e esperas de elementos com o Capybara, SitePrism e Rspec.(Parte I)");
		validarTexto(elem.getTexto4(), "Você já passou pela situação de não encontrar um elemento na tela ou até mesmo ele estando lá e dar erro na sua automação: Então vou falar um pouco sobre alguns métodos para verificação de elementos e espera de elementos..");
		System.out.println("Texto 04 Validado");
		validarTexto(elem.getTituloTexto5(), "5 dicas para fazer um teste automatizado em Ruby com qualidade, chega de gambiarra!");
		validarTexto(elem.getTexto5(), "Desde que comecei a trabalhar mais perto dos desenvolvedores aqui da AppProva vejo que eles têm uma preocupação muito grande com a qualidade do código e padrões de projetos. Aqui usamos várias ferramentas que auxiliam a verificar a qualidade do código e também temos um code review muito forte, onde todos do time analisam o código e o desenvolvedor só pode subir sua feature se 1 sênior e mais 3 desenvolvedores aprovem a sua feature, onde são analizados:.");
		System.out.println("Texto 05 Validado");
		validarTexto(elem.getTituloTexto6(), "Integração contínua com Codeship");
		validarTexto(elem.getTexto6(), "Mas primeiro vamos falar o que é a integração contínua? A integração contínua é uma prática de desenvolvimento de software de DevOps em que os desenvolvedores, com frequência, juntam suas alterações de código em um repositório central. Depois disso, criações e testes são executados. Geralmente, a integração contínua se refere ao estágio de criação ou integração do processo de lançamento de software, além de originar um componente de automação (ex.: uma CI ou serviço de criação) e um componente cultural (ex.: aprender a integrar com frequência).");
		System.out.println("Texto 06 Validado");
	
	
	
	}

}
