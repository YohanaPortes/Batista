package Interacoes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop{

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver105.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/iteracoes/draganddrop");
		driver.manage().window().maximize();
		
		Actions acao = new Actions(driver);
		WebElement elementoA = driver.findElement(By.id("winston"));
		WebElement elementoB = driver.findElement(By.id("dropzone"));
		acao.dragAndDrop(elementoA, elementoB).perform();
		
		
		TakesScreenshot screnShot = ((TakesScreenshot) driver);
		File scrFile = screnShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/DragAndDrop.png");
		FileUtils.copyFile(scrFile, destFile);
	}

}
