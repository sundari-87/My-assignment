package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FaceBook {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ram");
		driver.findElement(By.name("lastname")).sendKeys("Murthi");
		driver.findElement(By.name("reg_email__")).sendKeys("sundari.ulaganathan@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ram@2015");
        
        
        WebElement date=driver.findElement(By.id("day"));
        WebElement month=driver.findElement(By.id("month"));
        WebElement year=driver.findElement(By.id("year"));
        Select selDD=new Select(date);
        selDD.selectByVisibleText("6");
        
        Select selDM=new Select(month);
        selDM.selectByIndex(3);
        
        Select selDY=new Select(year);
        selDY.selectByVisibleText("2015");
        driver.findElement(By.xpath("//input[@value='2']/parent::label")).click();
	}

}
