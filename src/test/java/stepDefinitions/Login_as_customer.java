package stepDefinitions;
import static org.testng.Assert.assertEquals;

import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LandingPage;
import pages.LoginPage;

public class Login_as_customer extends Base{
	
	LandingPage landingPage=new LandingPage();
	LoginPage loginPage=new LoginPage(); 
	
	@When("I click customer menu")
	public void i_click_customer_menu() {
		page.locator("//a[@href='clogin.php']").click();
	}
	@When("I click on customer login button")
	public void i_click_on_customer_login_button() {
		page.locator("//*[@id='navli']/li[2]/a").click();
	}
	  
	@And("I Enter the user Id as {string}")
	public void i_enter_the_user_id_as_c_david_gmail_com(String id) {
	 fill(loginPage.text_user_id,id);
	}

	@Then("I validate the  CustomerId")
	public void i_validate_the_customer_id() {
		String actualWelcomeMessage = page.locator("//h2[2]").innerText();
		String expectedWelcomeMessage ="Welcome David";
		assertEquals(actualWelcomeMessage,expectedWelcomeMessage);
	}
}
