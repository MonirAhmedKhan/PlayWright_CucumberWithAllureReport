package stepDefinitions;
import static org.testng.Assert.assertEquals;
import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
public class Login_as_employee  extends Base{

	LandingPage landingPage=new LandingPage();
	LoginPage loginPage=new LoginPage(); 
	HomePage homePage=new HomePage();


	@Given("I am in landing page of MT App")
	public void i_am_in_landing_page_of_mt_app() {
		page.navigate(url);
	}
	@When("I click on the login menu")
	public void i_click_on_the_login_menu() {
		page.locator("//a[@href='elogin.php']").click();  
	}
	

	@When("I Enter the Password as {string}")
	public void i_enter_the_password_as(String Password) {
		page.locator("//input[@name='pwd']").fill(Password);    
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		page.locator("//input[@name='login-submit']").click();
	}
	@Then("I validate the  employee Id")
	public void i_validate_the_employee_id() {
		String employeeId=innerText(homePage.label_greeting);
		System.out.println(employeeId);
		String expectedValue="Employee Id: 102";
		assertEquals(employeeId,expectedValue);
	}

}
