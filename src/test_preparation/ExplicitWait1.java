package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1
{
	public static void main(String args[])
	{
		WebDriver driver =new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		
		driver.findElement(By.name("USER")).sendKeys("Q02qseigen02");
		driver.findElement(By.name("PASSWORD")).sendKeys("Password1");
		driver.findElement(By.id("submit1")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);		
		wait.until(ExpectedConditions.titleIs("SEI Investmentss"));
		
		
					
	}

}
