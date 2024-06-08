package openOrangeCRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	WebDriver driver;
	@BeforeTest
	public void loginTest()
	{
		driver =new ChromeDriver();
		driver.get("https://www.orangecrm.com/");
		driver.manage().window().maximize();
		System.out.print("Browser open");
	
	}
	@Test
	public void clickFeature()
	{
	driver.findElement(By.xpath("//a[normalize-space()='FEATURES']")).click();	
	System.out.print("Feature click");
	}
	@AfterTest
	public void close()
	{
		driver.close();
	}

}
