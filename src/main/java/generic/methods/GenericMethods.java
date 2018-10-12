package generic.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericMethods {
	WebDriver driver;

	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}

	// locate element to execute action
	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found with id: " + locator);
			return this.driver.findElement(By.id(locator));
		} else if (type.equals("name")) {
			System.out.println("Element found with name: " + locator);
			return this.driver.findElement(By.name(locator));
		} else if (type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			return this.driver.findElement(By.xpath(locator));
		} else if (type.equals("css")) {
			System.out.println("Element found with css: " + locator);
			return this.driver.findElement(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			System.out.println("Element found with classname: " + locator);
			return this.driver.findElement(By.className(locator));
		} else if (type.equals("tagname")) {
			System.out.println("Element found with tagname: " + locator);
			return this.driver.findElement(By.tagName(locator));
		} else if (type.equals("linktext")) {
			System.out.println("Element found with link text: " + locator);
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			System.out.println("Element found with partial link text: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else {
			System.out.println("Locator type not supported");
			return null;
		}
	}

	public List<WebElement> getElementList(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> elementList = new ArrayList<WebElement>();
		if (type.equals("id")) {
			elementList = this.driver.findElements(By.id(locator));
		} else if (type.equals("name")) {
			elementList = this.driver.findElements(By.name(locator));
		} else if (type.equals("xpath")) {
			elementList = this.driver.findElements(By.xpath(locator));
		} else if (type.equals("css")) {
			elementList = this.driver.findElements(By.cssSelector(locator));
		} else if (type.equals("classname")) {
			elementList = this.driver.findElements(By.className(locator));
		} else if (type.equals("tagname")) {
			elementList = this.driver.findElements(By.tagName(locator));
		} else if (type.equals("linktext")) {
			elementList = this.driver.findElements(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			elementList = this.driver.findElements(By.partialLinkText(locator));
		} else {
			System.out.println("Locator type not supported");
		}
		if (elementList.isEmpty()) {
			System.out.println("Element not found with " + type + ": " + locator);

		} else {
			System.out.println("Element found with " + type + ": " + locator);
		}
		return elementList;
	}

	// Element present true false
	public boolean isElementPresent(String locator, String type) {
		List<WebElement> elementList = getElementList(locator, type);

		int size = elementList.size();

		if (size > 0) {
			return true;
		} else {
			return false;
		}
	}

	// Find xpath elements with 'textarea', 'input'
	public WebElement getXpathElements(String XPlocator, String XPtype) {
		XPtype = XPtype.toLowerCase();
		if (XPtype.equals("textarea")) {
			System.out.println("Element found with textarea: " + XPlocator);
			return this.driver.findElement(By.xpath(XPlocator));

		}

		else if (XPtype.equals("input")) {
			System.out.println("Element found with input: " + XPlocator);
			return this.driver.findElement(By.xpath(XPlocator));
		}

		// add more locator types here

		else
			System.out.println("Locator type not supported");
		return null;
	}

	// Conditional wait
	public WebElement waitVisiCondition(String locator, String type) {
		type = type.toLowerCase();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		if (type.equals("id")) {
			System.out.println("Element found with id: " + locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
			return null;
		} else if (type.equals("name")) {
			System.out.println("Element found with name: " + locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
			return null;
		} else if (type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
			return null;
		} else if (type.equals("css")) {
			System.out.println("Element found with css: " + locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
			return null;
		} else if (type.equals("classname")) {
			System.out.println("Element found with classname: " + locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
			return null;
		} else if (type.equals("tagname")) {
			System.out.println("Element found with tagname: " + locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(locator)));
			return null;
		} else if (type.equals("linktext")) {
			System.out.println("Element found with link text: " + locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locator)));
			return null;
		} else if (type.equals("partiallinktext")) {
			System.out.println("Element found with partial link text: " + locator);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(locator)));
			return null;
		} else {
			System.out.println("Locator type not supported");
			return null;
		}
	}

	// Select Element from dropdown
	public WebElement dropDownElement(String locator, String type, String value) {
		type = type.toLowerCase();

		if (type.equals("id")) {
			WebElement element = driver.findElement(By.id(locator));
			Select sel = new Select(element);
			sel.selectByVisibleText(value);

		} else if (type.equals("name")) {
			WebElement element = driver.findElement(By.name(locator));
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		} else if (type.equals("xpath")) {
			WebElement element = driver.findElement(By.xpath(locator));
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		} else if (type.equals("css")) {
			WebElement element = driver.findElement(By.cssSelector(locator));
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		} else if (type.equals("classname")) {
			WebElement element = driver.findElement(By.className(locator));
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		} else if (type.equals("tagname")) {
			WebElement element = driver.findElement(By.tagName(locator));
			Select sel = new Select(element);
			sel.selectByVisibleText(value);
		} else if (type.equals("linktext")) {
			System.out.println("Element found with link text: " + locator);
			return this.driver.findElement(By.linkText(locator));
		} else if (type.equals("partiallinktext")) {
			System.out.println("Element found with partial link text: " + locator);
			return this.driver.findElement(By.partialLinkText(locator));
		} else {
			System.out.println("Locator type not supported");
			// return null;
		}
		return null;
	}

	// Mouse Hover
	public WebElement hoverMenuNClick(String type, String mainLocator, String subLocator) throws InterruptedException {
		type = type.toLowerCase();
		Actions action = new Actions(driver);

		if (type.equals("id")) {
			WebElement mainElement = driver.findElement(By.id(mainLocator));
			action.moveToElement(mainElement).perform();
			Thread.sleep(2000);
			WebElement subElement = driver.findElement(By.id(subLocator));
			subElement.click();
		} else if (type.equals("xpath")) {
			WebElement mainElement = driver.findElement(By.xpath(mainLocator));
			action.moveToElement(mainElement).perform();
			Thread.sleep(2000);
			WebElement subElement = driver.findElement(By.xpath(subLocator));
			subElement.click();
		} else if (type.equals("css")) {
			WebElement mainElement = driver.findElement(By.cssSelector(mainLocator));
			action.moveToElement(mainElement).perform();
			Thread.sleep(2000);
			WebElement subElement = driver.findElement(By.cssSelector(subLocator));
			subElement.click();
		}
		return null;
	}

	// Drag and Drop
	public WebElement dragNDrop(String type, String draggable, String droppable) throws InterruptedException {
		type = type.toLowerCase();
		Actions action = new Actions(driver);
		if (type.equals("id")) {
			WebElement fromElement = driver.findElement(By.id(draggable));
			WebElement toElement = driver.findElement(By.id(droppable));
			// Drag and drop
			action.dragAndDrop(fromElement, toElement).build().perform();
			// Click and hold, move to element, release, build and perform
			// action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();
		} else if (type.equals("xpath")) {
			WebElement fromElement = driver.findElement(By.xpath(draggable));
			WebElement toElement = driver.findElement(By.xpath(droppable));
			// Drag and drop
			action.dragAndDrop(fromElement, toElement).build().perform();
		}
		return null;
	}

	// Slide
	public WebElement slideAction(String type, String sliderLocator) throws InterruptedException {
		type = type.toLowerCase();
		Actions action = new Actions(driver);
		if (type.equals("id")) {
			WebElement element = driver.findElement(By.id(sliderLocator));
			action.dragAndDropBy(element, 100, 0).perform();
		} else if (type.equals("xpath")) {
			WebElement element = driver.findElement(By.xpath(sliderLocator));
			action.dragAndDropBy(element, 100, 0).perform();
		}
		return null;
	}
}