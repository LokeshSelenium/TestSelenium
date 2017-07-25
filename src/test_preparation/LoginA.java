package test_preparation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginA
{
	private WebElement untb;
	private WebElement pwtb;
	private WebElement bntp;

	public LoginA(WebDriver driver)
	{  
		untb=driver.findElement(By.name("USER"));
		pwtb=driver.findElement(By.name("PASSWORD"));
	    bntp=driver.findElement(By.id("submit1"));
	}
	public void login(String un,String pw)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pw);
		bntp.click();
	}

 
}
