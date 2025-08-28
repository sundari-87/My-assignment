package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://finance.yahoo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement crypto=driver.findElement(By.xpath("//span[text()='Markets']"));
		
		Actions move=new Actions(driver);
		
		move.moveToElement(crypto);
		
		move.perform();
		
		Thread.sleep(5000);
		
		WebElement scrollcryp=driver.findElement(By.xpath("(//div[text()='Crypto'])[2]"));
         Actions scroll=new Actions(driver);
		
		scroll.scrollToElement(scrollcryp);
		driver.executeScript("arguments[0].click();", scrollcryp);
		
		List<WebElement> rowsize=driver.findElements(By.xpath("//table[@class='yf-7uw1qi bd']/tbody/tr"));
		System.out.println(rowsize.size());
		List<WebElement> colsize=driver.findElements(By.xpath("//table[@class='yf-7uw1qi bd']/thead/tr/th"));
		System.out.println(colsize.size());
		System.out.println("Currency name are");
		for(int i=1;i<rowsize.size();i++)
		{
			String name=driver.findElement(By.xpath("//table[@class='yf-7uw1qi bd']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name);
		}
		//for(
		//scroll.pause(500);
		
		//scroll.click();
		//scroll.build().perform();
	}

}
