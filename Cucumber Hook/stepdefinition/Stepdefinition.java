package stepdefinition;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclass{

	 
	//@Given("launch the browser successfully")
	
	
	/*public void launch_the_browser_successfully() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}*/
	@When("Enter the username as {string}")
	public void enter_the_username_as(String uname) {
	    driver.findElement(By.id("username")).sendKeys(uname);
	}
	@When("Enter the password as {string}")
	public void enter_the_password_as(String pwd) {
	    driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("click on the login button")
	public void click_on_the_login_button() {
	    driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Display the message the page loaded as successfully")
	public void display_the_message_the_page_loaded_as_successfully() {
		
		String text=driver.getTitle();
		if(text.contains("Leaf"))
		{
			System.out.println("The title of the page displayed"+text);
		}
		else
		{
			System.out.println("The page not displayed.");
		}				
	    
	}
	@Then("Error message displayed")
	public void error_message_displayed() {
		
		String text1=driver.findElement(By.xpath("//div[@id='errorDiv']")).getText();
	    if(text1.contains("Error"))
	    {
	    	System.out.println("Error message displayed"+text1);
	    }
	    else
	    	System.out.println("error not dispalyed");
	}


}
