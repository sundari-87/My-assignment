package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

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
		driver.findElement(By.partialLinkText("Create" )).click();
		driver.findElement(By.className("inputBox")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sundari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murthi");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Engineer");
		WebElement selectDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		WebElement selectDD1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		WebElement selectDD2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		//selectDD.click();
		Select sel=new Select(selectDD);
		Select sel1=new Select(selectDD1);
		Select sel2=new Select(selectDD2);
		sel.selectByIndex(4);	
		sel1.selectByVisibleText("Automobile");
		sel2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		// TODO Auto-generated method stub

	}

}
