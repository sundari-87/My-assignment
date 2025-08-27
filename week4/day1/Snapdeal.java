package week4.day1;

import java.time.Duration;
//import java.util.ArrayList;
import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement men=driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		
		Actions menfas=new Actions(driver);
		menfas.moveToElement(men);
		menfas.build().perform();
		
		//span[text()='Sports Shoes']
WebElement sports=driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		
		Actions sportsshoe=new Actions(driver);
		sportsshoe.moveToElement(sports);
		sportsshoe.pause(500);
		sportsshoe.click();
		sportsshoe.build().perform();
		List <WebElement> count = driver.findElements(By.xpath("//p[@class='product-title']"));
		int c=count.size();
		System.out.println("Count of the shoe is"+c);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
		
		Thread.sleep(2000);
		WebElement color=driver.findElement(By.xpath("//a[contains(text(),'White')]"));
		
		Actions movecolor=new Actions(driver);
		movecolor.scrollToElement(color).perform();
		//movecolor.pause(500);
		driver.executeScript("arguments[0].click();", color);
		Thread.sleep(3000);
		//label[@for='Size_s-10']
      WebElement size=driver.findElement(By.xpath("//label[@for='Size_s-10']"));
		
		Actions movesize=new Actions(driver);
		movesize.scrollToElement(size).perform();
		//movecolor.pause(500);
		driver.executeScript("arguments[0].click();", size);
		
		//label[@for="Brand-JQR"]
		Thread.sleep(5000);
WebElement brand=driver.findElement(By.xpath("//label[@for=\"Brand-JQR\"]"));
		
		Actions brandname=new Actions(driver);
		brandname.scrollToElement(brand).perform();
		//movecolor.pause(500);
		driver.executeScript("arguments[0].click();", brand);
		
		//img[@title='JQR RUMBA Blue Training Shoes']
		
		Thread.sleep(2000);
		
WebElement imag=driver.findElement(By.xpath("//img[@title='JQR RUMBA Blue Training Shoes']"));	

Actions firstimage=new Actions(driver);

firstimage.moveToElement(imag).perform();

driver.findElement(By.xpath("//div[@class='clearfix row-disc']")).click();
Thread.sleep(2000);

WebElement price=driver.findElement(By.xpath("//span[@class='payBlkBig']"));
System.out.println(price.getText());
WebElement discount=driver.findElement(By.xpath("//span[@class='percent-desc ']"));
System.out.println(discount.getText());

driver.close();
//driver.quit();

	}

}
