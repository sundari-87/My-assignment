package salesforstepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesStep 
{
	public ChromeDriver driver=new ChromeDriver();
	public WebDriverWait wait;
	public Actions ty;
	public String phno1;
	@Given("launch the browser successfully")
	public void launch_the_browser_successfully() {
		
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
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
		driver.findElement(By.id("Login")).click();
	}
	@When("click the applauncher icon")
	public void click_the_applauncher_icon() throws InterruptedException {
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
	    
	}
	@When("click the viewall button")
	public void click_the_viewall_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@When("Scroll to element accounts and click that")
	public void scroll_to_element_accounts_and_click_that() {
	    WebElement ent=driver.findElement(By.xpath("//p[text()='Accounts']"));
	    Actions legal=new Actions(driver);
	    legal.scrollToElement(ent);
	    
	    legal.perform();
	    driver.executeScript("arguments[0].click();", ent);
	}
	@When("Search list enter the name and click that name")
	public void search_list_enter_the_name_and_click_that_name() {
		driver.findElement(By.xpath("//input[@aria-label='Search this list...']")).sendKeys("Ram",Keys.ENTER);
		wait=new WebDriverWait(driver,Duration.ofSeconds(100));
		WebElement name=driver.findElement(By.xpath("(//span[text()='Ram'])[1]"));
		name.click();
	}
	@When("click the dropdown button near the name and select edit option")
	public void click_the_dropdown_button_near_the_name_and_select_edit_option() {
		WebElement edit=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Show more actions'])/ancestor::button")));
		edit.click();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
	}
	@When("Give the phonenumber as {string}")
	public void give_the_phonenumber_as(String phno) throws InterruptedException {
		phno1=phno;
		Thread.sleep(3000);
		WebElement phone=driver.findElement(By.xpath("//input[@name='Phone']"));
		phone.clear();
		phone.sendKeys(phno);

	}
	@When("Set type to technology partner and set industry to healthcare")
	public void set_type_to_technology_partner_and_set_industry_to_healthcare() {
		WebElement type=driver.findElement(By.xpath("(//span[@part='input-button-value']/parent::button)[2]"));
		 ty=new Actions(driver);
		ty.scrollToElement(type);		
		ty.perform();
		driver.executeScript("arguments[0].click();", type);
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
		driver.findElement(By.xpath("(//span[@part='input-button-value']/parent::button)[4]")).click();
		WebElement health=driver.findElement(By.xpath("//span[text()='Healthcare']"));
		ty.scrollToElement(health);
		ty.perform();
		driver.executeScript("arguments[0].click();", health);
	}
	@When("Enter the billing address as {string}")
	public void enter_the_billing_address_as(String stname) {
		WebElement street=driver.findElement(By.xpath("//textarea[@name='street']"));
		street.clear();
		street.sendKeys(stname);
		
	}
	@When("Enter the Shipping address as {string}")
	public void enter_the_shipping_address_as(String shad) {
		WebElement ship=driver.findElement(By.xpath("(//textarea[@name='street'])[2]"));
		ship.clear();
		ship.sendKeys(shad);
	}
	@When("Set customer priority as low and Set SLA to Silver")
	public void set_customer_priority_as_low_and_set_sla_to_silver() {
	    WebElement priority=driver.findElement(By.xpath("//button[@aria-label='Customer Priority']"));
	    ty.scrollToElement(priority);  
	  ty.perform();
	  driver.executeScript("arguments[0].click();",priority);
	  driver.findElement(By.xpath("//span[text()='Low']")).click();

	  driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
	  driver.findElement(By.xpath("//span[@title='Silver']")).click();
	}
	@When("Set Active to NO and Upsell Opportunity to No")
	public void set_active_to_no_and_upsell_opportunity_to_no() throws InterruptedException {
		Thread.sleep(3000);
		WebElement active=driver.findElement(By.xpath("//button[@aria-label='Active']"));
		ty.scrollToElement(active);
		ty.perform();

		driver.executeScript("arguments[0].click();",active);
		driver.findElement(By.xpath("//span[@title='No']")).click();

		driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']")).click();
		driver.findElement(By.xpath("//span[@title='No']")).click();
	}
	@When("click save")
	public void click_save() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	@Then("Verify the phonenumber")
	public void verify_the_phonenumber() {
		String text=driver.findElement(By.xpath("//a[text()='9940167129']")).getText();
		System.out.println(text);
		if(phno1.equals(text))
			System.out.println("The phonenumber matched");
		else
			System.out.println("The phone number not matched");
	    
	}
}
