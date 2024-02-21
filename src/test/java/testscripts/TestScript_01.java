package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestScript_01 
{
	@Test
	public void m1()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://spectra.starlly.in/signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("email")).sendKeys("nikith@starlly.in");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath(".//button[text()='Login']")).click();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(".//div[@class='position-relative role-menu']"))).perform();
		driver.findElement(By.xpath(".//p[text()='Logout']")).click();
		driver.close();
		
	}

}
