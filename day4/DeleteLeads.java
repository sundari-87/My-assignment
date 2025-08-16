package week2.day4;

import java.time.Duration;
//import java.util.List;

//import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLeads {

	
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.partialLinkText("Leads" )).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9940167132");
		WebElement findleads=driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findleads.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement dynamicElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.linkText("12864")));
        
        String text=dynamicElement.getText();
        System.out.println("Dynamic content: " + text);
        dynamicElement.click();
        
        driver.findElement(By.partialLinkText("Delete")).click();
        driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.partialLinkText("Name and ID")).click();
		driver.findElement(By.name("id")).sendKeys(text);
		WebElement findleads1=driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findleads1.click();
        
       

	}

}
