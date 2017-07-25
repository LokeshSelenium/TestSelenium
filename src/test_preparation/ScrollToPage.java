package test_preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollToPage
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		
		driver.manage().window().maximize();
		
		RemoteWebDriver rm=(RemoteWebDriver)driver;
		//String code1="window.scrollTo(0,document.body.scrollHeight)";
		//Thread.sleep(1000);
		//String code2="window.scrollTo(document.body.scrollWidth,0)";
		for(int i=1;i<=5;i++)
		{		
		rm.executeScript("window.scrollBy(0,100)");
		
		Thread.sleep(2000);
		//rm.executeScript(code2);
		}
		
		
	}

}
