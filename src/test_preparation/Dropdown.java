package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.istqb.org/");
		
		/*driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();*/
		
		WebElement ISTQB = driver.findElement(By.linkText("Certification"));
		Thread.sleep(20000);
		//WebElement ISTQB=driver.findElement(By.partialLinkText("ISTQB®"));
		//WebElement ISTQB=driver.findElement(By.linkText("ISTQB® Worldwide "));
		//WebElement ISTQB = driver.findElement(By.linkText("Product Category"));
	      
		
		Actions action=new Actions(driver);
		
		action.moveToElement(ISTQB).perform();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(@href,'/certification-path-root/advanced-security-tester.html')]")).click();
		Thread.sleep(10000);
		
		
		
	}

}
