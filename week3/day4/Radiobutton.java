package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("(//div[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default ui-state-active'])[4]")).click();
        driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).click();
        
        Thread.sleep(2000);
         driver.findElement(By.xpath("//label[@for=\"j_idt87:console1:2\"]")).click();
       
        driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']")).click();
        System.out.println("Selected");
        Thread.sleep(2000);
        
       WebElement element= driver.findElement(By.xpath("//label[@for='j_idt87:city2:0']"));
        element.click();
       System.out.println("Unselected: "+element.getText());//table[@id='j_idt87:console2']
       Thread.sleep(2000);
       List<WebElement> browser=driver.findElements(By.xpath("//input[@name='j_idt87:console2']"));
       for (WebElement each1 : browser) 
       {
		if(each1.isSelected())
		{
			System.out.println("The default option is" +each1.getDomAttribute("value"));
			break;
		}
       }
       
      List<WebElement> option=driver.findElements(By.xpath("//input[@name='j_idt87:age']"));
       for (WebElement each : option) 
       {
		if(each.isSelected())
		{
			System.out.println("The default option is" +each.getDomAttribute("value"));
			break;
		}
	}
       
	}

}
