package br.lucas.Mocks;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAutomatizado {
	/*public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com.br");
		WebElement campoDeTexto = driver.findElement(By.name("q"));
		campoDeTexto.sendKeys("javali");
		campoDeTexto.submit();
		driver.close();
	}*/
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://192.168.4.103:8080/correntista/lista");
	driver.findElement(By.linkText("Add Correntista")).click();
	driver.findElement(By.id("nome")).sendKeys("Lucas Pedro Bermejo");
	driver.findElement(By.id("email")).sendKeys("lucas@testecom.br");
	WebElement campoDeTexto = driver.findElement(By.id("button1"));
	campoDeTexto.submit();
	//driver.close();
	}
	
	@Test
	public void testeSelenium() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.4.103:8080/correntista/lista");
		boolean achouEmail = driver.getPageSource().contains("	lucas@testecom.br");
		assertTrue(achouEmail);
	}
	
}
