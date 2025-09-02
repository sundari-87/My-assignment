package week5;

//import java.time.Duration;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeMethod;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

public class TestngAnnotation extends Superclass {
	
	
    @Test
    
    
    //@Parameters({"url","usrname","password"})
    
	public  void basemethod() throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		//ChromeOptions options = new ChromeOptions();

		//options.addArguments("guest");
		
		/*ChromeDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uname));
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("Login")).click();*/
        driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        
       //Thread.sleep(3000);
        
        //WebElement legalen= driver.findElement(By.xpath("//p[text()='Legal Entities']"));//click();
        WebElement ent=driver.findElement(By.xpath("//a[@data-label='Legal Entities']"));
        Actions legal=new Actions(driver);
        legal.scrollToElement(ent);//.perform();
        //legal.pause(500);
       //legal.click();
        legal.perform();
        
       driver.executeScript("arguments[0].click();", ent);
       Thread.sleep(3000);
       
     driver.findElement(By.xpath("//a[@title='New']")).click();
     driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Venu");
     driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf'");
     driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
     
     Thread.sleep(3000);
   //driver.findElement(By.xpath("//button[@id='combobox-button-548']"));
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
       //Thread.sleep(2000);
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       // WebElement dynamicElement = wait.until(
                //ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-label='Legal Entities']")));
        //dynamicElement.click();
        //driver.findElement(By.xpath("//a[@title='Legal Entities']")).click();
        //WebDriverWait entity=(WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(10))
        //.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Legal Entities']")));
        
        
	}

}
