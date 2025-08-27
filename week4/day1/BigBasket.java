package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:Ramkj6:']")).click();
        Thread.sleep(2000);
		
		WebElement foodgrain=driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions grain=new Actions(driver);
		grain.moveToElement(foodgrain).build().perform();
		
		WebElement rice=driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		Actions ricepro=new Actions(driver);
		ricepro.moveToElement(rice).build().perform();
		
		WebElement boiled=driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		Actions boiledrice=new Actions(driver);
		boiledrice.moveToElement(boiled);
		boiledrice.pause(500);
		boiledrice.click(boiled);
		boiledrice.build().perform();
		
		WebElement scroll=driver.findElement(By.xpath("//input[@id='i-bbRoyal']"));
		Actions bbroyal=new Actions(driver);
		bbroyal.scrollToElement(scroll);
		bbroyal.pause(500);
		bbroyal.click(scroll);
		bbroyal.build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")).click();
		//WebElement tamil=driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"));
		//driver.executeScript("arguments[0].click();", tamil);
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//WebElement element = wait.until(ExpectedConditions.refreshed(
		                     //ExpectedConditions.presenceOfElementLocated(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']"))));
		//element.click();
		//Thread.sleep(2000);
		Set<String> childWindow = driver.getWindowHandles();
		//convert set into list
		List<String> listWindow=new ArrayList<String>(childWindow);
		driver.switchTo().window(listWindow.get(1));
		driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='5 kg']")).click();
		WebElement quantity=driver.findElement(By.xpath("(//div[@class='flex flex-col items-start justify-start w-full p-2.5'])[5]"));
		Actions scrollquantity=new Actions(driver);
		scrollquantity.scrollToElement(quantity).perform();
		driver.executeScript("arguments[0].click();", quantity);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(listWindow.get(0));
		driver.getWindowHandle();
		
		driver.close();		
		
	}

}
