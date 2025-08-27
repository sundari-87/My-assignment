package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhadle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		Set<String> childWindow = driver.getWindowHandles();
		//convert set into list
		List<String> listWindow=new ArrayList<String>(childWindow);
		driver.switchTo().window(listWindow.get(1));
		 String chAddress = driver.getWindowHandle(); 
		  System.out.println(chAddress);
		  System.out.println(driver.getTitle());
		  driver.switchTo().window(listWindow.get(0));
		  System.out.println(driver.getTitle());
		  driver.close();
		

	}

}
