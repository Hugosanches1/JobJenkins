package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class TesteJobJenkins {

	@Test
	public void deveValidarJobJenkinsTest() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver  = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
		//driver  = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("hugos@hugos");
		driver.findElement(By.id("senha")).sendKeys("134");
		driver.findElement(By.xpath("//button[text()='Entrar']")).click();
		
		Assert.assertEquals("Bem vindo, hugo!", driver.findElement(By.xpath("//div[text()='Bem vindo, hugo!']")).getText());
		
		driver.close();
		
	}

}
