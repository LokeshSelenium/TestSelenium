package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplewaystoclickonbutton
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		
		driver.findElement(By.name("USER")).sendKeys("q02qseigen02");
		driver.findElement(By.name("PASSWORD")).sendKeys("Password1");
		
		//driver.findElement(By.id("submit1")).click();
		
		driver.findElement(By.id("submit1")).submit();
		
		//driver.findElement(By.id("submit1")).sendKeys(Keys.ENTER);
		
		
		
		
		
	}

}
