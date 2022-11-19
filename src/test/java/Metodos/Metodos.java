package Metodos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Elementos.Elementos;

public class Metodos extends Elementos {

	public WebDriver yohana;

	public void iniciarTeste(String parametro) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver105.exe");
		yohana = new ChromeDriver();
		yohana.get(parametro);
		yohana.manage().window().maximize();

	}

	public void escrever(String texto, By elemento) {
		yohana.findElement(elemento).sendKeys(texto);
	}

	public void escreverTexto(String texto) {
		yohana.findElement(null).sendKeys(texto);
	}
	
	public void pagHome(By elemento) {
		yohana.findElement(elemento).click();
	}

	public void clique(By elemento) {
	//WebDriverWait wait = new WebDriverWait(yohana, TimeUnit.SECONDS,10);
	
		
		 yohana.findElement(elemento).click();
	}

	public void apagar(By elemento) {
		yohana.findElement(elemento).clear();
	}

	public void aceitarAlerta() {
		yohana.switchTo().alert().accept();
	}

	public void recusarAlerta() {
		yohana.switchTo().alert().dismiss();
	}

	public void escreverNoAlerta(String texto) {
		yohana.switchTo().alert().sendKeys(texto);
	}

	public void screnShot(String execucao) throws IOException {
		TakesScreenshot screnShot = ((TakesScreenshot) yohana);
		File scrFile = screnShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + execucao + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}

	public void alternarAba0() {

		ArrayList<String> tabs = new ArrayList<String>(yohana.getWindowHandles());
		yohana.switchTo().window(tabs.get(0));
		System.out.println("Aba Principal");
	}

	public void alternarAba1() {

		ArrayList<String> tabs = new ArrayList<String>(yohana.getWindowHandles());
		yohana.switchTo().window(tabs.get(1));
		System.out.println("Reconhecendo Aba 1");

	}

	public void fecharNavegador() {
		yohana.close();

	}
	
	public void validarCheckBox(By elemento){
		WebElement element = yohana.findElement(elemento);
		assertTrue(element.isSelected());
		
	}
	
	public void validarAtributo(By elemento, String atributoEsperado, String atributo) {
		String texto = yohana.findElement(elemento).getAttribute(atributo);
		assertEquals(atributoEsperado, texto);	
	}
	
	public void iframe (String id) {
		yohana.switchTo().frame(id);
	}
	
	public void validarTexto(By elemento, String texto) {
		
		String textoGet = yohana.findElement(elemento).getText();
		String textoEsperado = texto;
		assertEquals(textoEsperado, textoGet);
	}
	
	public void duploClique(By elemento) { // DA UM DUPLO CLIQUE NO ELEMENTO
		
		Actions acao = new Actions(yohana);
		WebElement element = yohana.findElement(elemento);
		acao.doubleClick(element).release().perform();
		
	}
	
	public void rightClique(By elemento) { // CLICA COM O BOTAO DIREITO DO MOUSE NO ELEMENTO
		
		Actions acao = new Actions(yohana);
		WebElement element = yohana.findElement(elemento);
		acao.contextClick(element).release().perform();
	}
	
	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) yohana;
		js.executeScript("window.scrollBy("+n1+","+n2+")");
	}
	
	
	public void dataPicker(By elementoMes, By elementoAno, String anoEsperado, String mesEsperado, int diaEsperado) {
		
		yohana.findElement(By.id("datepicker")).click();
		
		String mesRetornado = yohana.findElement(elementoMes).getAttribute("value");
		String anoRetornado = yohana.findElement(elementoAno).getAttribute("value");
		
		
		
		while(!anoRetornado.contains(anoEsperado)) { //enquanto
			
			yohana.findElement(By.xpath("//button[@class='month-next']")).click();
			anoRetornado = yohana.findElement(elementoAno).getAttribute("value");
				
			}
		
		while(!mesRetornado.contains(mesEsperado)) { //enquanto
			
			yohana.findElement(By.xpath("//button[@class='month-next']")).click();
			mesRetornado = yohana.findElement(elementoMes).getAttribute("value");
				
			}
		
		yohana.findElement(By.xpath("//*[text()='"+diaEsperado+"']")).click();
		yohana.findElement(By.xpath("//*[text()='Ok']")).click();
	}

	
}
