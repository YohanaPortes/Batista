package Elementos;

import org.openqa.selenium.By;

public class Elementos {
//  Criar usuário
	private By campoNome = By.id("user_name");
	private By ultimoNome = By.id("user_lastname");
	private By campoEmail = By.id("user_email");
	private By endereco = By.id("user_address");
	private By universidade = By.id("user_university");
	private By profissao = By.id("user_profile");
	private By genero = By.id("user_gender");
	private By idade = By.id("user_age");
	private By botaoCriar = By.xpath("//*[@id='new_user']/div[5]/div/div");

//  Editar usuário
	private By botaoEditar = By.xpath("//a[@href='/users/3160/edit']");
	private By edicaoRua = By.id("user_address");
	private By botaoCriarEdicao = By.xpath("//div[@class='actions btn waves-effect green']");
	private By botaoDeletarUsuario = By.xpath("(//a[@href='/users/3168'])[2]");
	
//  Botões Menu Página Treinamento Home	
	private By botaoFormulario = By.xpath("//a[@class='collapsible-header ']");
	private By botaoCriarUsuario = By.xpath("//*[text()='Criar Usuários']");
	private By botaoListar = By.xpath("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a");
	private By botaoBuscarElem = By.xpath("(//a[@class='collapsible-header waves-teal'])[1]");  
	//   (//div[@class='collapsible-body']/ul/li)[1]
	private By botaoLinks = By.xpath("//a[@href='/buscaelementos/links']");
	private By botaoInputs = By.xpath("//a[@href='/buscaelementos/inputsetextfield']");
	private By botaoBotoes = By.xpath("//a[@href='/buscaelementos/botoes']");
	private By botaoRadio = By.xpath("//a[@href='/buscaelementos/radioecheckbox']");
	private By botaoDropdown = By.xpath("//a[@href='/buscaelementos/dropdowneselect']");
	private By botaoTextos = By.xpath("//a[@href='/buscaelementos/textos']");
	private By botaoTabela = By.xpath("//a[@href='/buscaelementos/table']");
	
//  Listar Usuários
	private By proximaPagina = By.xpath("(//a[@rel='next'])[2]"); 
	private By ultimaPagina = By.xpath("/html/body/div[3]/div/nav/span[11]/a");
			
//  Links	
	private By ok200 = By.xpath("//a[@href='/buscaelementos/success']");
	private By erro400 = By.xpath("//a[@href='/buscaelementos/badrequest']");
	private By erro404 = By.xpath("//a[@href='/buscaelementos/notfound']");
	private By erro500 = By.xpath("//a[@href='/buscaelementos/internalservererror']");
	private By voltar = By.xpath("(//a[@href='/buscaelementos/links'])[2]");

// Input e TextField	
	private By primeiroNome = By.id("first_name");
	private By sobrenome = By.id("last_name");
	private By password = By.id("password");
	private By email = By.id("email");
	private By textArea = By.id("textarea1");
	private By botaoVoltar = By.xpath("//a[@class='btn red']");
	
	
//  Botões
	private By raised = By.xpath("//a[@onclick='ativaedesativa1()']");
	private By floating = By.xpath("//a[@onclick='ativaedesativa2()']");
	private By flat = By.xpath("//a[@onclick='ativaedesativa3()']");
	private By submmit = By.xpath("//button[@onclick='ativaedesativa4()']");
	private By disable = By.xpath("(//a[text()='Button'])[2]");
	private By retornoTexto1 = By.xpath("(//h5[text()='Você Clicou no Botão!'])[1]");
	private By retornoTexto2 = By.xpath("(//h5[text()='Você Clicou no Botão!'])[2]");
	private By retornoTexto3 = By.xpath("(//h5[text()='Você Clicou no Botão!'])[3]");
	private By retornoTexto4 = By.xpath("(//h5[text()='Você Clicou no Botão!'])[4]");
	private By retornoTexto5 = By.xpath("(//h5[text()='Você Clicou no Botão!'])[5]");
	// botão voltar já criado

//  Radio e Checkbox
	private By red = By.xpath("//label[@for='red']");
	private By blue = By.xpath("//label[@for='blue']");
	private By yellow = By.xpath("//label[@for='yellow']");
	private By green = By.xpath("//label[@for='green']");
	private By purple = By.xpath("//label[@for='purple']");
	private By grey = By.xpath("//label[@for='grey']");
	private By black = By.xpath("//label[@for='black']");
	private By white = By.xpath("//label[@for='white']");
	private By validarRed = By.xpath("//input[@id='red']");
	private By validarBlue = By.xpath("//input[@id='blue']");
	private By validarYellow = By.xpath("//input[@id='yellow']");
	private By validarGreen = By.xpath("//input[@id='green']");
	private By validarPurple = By.xpath("//input[@id='purple']");
	private By validarGrey = By.xpath("//input[@id='grey']");
	private By validarBlack = By.xpath("//input[@id='black']");
	private By validarWhite = By.xpath("//input[@id='white']");
	// botão voltar já criado
	
//  DropDown e Select
	private By mailBox = By.xpath("//a[@class=\'btn dropdown-button']");
	private By inbox = By.id("dropdown1");
	private By unread = By.id("dropdown2");
	private By sent = By.id("dropdown3");
	private By outbox = By.id("dropdown4");
	
