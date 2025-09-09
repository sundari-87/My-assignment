package hooksImplementation;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepdefinition.Baseclass;

public class Hooks extends Baseclass {
	
	@Before
	public void preCondn() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@After
	public void postCondn() {
		driver.close();
		
	}

}
