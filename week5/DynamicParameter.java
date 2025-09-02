package week5;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameter extends Superclass {

	@Test(dataProvider="fetchdata")
	public  void create(String name,String cname) throws InterruptedException {
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        
       //Thread.sleep(3000);
        
        
        WebElement ent=driver.findElement(By.xpath("//a[@data-label='Legal Entities']"));
        Actions legal=new Actions(driver);
        legal.scrollToElement(ent);//.perform();
        //legal.pause(500);
       //legal.click();
        legal.perform();
        
       driver.executeScript("arguments[0].click();", ent);
       Thread.sleep(3000);
       
     driver.findElement(By.xpath("//a[@title='New']")).click();
     //String tex="Venu";
     driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by"+name+"");
     driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(cname);
     driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
     
     Thread.sleep(3000);
   
     WebElement status= driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
    Actions sta=new Actions(driver);
    sta.scrollToElement(status);
   // sta.click();
    sta.perform();
    driver.executeScript("arguments[0].click();", status);
    
    driver.findElement(By.xpath("//span[@title='Active']")).click();
    driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
    
  //div[@data-key="success"]
    Thread.sleep(3000);
    WebElement msg=driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
    String text=msg.getText();
	System.out.println(text);
       
		
	}
	
	@DataProvider(name="fetchdata")
	public String[][] setdata()
	{
		String value[][]=new String[2][2];
		value[0][0]="Miruthula";
		value[0][1]="CTS";
		
		value[1][0]="Senthil";
		value[1][1]="Applied Materials";
		
		return value;
				
	}

}
