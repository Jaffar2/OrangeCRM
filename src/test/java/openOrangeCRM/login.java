package openOrangeCRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	@Test
	public void loginTest()
	{
		driver =new ChromeDriver();
		driver.get("https://www.orangecrm.com/");
		driver.manage().window().maximize();
		System.out.print("Browser open");
	
	}

}
