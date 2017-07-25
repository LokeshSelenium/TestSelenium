package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DIU 
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		
		//Enter User Name
		WebElement un;
		un=driver.findElement(By.name("USER"));
		un.sendKeys("Q02qseigen02");
		
		//Enter Password
		WebElement pw;
		pw=driver.findElement(By.name("Password"));
		pw.sendKeys("Password1");
		
		//Click on Button
		WebElement btn;
		btn=driver.findElement(By.id("submit1"));
		btn.click();
		   
		
	}

}
