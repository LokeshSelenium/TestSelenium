package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonEnbaled
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		
		WebElement button = driver.findElement(By.id("submit1"));
		
		if(button.isDisplayed() && button.isSelected())
		{
			System.out.println("User can click on button");
		}
		else
		{
			System.out.println("User can not click on button");
		}
		
		
	}

}
