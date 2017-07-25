package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox
{
public static void main(String args[])
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.amazon.in/s/ref=sr_nr_p_85_0?fst=as%3Aoff&rh=n%3A976419031%2Cn%3A1389401031%2Cn%3A1389432031%2Ck%3Amobile&keywords=mobile&ie=UTF8&qid=1499840776");
   
	WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	
	//checkbox.click();
	
	
	if(checkbox.isSelected())
	{
		System.out.println("Checkboxes are selected");
	}
	else
	{
		System.out.println("Checkboxes are not selected");
	}
	
}

}
