package test_preparation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XandY_cordinate
{
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.id("submit1"));
		
		int horizental=button.getLocation().getX();
		int vertical=button.getLocation().getY();
		
		int height=button.getSize().getHeight();
		int width=button.getSize().getWidth();
		
		String dom1 = button.getCssValue("font-size");
		String dom2 = button.getCssValue("color");
		String dom3 = button.getCssValue("font-family");
		String dom4 = button.getCssValue("text-align");
		
		
		
		String attributevalue = button.getAttribute("id");
		String text = button.getText();
		
		System.out.println("Distance from X cordinate " + horizental);
		System.out.println("Distance from Y cordinate " + vertical);
		
		System.out.println("Height of button is " + height);
		System.out.println("Width of button is " + width);
		
		System.out.println("Font Size is " + dom1);
		System.out.println("color is " + dom2);
		System.out.println("Font Family is " + dom3);
		System.out.println("Text Aline is " + dom4);
		
		System.out.println("Attribute value is " + attributevalue);
		System.out.println("Text value is " + text);
	}

}
