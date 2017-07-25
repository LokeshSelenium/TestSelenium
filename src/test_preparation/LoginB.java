package test_preparation;



import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginB
{
	public static void main(String args[]) throws AWTException, IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://q02int.gwpdev.seic.com");
		driver.manage().window().maximize();
		
		LoginA a1=new LoginA(driver);
		a1.login("Q02qseigen02","Password1");
		
		
		
		Robot r=new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRect=new Rectangle(d);
		BufferedImage img = r.createScreenCapture(screenRect);
		ImageIO.write(img,"jpg",new File("C:/Test.jpg"));
		
		
		
	
		
	}
	

}



/*Declaration is just create variable
Initializationis just assign value to that variable which will be inside the constructor
Utiliazation is use the same value in the  */