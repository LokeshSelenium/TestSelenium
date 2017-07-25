package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic_Scenario
{
public static void main(String[] args) 
{
  WebDriver driver=new FirefoxDriver();
  driver.get("https://q02int.gwpdev.seic.com");
  
  driver.manage().window().maximize();
  
  WebElement Uname = driver.findElement(By.name("USER"));
  Uname.sendKeys("Q02qseigen02");
  
  WebElement Password = driver.findElement(By.name("PASSWORD"));
  Password.sendKeys("Password1");
  
  WebElement button = driver.findElement(By.id("submit1"));
  button.click();
  
  WebElement frame1 = driver.findElement(By.id("alertsCountIframe"));
  driver.switchTo().frame(frame1);
  
  driver.findElement(By.xpath("//span[text()='Log Off']")).click();
  driver.switchTo().defaultContent();  
  
  try
  {
  Thread.sleep(2000);
  }
  catch(InterruptedException ae)
  {
	  System.out.println("Exception due to time");
	  	  
  }
  driver.findElement(By.id("alertDiv"));
  driver.switchTo().frame(driver.findElement(By.id("alertIframeId")));
  driver.findElement(By.id("tblButtonBar2"));
  driver.findElement(By.xpath("//input[@value='Log Off']")).click();
  driver.close();
	
}
}