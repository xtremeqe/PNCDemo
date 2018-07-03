package stepdefinition;

import com.pnc.pncdemo.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonBank extends TestBase{
	
	@Given("PBTa The user is on personal home page")
	public void pbta_The_user_is_on_personal_home_page() {
		driver.get(baseURL);
		personHome.clickPerson();
	}

	@Given("PBTa BANKING is present on the menu")
	public void pbta_BANKING_is_present_on_the_menu() {
		boolean result = gm.isElementPresent("//span[text()='Banking']", "xpath");
		System.out.println("Is BANKING link present on menu? " + result);
	}

	@When("PBTa cursor is placed on the BANKING menu and click on Checking link")
	public void pbta_cursor_is_placed_on_the_BANKING_menuand_click_on_Checking_link() throws Exception {
		gm.hoverMenuNClick("xpath", "//span[text()='Banking']", "//a[text()='Checking']");
		gm.waitVisiCondition("//h1[text()='Personal Checking Accounts']", "xpath");
		boolean result = gm.isElementPresent("//h1[text()='Personal Checking Accounts']", "xpath");
		System.out.println("Has the user landed on Personal Checking Accounts? " + result);
		
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PBTa the user lands on Personal Checking Accounts page")
	public void pbta_the_user_lands_on_Personal_Checking_Accounts_page() {
		gm.waitVisiCondition("//h1[text()='Personal Checking Accounts']", "xpath");
		boolean result = gm.isElementPresent("//h1[text()='Personal Checking Accounts']", "xpath");
		System.out.println("Has the user landed on Personal Checking Accounts? " + result);
	}

	@Then("PBTa Find the Right Checking Account button is present")
	public void pbta_Find_the_Right_Checking_Account_button_is_present() {
		gm.waitVisiCondition("//a[text()='Find the Right Checking Account']", "xpath");
		boolean result = gm.isElementPresent("//a[text()='Find the Right Checking Account']", "xpath");
		System.out.println("Is Right Checking Account button present? " + result);
	}

	@When("PBTa the user click on Find Right Checking Account button")
	public void pbta_the_user_click_on_Find_Right_Checking_Account_button() {
		gm.getElement("//a[text()='Find the Right Checking Account']", "xpath").click();
		}

	@Then("PBTa the user lands on questionnaire page")
	public void pbta_the_user_lands_on_questionnaire_page() {
		gm.waitVisiCondition("//h1[text()='Find the Right Checking Account for You']", "xpath");
		boolean result = gm.isElementPresent("//h1[text()='Find the Right Checking Account for You']", "xpath");
		System.out.println("Has the user landed on questionnaire page? " + result);
	}

	@Then("PBTa First question is visible")
	public void pbta_First_question_is_visible() {
		gm.waitVisiCondition("//div[text()='Do you want to pay bills and manage your money online or with your mobile phone?']", "xpath");
		boolean result = gm.isElementPresent("//div[text()='Do you want to pay bills and manage your money online or with your mobile phone?']", "xpath");
		System.out.println("Is the first question visible? " + result);
	}

	@Given("PBTb The user is on personal home page")
	public void pbtb_The_user_is_on_personal_home_page() {
		driver.get(baseURL);
		personHome.clickPerson();
	}

	@Given("PBTb BANKING is present on the menu")
	public void pbtb_BANKING_is_present_on_the_menu() {
		boolean result = gm.isElementPresent("//span[text()='Banking']", "xpath");
		System.out.println("Is BANKING link present on menu? " + result);
	}

	@When("PBTb cursor is placed on the BANKING menu and click on Savings link")
	public void pbtb_cursor_is_placed_on_the_BANKING_menu_and_click_on_Savings_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	

	@Then("PBTb the user lands on PNC savings page")
	public void pbtb_the_user_lands_on_PNC_savings_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PBTb Find the right savings account is present")
	public void pbtb_Find_the_right_savings_account_is_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("PBTc The user is on personal home page")
	public void pbtc_The_user_is_on_personal_home_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("PBTc BANKING is present on the menu")
	public void pbtc_BANKING_is_present_on_the_menu() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("PBTc cursor is placed on the BANKING menu and click on on Credit Card link")
	public void pbtc_cursor_is_placed_on_the_BANKING_menu_and_click_on_on_Credit_Card_link() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("PBTc the user lands on Personal Credit Cards")
	public void pbtc_the_user_lands_on_Personal_Credit_Cards() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PBTc the Compare Our Credit Cards link is present")
	public void pbtc_the_Compare_Our_Credit_Cards_link_is_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("PBTc the user click on Compare Credit Cards")
	public void pbtc_the_user_click_on_Compare_Credit_Cards() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PBTc lands on Compare Credit Cards page")
	public void pbtc_lands_on_Compare_Credit_Cards_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PBTc Apply options are present")
	public void pbtc_Apply_options_are_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}
}
