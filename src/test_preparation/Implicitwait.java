package test_preparation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		driver.get("https://q02int.gwpdev.seic.com");
		
		WebElement Uname = driver.findElement(By.name("USER"));
		Uname.sendKeys("q02qseigen02");
		
		WebElement Password=driver.findElement(By.name("PASSWORD"));
		Password.sendKeys("Password1");
		
		driver.findElement(By.name("submit1")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("alertsCountIframe")));
		driver.findElement(By.xpath("//span[text()='Log Off']")).click();
		
		
		
		
	}

}
