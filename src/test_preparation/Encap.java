package test_preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Encap
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		
		Encapsulate a1=new Encapsulate(driver);
		a1.SetUsername();
		
		
	}

}
