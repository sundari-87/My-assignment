package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountDropdown {

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
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("accountName")).sendKeys("Miruthula");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("1");
		
		WebElement selDD=driver.findElement(By.name("industryEnumId"));
		WebElement selDD1=driver.findElement(By.name("ownershipEnumId"));
		WebElement selDD2=driver.findElement(By.id("dataSourceId"));
		WebElement selDD3=driver.findElement(By.id("marketingCampaignId"));
		WebElement selDD4=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select ss=new Select(selDD);
		ss.selectByIndex(3);
		Select ss1=new Select(selDD1);
		ss1.selectByVisibleText("S-Corporation");
		Select ss2=new Select(selDD2);
		ss2.selectByValue("LEAD_EMPLOYEE");
		Select ss3=new Select(selDD3);
		ss3.selectByIndex(6);
		Select ss4=new Select(selDD4);
		ss4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
	}

}
