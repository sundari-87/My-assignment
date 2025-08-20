package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_v1fjmq1wb_e&adgrpid=1318316049378837&hvadid=82395019826867&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=148859&hvtargid=kwd-82395634386944:loc-90&hydadcr=5623_2377284&mcid=8eb751ba68333a91b5d9ccb93235765f&msclkid=0f23ac517bbb1c2588bcc4f421100bd0");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);



List <WebElement> allLinks = driver.findElements(By.className("a-price-whole"));

//int size = allLinks.size();
//System.out.println(size);

//WebElement name = allLinks.get(5);
//String text = name.getText();
//System.out.println(text);


List<String> list=new ArrayList<String>();
for (WebElement each : allLinks) {
		String text2 = each.getText();
		//String replaceall=text2.replace(",","");
		//int number=ParseInt.replaceall();
		//System.out.println(text2);
		list.add(text2);	
}
System.out.println(list);
}
}
