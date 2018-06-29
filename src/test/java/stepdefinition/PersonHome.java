package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PersonHome {
	protected WebDriver driver;
	protected String baseURL;

	@Before
	public void before() {
		driver = new ChromeDriver();
		baseURL = "https://www.pnc.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Given("PHTa The user is on personal home page")
	public void phta_The_user_is_on_personal_home_page() {
		driver.get(baseURL);
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("PHTa checking link is present")
	public void phta_checking_link_is_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("PHTa click on Checking link")
	public void phta_click_on_Checking_link() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTa the user lands on Personal Checking Accounts page")
	public void phta_the_user_lands_on_Personal_Checking_Accounts_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTa Find the Right Checking Account button is present")
	public void phta_Find_the_Right_Checking_Account_button_is_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("PHTa the user click on Right Checking Account button")
	public void phta_the_user_click_on_Right_Checking_Account_button() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTa the user lands on questionnaire page")
	public void phta_the_user_lands_on_questionnaire_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTa First question is visible")
	public void phta_First_question_is_visible() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("PHTb The user is on personal home page")
	public void phtb_The_user_is_on_personal_home_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("PHTb credit cards link is present")
	public void phtb_credit_cards_link_is_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("PHTb the user click on crdit cards link")
	public void phtb_the_user_click_on_crdit_cards_link() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTb the user lands on Personal Credit Cards")
	public void phtb_the_user_lands_on_Personal_Credit_Cards() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTb the Compare Our Credit Cards link is present")
	public void phtb_the_Compare_Our_Credit_Cards_link_is_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("PHTb the user click on Compare Credit Cards")
	public void phtb_the_user_click_on_Compare_Credit_Cards() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTb lands on Compare Credit Cards page")
	public void phtb_lands_on_Compare_Credit_Cards_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTb Apply options are present")
	public void phtb_Apply_options_are_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("PHTc The user is on personal home page")
	public void phtc_The_user_is_on_personal_home_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Given("PHTc Saving link is present")
	public void phtc_Saving_link_is_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@When("PHTc the user click on Savings link")
	public void phtc_the_user_click_on_Savings_link() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTc the user lands on PNC savings page")
	public void phtc_the_user_lands_on_PNC_savings_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
	}

	@Then("PHTc Find the right savings account is present")
	public void phtc_Find_the_right_savings_account_is_present() {
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();

	}

	@After
	public void after() {
		System.out.println("Driver going to quit");
		driver.quit();
	}

}

//refer https://automationrhapsody.com/introduction-to-cucumber-and-bdd-with-examples/