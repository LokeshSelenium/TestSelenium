package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollToSpecificLocation 
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		
		RemoteWebDriver rm=(RemoteWebDriver)driver;
		
		int y = driver.findElement(By.xpath("//div[text()='Selenium Dot Formatter']")).getLocation().getY();
		String code = "window.scrollTo(0,"+y+")";
		
		rm.executeScript(code);
		
		
		
	}

}
