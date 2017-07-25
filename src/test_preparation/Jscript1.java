package test_preparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Jscript1 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		
		RemoteWebDriver r=(RemoteWebDriver)driver;
		 String code = "document.getElementById('submit1').click()";
		/*driver.get("file:///E:/Selenium/Sample%20Pages/Javascript1.html");
		
		RemoteWebDriver r=(RemoteWebDriver)driver;
		 String code = "document.getElementById('t1').value='admin'";
		 r.executeScript(code);
		 
		 Thread.sleep(1000);
		 String code1="document.getElementById('t1').value=''";
		 r.executeScript(code1);*/
		 r.executeScript(code);
	}

}
