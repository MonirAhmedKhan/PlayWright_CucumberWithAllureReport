package pages;

import base.Base;

public class LoginPage extends Base {
	
	static LandingPage landingPage=new LandingPage();
	static LoginPage loginPage=new LoginPage();
	
	public final String menu_customer_login = "//a[@href='clogin.php']";
	public final String text_user_id = "//input[@name='mailuid']";
	public final String text_password = "//input[@name='pwd']";
	public final String button_login = "//input[@name='login-submit']";
	
	//common Actions
	public final void loginAsCustomer() {
		click(landingPage.menu_login); //Landing page Login menu
		click(loginPage.menu_customer_login); //Login Page
		fill(loginPage.text_user_id, "david@gmail.com"); //Login Page
		fill(loginPage.text_password, "1234"); //Login Page
		click(loginPage.button_login); //Login Page
	}
	
	

	
}
