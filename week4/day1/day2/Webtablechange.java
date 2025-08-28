package week4.day2;

import java.time.Duration;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablechange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement fromel=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));//sendKeys("MAS",Keys.ENTER);
		fromel.clear();
		fromel.sendKeys("MAS",Keys.ENTER);
		WebElement toel=driver.findElement(By.xpath("//input[@id='txtStationTo']"));//sendKeys("MAS",Keys.ENTER);
		toel.clear();
		toel.sendKeys("MDU",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		//WebElement table = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']"));
		
		List<WebElement> colsize = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/th"));
		//input[@id='txtStationTo']
		System.out.println(colsize.size());
		
      List<WebElement> rowsize = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
      System.out.println(rowsize.size());
      
      for (WebElement webElement : rowsize) {
    	  System.out.println(webElement.getText());

	}
    // String text=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr[3]/td[19]")).getText();
    //System.out.println(text);
     
      /*for (int i = 2; i < rowsize.size(); i++) {
			driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td"));
			
			for (int j = 1; j < colsize.size(); j++) {
				WebElement datas = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(datas.getText());
			}
			
		}*/
     
     Set<String> duplicatetrainnames = new HashSet<>();
      for (int i = 2; i < rowsize.size(); i++) {
    	  WebElement trname=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[3]"));
			String trainname=trname.getText().trim();
			for (int j = i; j < rowsize.size(); j++) {
				if(i==j)
					continue;
				else
				{
				WebElement anname = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+j+"]/td[3]"));
                String anothername=anname.getText().trim();
				if(trainname.equalsIgnoreCase(anothername))
				{
					duplicatetrainnames.add(anothername);
				
				}
				}
			}
			
		}
      if(duplicatetrainnames.isEmpty())
    	  System.out.println("Duplicate train names are not found");
      //System.out.println("duplicate  train names are");
      else
      {
    	  System.out.println("duplicate  train names are");
    	  for(String each:duplicatetrainnames)
    		  System.out.println(each);
      }
      
	}


	}

