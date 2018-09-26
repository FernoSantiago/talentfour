package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import interactions.IndexEmailMap;

public class IndexEmailPage extends IndexEmailMap {

	private static WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	public void accessPage() {
		try {
			Assert.assertTrue(isElementPresent(By.id("headingText")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

	}

	public void clickOnNewAcountButton() {
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();

	}

	public void fillInTheFieldName(String fName) {
		firstName.sendKeys(fName);

	}

	public void fillInTheFieldLastName(String lName) {
		lastName.sendKeys(lName);

	}

	public void fillInTheFieldUserName(String uName) {
		username.sendKeys(uName);

	}

	public void fillInTheFieldPassword(String password) {
		Passwd.sendKeys(password);

	}

	public void fillInTheFieldConfirmPass(String nPassword) {
		ConfirmPasswd.sendKeys(nPassword);

	}

	public void clickOnNextButtonModalCreateAcountGoogle() {
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();

	}

	public void fillInTheFieldPhone(String nPhone) {
		phoneNumberId.sendKeys(nPhone);

	}

	public void clickOnNextButtonModalCheckPhone() {
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();

	}

	public void fillInTheFieldVerificationCode(String nCode) {
		code.sendKeys(nCode);

	}

	public void clickOnCheckButtonModalVerification() {
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();

	}

	public void fillInTheFieldDay(String nDay) {
		day.sendKeys(nDay);

	}

	public void selectInTheFieldMonth(String nMonth) {
		Select slc = new Select(month);
		slc.deselectByVisibleText(nMonth);

	}

	public void fillInTheFieldYear(String nYear) {
		year.sendKeys(nYear);

	}

	public void selectInTheFieldGenre(String tpGenre) {
		Select slc = new Select(year);
		slc.deselectByVisibleText(tpGenre);

	}

	public void clickOnNextButtonModalWelcome() {
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();

	}

	public void clickOnYesButton() {
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();

	}

	public void clickOnIAgreeButton() {
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();

	}

	public void confirmMessage() {
		try {
			Assert.assertTrue(isElementPresent(By.name("welcome_dialog_next")));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}

	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}

	}

}