	private By desenhoFav = By.xpath("(//input[@class='select-dropdown'])[1]");
	private By jogador = By.xpath("(//input[@class='select-dropdown'])[2]");
	private By paisFav = By.xpath("(//input[@class='select-dropdown'])[3]");
	private By generoSel = By.xpath("(//input[@class='select-dropdown'])[4]");
	private By sexo = By.xpath("(//input[@class='select-dropdown'])[5]");
	private By browserFav = By.xpath("//select[@class='browser-default']");
	
// Textos
	private By tituloTexto1 = By.xpath("(//div[@class='card-content']/b)[1]");
	private By texto1 = By.xpath("(//div[@class='card-content']/p)[1]");
	private By tituloTexto2 = By.xpath("(//div[@class='card-content']/b)[2]");
	private By texto2 = By.xpath("(//div[@class='card-content']/p)[2]");
	private By tituloTexto3 = By.xpath("(//div[@class='card-content']/b)[3]");
	private By texto3 = By.xpath("(//div[@class='card-content']/p)[3]");
	private By tituloTexto4 = By.xpath("(//div[@class='card-content']/b)[4]");
	private By texto4 = By.xpath("(//div[@class='card-content']/p)[4]");
	private By tituloTexto5 = By.xpath("(//div[@class='card-content']/b)[5]");
	private By texto5 = By.xpath("(//div[@class='card-content']/p)[5]");
	private By tituloTexto6 = By.xpath("(//div[@class='card-content']/b)[6]");
	private By texto6 = By.xpath("(//div[@class='card-content']/p)[6]");
	
// Alert
	private By jsAlert = By.xpath("//button[@onclick='jsAlert()']");
	private By jsConfirm = By.xpath("//button[@onclick='jsConfirm()']");
	private By jsPrompt = By.xpath("//button[@onclick='jsPrompt()']");
	
	
// Janela
	private By newWindow = By.xpath("(//a[@href='/mudancadefoco/newwindow'])[2]");
	private By btnVoltar = By.xpath("//input[@value='Voltar']");

// Modal
	private By modalAbrir = By.xpath("//a[@href='#modal1']");
	private By modalFechar = By.xpath("//a[@class='modal-close waves-green btn-flat']");
	
//  Accordion
	private By first = By.xpath("(//div[@class='collapsible-header'])[1]");
	private By textoFirst = By.xpath("(//div[@class='collapsible-body'])[7]");
	private By second = By.xpath("(//div[@class='collapsible-header'])[2]");
	private By textoSecond = By.xpath("//span[text()='Segundo Texto.']");
	private By third = By.xpath("(//div[@class='collapsible-header'])[3]");
	private By textoThird = By.xpath("(//div[@class='collapsible-body']/span)[3]");
	
// Datapicker
	private By elementoMes = By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[1]");
	private By elementoAno = By.xpath("(//input[@class='select-dropdown dropdown-trigger'])[2]");
	
	
// Upload
	private By upload = By.xpath("(//input[@id='upload'])[1]");
	


	
	
	
	public By getCampoNome() {
		return campoNome;
	}

	public By getRed() {
		return red;
	}

	public By getBlue() {
		return blue;
	}

	public By getYellow() {
		return yellow;
	}

	public By getGreen() {
		return green;
	}

	public By getPurple() {
		return purple;
	}

	public By getGrey() {
		return grey;
	}

	public By getBlack() {
		return black;
	}

	public By getWhite() {
		return white;
	}

