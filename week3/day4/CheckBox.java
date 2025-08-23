package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement dynamicElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-toggleswitch-slider']")));
        dynamicElement.click();
        
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(2000);
		//WebElement select=driver.findElement(By.xpath(("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")));
		WebElement select=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		System.out.println("The Option is enabled" +select.isSelected());
		
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-icon ui-icon ui-icon-blank']/parent::div)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
	
	}

}
