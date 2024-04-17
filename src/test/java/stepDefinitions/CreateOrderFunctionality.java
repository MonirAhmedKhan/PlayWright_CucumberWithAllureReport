package stepDefinitions;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOrderFunctionality extends Base{
	@When("I click on Customer Login menu")
	public void i_click_on_customer_login_menu() {
		click("//a[@href='clogin.php']");   
	}
	@Then("Click Product Order Menu")
	public void click_product_order_menu() {
		page.locator("//*[@id='navli']/li[3]/a").click();   
	}
	@Then("Select Camera")
	public void select_camera() {
		page.selectOption("//select[@name='prodId']", "Camera"); 
	}
	@Then("Enter Order date")
	public void enter_order_date() {
		page.locator("//input[@name='ordDate']").fill("11/21/2023");  
	}
	@Then("Click submit menu")
	public void click_submit_menu() {
		page.locator("//button[@type='submit']").click();
	}
}
