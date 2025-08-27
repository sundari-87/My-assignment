package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");
		
      ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/login/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.partialLinkText("Contacts" )).click();
		driver.findElement(By.partialLinkText("Merge Contacts" )).click();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		Thread.sleep(2000);
		Set<String> childWindow = driver.getWindowHandles();
		//convert set into list
		List<String> listWindow=new ArrayList<String>(childWindow);
		driver.switchTo().window(listWindow.get(1));
		driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//Thread.sleep(2000);
		driver.switchTo().window(listWindow.get(0));
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		Thread.sleep(2000);
		Set<String> childWindow1 = driver.getWindowHandles();
		//convert set into list
		List<String> listWindow1=new ArrayList<String>(childWindow1);
		driver.switchTo().window(listWindow1.get(1));
		
		driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[2]")).click();
		// TODO Auto-generated method stub
		driver.switchTo().window(listWindow.get(0));
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		//System.out.println("Title of the page is" +driver.getTitle());
	}

}