	public By getUltimoNome() {
		return ultimoNome;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getEndereco() {
		return endereco;
	}

	public By getUniversidade() {
		return universidade;
	}

	public By getProfissao() {
		return profissao;
	}

	public By getGenero() {
		return genero;
	}

	public By getIdade() {
		return idade;
	}

	public By getBotaoCriar() {
		return botaoCriar;
	}

	public By getBotaoEditar() {
		return botaoEditar;
	}

	public By getEdicaoRua() {
		return edicaoRua;
	}

	public By getBotaoCriarEdicao() {
		return botaoCriarEdicao;
	}

	public By getBotaoDeletarUsuario() {
		return botaoDeletarUsuario;
	}

	public By getBotaoFormulario() {
		return botaoFormulario;
	}

	public By getBotaoCriarUsuario() {
		return botaoCriarUsuario;
	}

	public By getBotaoListar() {
		return botaoListar;
	}

	public By getBotaoBuscarElem() {
		return botaoBuscarElem;
	}

	public By getBotaoLinks() {
		return botaoLinks;
	}

	public By getBotaoInputs() {
		return botaoInputs;
	}

	public By getBotaoRadio() {
		return botaoRadio;
	}

	public By getBotaoBotoes() {
		return botaoBotoes;
	}

	public By getBotaoDropdown() {
		return botaoDropdown;
	}

	public By getBotaoTextos() {
		return botaoTextos;
	}

	public By getBotaoTabela() {
		return botaoTabela;
	}

	public By getProximaPagina() {
		return proximaPagina;
	}

	public By getUltimaPagina() {
		return ultimaPagina;
	}

	public By getOk200() {
		return ok200;
	}

	public By getErro400() {
		return erro400;
	}

	public By getErro404() {
		return erro404;
	}

	public By getErro500() {
		return erro500;
	}

	public By getVoltar() {
		return voltar;
	}

	public By getPrimeiroNome() {
		return primeiroNome;
	}

	public By getSobrenome() {
		return sobrenome;
	}

	public By getPassword() {
		return password;
	}

	public By getRaised() {
		return raised;
	}

	public By getFloating() {
		return floating;
	}

	public By getSubmmit() {
		return submmit;
	}

	public By getFlat() {
		return flat;
	}

	public By getEmail() {
		return email;
	}

	public By getTextArea() {
		return textArea;
	}

	public By getBotaoVoltar() {
		return botaoVoltar;
	}

	public By getDisable() {
		return disable;
	}

	public By getMailBox() {
		return mailBox;
	}

	public By getInbox() {
		return inbox;
	}

	public By getUnread() {
		return unread;
	}

	public By getSent() {
		return sent;
	}

	public By getOutbox() {
		return outbox;
	}

	public By getDesenhoFav() {
		return desenhoFav;
	}

	public By getJogador() {
		return jogador;
	}

	public By getPaisFav() {
		return paisFav;
	}

	public By getGeneroSel() {
		return generoSel;
	}

	public By getSexo() {
		return sexo;
	}

	public By getBrowserFav() {
		return browserFav;
	}

	public By getValidarRed() {
		return validarRed;
	}

	public By getValidarBlue() {
		return validarBlue;
	}

	public By getValidarYellow() {
		return validarYellow;
	}

	public By getValidarGreen() {
		return validarGreen;
	}

	public By getValidarPurple() {
		return validarPurple;
	}

	public By getValidarGrey() {
		return validarGrey;
	}

	public By getValidarBlack() {
		return validarBlack;
	}

	public By getValidarWhite() {
		return validarWhite;
	}

	public By getJsAlert() {
		return jsAlert;
	}

	public By getJsConfirm() {
		return jsConfirm;
	}

	public By getJsPrompt() {
		return jsPrompt;
	}

	public By getNewWindow() {
		return newWindow;
	}

	public By getBtnVoltar() {
		return btnVoltar;
	}

	public By getModalAbrir() {
		return modalAbrir;
	}

	public By getModalFechar() {
		return modalFechar;
	}

	public By getRetornoTexto1() {
		return retornoTexto1;
	}

	public By getRetornoTexto2() {
		return retornoTexto2;
	}

	public By getRetornoTexto3() {
		return retornoTexto3;
	}

	public By getRetornoTexto4() {
		return retornoTexto4;
	}

	public By getRetornoTexto5() {
		return retornoTexto5;
	}

	public By getFirst() {
		return first;
	}

	public By getSecond() {
		return second;
	}

	public By getThird() {
		return third;
	}

	public By getTextoFirst() {
		return textoFirst;
	}

	public By getTextoSecond() {
		return textoSecond;
	}

	public By getTextoThird() {
		return textoThird;
	}

	public By getTexto1() {
		return texto1;
	}

	public By getTexto2() {
		return texto2;
	}

	public By getTexto3() {
		return texto3;
	}

	public By getTexto4() {
		return texto4;
	}

	public By getTexto5() {
		return texto5;
	}

	public By getTexto6() {
		return texto6;
	}

	
	public By getUpload() {
		return upload;
	}

	public By getElementoMes() {
		return elementoMes;
	}

	public By getElementoAno() {
		return elementoAno;
	}

	public By getTituloTexto1() {
		return tituloTexto1;
	}

	public By getTituloTexto2() {
		return tituloTexto2;
	}

	public By getTituloTexto3() {
		return tituloTexto3;
	}

	public By getTituloTexto4() {
		return tituloTexto4;
	}

	public By getTituloTexto5() {
		return tituloTexto5;
	}

	public By getTituloTexto6() {
		return tituloTexto6;
	}

}
