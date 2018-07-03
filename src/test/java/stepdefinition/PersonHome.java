package stepdefinition;

import com.pnc.pncdemo.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonHome extends TestBase{
	
	@Given("PHTa The user is on personal home page")
	public void phta_The_user_is_on_personal_home_page() throws Exception {
		driver.get(baseURL);
		personHome.clickPerson();
	}

	@Given("PHTa checking link is present")
	public void phta_checking_link_is_present() throws Exception {
//		scrolling the window to get the element
		javaRepos.scroll2view("//p[text()='Checking']", "window.scrollBy(0, 700);");
		boolean result = gm.isElementPresent("//p[text()='Checking']", "xpath");
		System.out.println("Is Checking link present? " + result);
	}

	@When("PHTa click on Checking link")
	public void phta_click_on_Checking_link() {
		personHome.clickChecking();
		
		
	}

	@Then("PHTa the user lands on Personal Checking Accounts page")
	public void phta_the_user_lands_on_Personal_Checking_Accounts_page() {
		gm.waitVisiCondition("//h1[text()='Personal Checking Accounts']", "xpath");
		boolean result = gm.isElementPresent("//h1[text()='Personal Checking Accounts']", "xpath");
		System.out.println("Has the user landed on Personal Checking Accounts? " + result);
	}

	@Then("PHTa Find the Right Checking Account button is present")
	public void phta_Find_the_Right_Checking_Account_button_is_present() {
		gm.waitVisiCondition("//a[text()='Find the Right Checking Account']", "xpath");
		boolean result = gm.isElementPresent("//a[text()='Find the Right Checking Account']", "xpath");
		System.out.println("Is Right Checking Account button present? " + result);
	}

	@When("PHTa the user click on Right Checking Account button")
	public void phta_the_user_click_on_Right_Checking_Account_button() {
		gm.getElement("//a[text()='Find the Right Checking Account']", "xpath").click();
	}

	@Then("PHTa the user lands on questionnaire page")
	public void phta_the_user_lands_on_questionnaire_page() {
		gm.waitVisiCondition("//h1[text()='Find the Right Checking Account for You']", "xpath");
		boolean result = gm.isElementPresent("//h1[text()='Find the Right Checking Account for You']", "xpath");
		System.out.println("Has the user landed on questionnaire page? " + result);
	}

	@Then("PHTa First question is visible")
	public void phta_First_question_is_visible() {
		gm.waitVisiCondition("//div[text()='Do you want to pay bills and manage your money online or with your mobile phone?']", "xpath");
		boolean result = gm.isElementPresent("//div[text()='Do you want to pay bills and manage your money online or with your mobile phone?']", "xpath");
		System.out.println("Is the first question visible? " + result);
	}

	@Given("PHTb The user is on personal home page")
	public void phtb_The_user_is_on_personal_home_page() {
		driver.get(baseURL);
		personHome.clickPerson();
	}

	@Given("PHTb credit cards link is present")
	public void phtb_credit_cards_link_is_present() {
		javaRepos.scroll2view("//p[text()='Checking']", "window.scrollBy(0, 700);");
		boolean result = gm.isElementPresent("//p[text()='Credit Cards']", "xpath");
		System.out.println("Is Credit Cards link present? " + result);
	}

	@When("PHTb the user click on crdit cards link")
	public void phtb_the_user_click_on_crdit_cards_link() {
		gm.waitVisiCondition("//p[text()='Credit Cards']", "xpath");
		personHome.clickCredCard();
	}

	@Then("PHTb the user lands on Personal Credit Cards")
	public void phtb_the_user_lands_on_Personal_Credit_Cards() {
		gm.waitVisiCondition("//h1[text()='Personal Credit Cards']", "xpath");
		boolean result = gm.isElementPresent("//h1[text()='Personal Credit Cards']", "xpath");
		System.out.println("Has the user landed on Personal Credit Cards Page? " + result);
	}

	@Then("PHTb the Compare Our Credit Cards link is present")
	public void phtb_the_Compare_Our_Credit_Cards_link_is_present() {
		gm.waitVisiCondition("//a[text()='Compare Our Credit Cards']", "xpath");
		boolean result = gm.isElementPresent("//a[text()='Compare Our Credit Cards']", "xpath");
		System.out.println("Is Compare Our Credit Cards button present? " + result);
	}

	@When("PHTb the user click on Compare Credit Cards")
	public void phtb_the_user_click_on_Compare_Credit_Cards() {
		gm.getElement("//a[text()='Compare Our Credit Cards']", "xpath").click();
	}

	@Then("PHTb lands on Compare Credit Cards page")
	public void phtb_lands_on_Compare_Credit_Cards_page() {
		gm.waitVisiCondition("//p[text()='GET CASH BACK']", "xpath");
		boolean result = gm.isElementPresent("//p[text()='GET CASH BACK']", "xpath");
		System.out.println("Has the user landed on Compare Credit Cards page? " + result);
		System.out.println("Has the user landed on Compare Credit Cards page? " + result);
	}

	@Then("PHTb Apply for Get Cash Back card is present")
	public void phtb_Apply_for_Get_Cash_Back_card_is_present() {
		boolean result = gm.isElementPresent("//p[text()='SAVE WITH LOWER RATES']", "xpath");
		System.out.println("Is Apply for SAVE WITH LOWER RATES card option present? " + result);
	    
	}

	@Then("PHTb Apply for SAVE WITH LOWER RATES card is present")
	public void phtb_Apply_for_SAVE_WITH_LOWER_RATES_card_is_present() {
		boolean result = gm.isElementPresent("//p[text()='EARN POINTS FOR REWARDS']", "xpath");
		System.out.println("Is Apply for EARN POINTS FOR REWARDS card option present? " + result);
	   
	}

	@Then("PHTb Apply for EARN POINTS FOR REWARDS card is present")
	public void phtb_Apply_for_EARN_POINTS_FOR_REWARDS_card_is_present() {
		boolean result = gm.isElementPresent("//p[text()='EARN POINTS FOR REWARDS']", "xpath");
		System.out.println("Is Apply for EARN POINTS FOR REWARDS card option present? " + result);
	    
	}

	@Then("PHTb Apply for EARN MILES, PERKS, REWARDS card is present")
	public void phtb_Apply_for_EARN_MILES_PERKS_REWARDS_card_is_present() {
		boolean result = gm.isElementPresent("//p[text()='EARN MILES, PERKS, REWARDS']", "xpath");
		System.out.println("Is Apply for EARN MILES, PERKS, REWARDS card option present? " + result);
	    
	}
	
	
	@Given("PHTc The user is on personal home page")
	public void phtc_The_user_is_on_personal_home_page() {
		driver.get(baseURL);
		personHome.clickPerson();
	}

	@Given("PHTc Saving link is present")
	public void phtc_Saving_link_is_present() {
		gm.waitVisiCondition("//p[text()='Savings']", "xpath");
		boolean result = gm.isElementPresent("//p[text()='Savings']", "xpath");
		System.out.println("Is Saving link present? " + result);
	    
	}

	@When("PHTc the user click on Savings link")
	public void phtc_the_user_click_on_Savings_link() {
		personHome.clicSavings();
	}

	@Then("PHTc the user lands on PNC savings page")
	public void phtc_the_user_lands_on_PNC_savings_page() {
		gm.waitVisiCondition("//h1[text()='PNC Savings']", "xpath");
		boolean result = gm.isElementPresent("//h1[text()='PNC Savings']", "xpath");
		System.out.println("Has the user landed on Savings page? " + result);
	}

	@Then("PHTc Find the right savings account is present")
	public void phtc_Find_the_right_savings_account_is_present() {
		boolean result = gm.isElementPresent("//a[text()='Find the Right Savings Account']", "xpath");
		System.out.println("Is Find the right savings account present? " + result);
		

	}
	
	

}
