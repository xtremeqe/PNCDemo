package page.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonHomeRepos {
	WebDriver driver;

	@FindBy(xpath = "//span[text()='Personal']")
	WebElement tbPersonal;

	@FindBy(xpath = "//p[text()='Checking']")
	WebElement lnkChecking;

	@FindBy(xpath = "//p[text()='Credit Cards']")
	WebElement lnkCreditCards;

	@FindBy(xpath = "//p[text()='Savings']")
	WebElement lnkSavings;

	@FindBy(xpath = "//span[text()='Banking']")
	WebElement menuBanking;

	public PersonHomeRepos(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickPerson() {
		tbPersonal.click();
	}

	public void clickChecking() {
		lnkChecking.click();
	}

	public void clickCredCard() {
		lnkCreditCards.click();
	}

	public void clicSavings() {
		lnkSavings.click();
	}
}
