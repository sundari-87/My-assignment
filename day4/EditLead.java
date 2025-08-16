package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.partialLinkText("Create" )).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Murthi");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raman");
     driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Palani");
   driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
   WebElement clean=driver.findElement(By.id("createLeadForm_description"));
	clean.sendKeys("Selenium Automation Engineer");
   driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Engineer");
   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Murthi.raman83@gmail.com");
   WebElement selDD=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
   
   Select ss=new Select(selDD);
   ss.selectByVisibleText("New York");
   driver.findElement(By.className("smallSubmit")).click();
   driver.findElement(By.linkText("Edit")).click();
   WebElement clean1=driver.findElement(By.id("updateLeadForm_description"));
   clean1.clear();
   clean1.sendKeys("Selenium Learner");
   driver.findElement(By.className("smallSubmit")).click();
   String title=driver.getTitle();
   System.out.println(title);

   
   
   
	}

}
