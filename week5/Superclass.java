package week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Superclass {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preconditions(String url,String uname,String pwd) 
	{ 
		// TODO Auto-generated method stub

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();
	}

}
