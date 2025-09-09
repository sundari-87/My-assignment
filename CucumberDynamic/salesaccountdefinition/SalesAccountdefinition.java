package salesaccountdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesAccountdefinition {
	public ChromeDriver  driver=new ChromeDriver();
	public WebDriverWait wait;
	Actions sal;
	String acnamecheck;

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
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement app=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@title='App Launcher']")));
		app.click();	
	}
	@When("click the viewall button")
	public void click_the_viewall_button() throws InterruptedException {
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement allview=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']")));
		allview.click();
	}
	@When("click the sales button")
	public void click_the_sales_button() throws InterruptedException {
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement sales=driver.findElement(By.xpath("//p[text()='Sales']"));
		sal=new Actions(driver);
		sal.scrollToElement(sales);
		sal.click();
		sal.build().perform();		
		driver.executeScript("arguments[0].click();", sales);	
		}
	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[5]")).click();
	}
	@When("Click on New button")
	public void click_on_new_button() {
		WebElement newaccount=driver.findElement(By.xpath("//span[text()='New Account']"));
		driver.executeScript("arguments[0].click();",newaccount);
	}
	@When("Enter your name as (.*)$")
	public void enter_your_name_as_account_name_madhu(String acname) throws InterruptedException {
		acnamecheck=acname;
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(acname);
	}
	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
		WebElement owner=driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		sal.scrollToElement(owner);
		sal.perform();		
		driver.executeScript("arguments[0].click();",owner);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	@Then("Click save and verify Account name")
	public void click_save_and_verify_account_name() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(3000);
		System.out.println(acnamecheck);
		//String text=driver.findElement(By.xpath("//lightning-formatted-text[text()='Selvi']")).getText();
		//System.out.println(text);
	}
}
