package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Encapsulate
{
	
	private WebElement Un;
	
	public Encapsulate(WebDriver driver)
	{
		Un=driver.findElement(By.name("USER"));
		
	}
    public void SetUsername()
    {
    	Un.sendKeys("Q02qseigen02");
    }
}
