package sele;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class rec {

	private WebDriver driver;

	@BeforeTest
	public void setup() {
		//TODO: Replace property with path to your chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Silk\\Silk WebDriver\\ng\\WebDriversSWD\\Windows\\Chrome\\2.43\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test
	public void myTestCaseName() {
		driver.get("http://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("devops");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).submit();
		driver.findElement(By.className("sA5rQ")).click();
	}

	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}