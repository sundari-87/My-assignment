package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver1=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		//driver1.get("https://www.youtube.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(" testleaf.2023@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
