package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
		driver.executeScript("arguments[0].click();", element);
		//System.out.println(element.getText());
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-mobile layout-menuitem-icon']")).click();
		WebElement check=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']"));
		System.out.println(check.isDisplayed());
		WebElement position=driver.findElement(By.xpath("(//button[@id='j_idt88:j_idt94']//span)[2]"));
		Point location=position.getLocation();
		System.out.println("Button X Position: " + location.getX());
		System.out.println("Button Y Position: " + location.getY());
       WebElement color=driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
       //color.getcs
       String backgroundcolor=color.getCssValue("background-color");
       System.out.println("Background color of the button: "+backgroundcolor);
       WebElement widthandheight=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']"));
       Dimension size=widthandheight.getSize();
       int x=size.getWidth();
       int y=size.getHeight();
       System.out.println("Button width:"+x);
       System.out.println("Button Height:"+y);
      // driver.wait();
      // driver.close();
       

	}

}
