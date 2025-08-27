package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonoptions {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9pro",Keys.ENTER);
		// TODO Auto-generated method stub
       WebElement price=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
       
       System.out.println("Price:"+price.getText());
       Thread.sleep(5000);
       WebElement rating=driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
      
       System.out.println(rating.getText());
       driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]")).click();
	   driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
      WebElement total=driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
	
      System.out.println("Total Rupees:"+total.getText());	
	
	}

}
