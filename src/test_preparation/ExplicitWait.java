package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("USER")).sendKeys("Q02qseigen02");
		driver.findElement(By.name("PASSWORD")).sendKeys("Password1");
		driver.findElement(By.id("submit1")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("alertsCountIframe")));
		WebDriverWait wait=new WebDriverWait(driver,20);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Log Off']")));
		
		
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}

}
