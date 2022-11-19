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

public class Mousehover {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver103.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://automacaocombatista.herokuapp.com/iteracoes/mousehover");
		driver.manage().window().maximize();

		Actions acao = new Actions(driver);
		WebElement elemento = driver.findElement(By.xpath("//p[@class='activator']"));
		acao.moveToElement(elemento).build().perform();
		
		TakesScreenshot screnShot = ((TakesScreenshot) driver);
		File scrFile = screnShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/Mousehover.png");
		FileUtils.copyFile(scrFile, destFile);

	}

}