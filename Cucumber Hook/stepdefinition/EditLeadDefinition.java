package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadDefinition extends Baseclass{
	public WebDriverWait wait;
	@When("click on findleads link")
	public void click_on_findleads_link() {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("click the phone link and enter the phone number as {int}")
	public void click_the_phone_link_and_enter_the_phone_number_as(Integer int1) {
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		String value=int1.toString();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(value);
	}

	
	@When("click the findleads")
	public void click_the_findleads() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement find=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Find Leads']")));
		find.click();

	}
	@When("click the edit button and update companyname as (.*)$")
	public void click_the_edit_button_and_update_companyname(String cname) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		/*wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		WebElement updated=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")));
		updated.click();*/

		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);

	}
	@When("click the edit button")
	public void click_the_edit_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Viewpage is displayed")
	public void viewpage_is_displayed() {
	    System.out.println(driver.getTitle());
	}

}
