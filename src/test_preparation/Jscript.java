package test_preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Jscript 
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		
		
		RemoteWebDriver r=(RemoteWebDriver)driver;
		r.executeScript("alert,('hi')");
		
	}

}
