package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.className("desktop-searchBar")).sendKeys("bags",Keys.ENTER);
	
		driver.findElement(By.xpath("//input[@type='radio']/parent::label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Laptop Bag']/parent::label)[1]")).click();
		Thread.sleep(2000);
		List<WebElement> bags=driver.findElements(By.xpath("//h4[@class='product-product']"));
		List<WebElement> bagname=driver.findElements(By.xpath("//h3[@class='product-brand']"));
		int size = bags.size();
		System.out.println(size);
		
		WebElement name = bags.get(3);
		String brandname = name.getText();
		System.out.println(brandname);
		
		WebElement name1=bagname.get(5);
		String nameofbag=name1.getText();
		System.out.println(nameofbag);
		
		List<String> productlist=new ArrayList<String>();
		for (WebElement each : bags) {
				String productname= each.getText();
				
				productlist.add(productname);	
		}
    System.out.println(productlist);
    List<String> productname=new ArrayList<String>();
	for (WebElement each : bagname) {
			String productname1= each.getText();
			
			productname.add(productname1);	
	}
System.out.println(productname);
    
	}

}
