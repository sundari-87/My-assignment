package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeaddefintion extends Baseclass {
	String leadID;
	@When("click the phone link and enter the phone number as <phone number>")
	public void click_the_phone_link_and_enter_the_phone_number_as_phone_number() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@When("click the matched id and store it an variable and click the delete button")
	public void click_the_matched_id_and_store_it_an_variable_and_click_the_delete_button() throws InterruptedException {
		Thread.sleep(2000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();

	}
	@When("click the findleads button")
	public void click_the_findleads_button() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@When("give that id number we stored")
	public void give_that_id_number_we_stored() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);

	}
	@When("click the find leads button again")
	public void click_the_find_leads_button_again() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@Then("check the message displayed.")
	public void check_the_message_displayed() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}	

}
