package stepdefinition;

import org.openqa.selenium.By;

//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepdefinition extends Baseclass{
	@When("click on crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click(); 
	}
	@When("click on leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("click on createleads link")
	public void click_on_createleads_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("enter the company name as (.*)$")
	public void enter_the_company_name_as_tcs(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	@When("enter the firstname as (.*)$")
	public void enter_the_firstname_as_sundari(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@When("enter the lastname as(.*)$")
	public void enter_the_lastname_as_m(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	    
	}
	@When("click on createLead")
	public void click_on_create_lead() {
		driver.findElement(By.name("submitButton")).click();
	    
	}
	@Then("viewleadspage is displayed")
	public void viewleadspage_is_displayed() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text.contains("sundari")) {
			System.out.println("text matched");
			
		} else {
			System.out.println("text not matched");

		}
	}
	
}
