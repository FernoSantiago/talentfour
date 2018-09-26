package feature.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomeLtdPage;

@CucumberOptions(features = "feature", glue = { "StepDefinition" })

public class HomeLtdSteps {

	@Given("^I have access in the page$")
	public void accessPage() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.accessPage();
		
	}

	@And("^I click on new acount button$")
	public void clickOnNewAcountButton() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.clickOnNewAcountButton();
	}

	@And("^I fill in the name field with \"([^\"]*)\"$")
	public void fillInTheFieldName(String name) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldName(name);

	}

	@And("^I fill in the last name field with \"([^\"]*)\"$")
	public void fillInTheFieldLastName(String lastName) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldLastName(lastName);

	}

	@And("^I fill in the user name field with \"([^\"]*)\"$")
	public void fillInTheFieldUserName(String userName) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldUserName(userName);

	}

	@And("^I fill in the password field with \"([^\"]*)\"$")
	public void fillInTheFieldPassword(String passwd) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldPassword(passwd);

	}

	@And("^I fill in the confirm password field with \"([^\"]*)\"$")
	public void fillInTheFieldConfirmPass(String confirmPasswd) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldConfirmPass(confirmPasswd);

	}

	@And("^I click on next button at modal create acount google$")
	public void clickOnNextButtonModalCreateAcountGoogle() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.clickOnNextButtonModalCreateAcountGoogle();

	}

	@And("^I fill in the phone field with \"([^\"]*)\"$")
	public void fillInTheFieldPhone(String phone) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldPhone(phone);

	}

	@And("^I click on next button at modal check phone$")
	public void clickOnNextButtonModalCheckPhone() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.clickOnNextButtonModalCheckPhone();

	}

	@And("^I fill in the verification code field with \"([^\"]*)\"$")
	public void fillInTheFieldVerificationCode(String code) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldVerificationCode(code);

	}

	@And("^I click on check button at motal of verification$")
	public void clickOnCheckButtonModalVerification() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.clickOnCheckButtonModalVerification();

	}

	@And("^I fill in the day field with \"([^\"]*)\"$")
	public void fillInTheFieldDay(String day) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldDay(day);

	}

	@And("^I select in the month field with \"([^\"]*)\"$")
	public void selectInTheFieldMonth(String month) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.selectInTheFieldMonth(month);

	}

	@And("^I fill in the year field with \"([^\"]*)\"$")
	public void fillInTheFieldYear(String year) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.fillInTheFieldYear(year);

	}

	@And("^I select in the genre field with \"([^\"]*)\"$")
	public void selectInTheFieldGenre(String genre) {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.selectInTheFieldGenre(genre);

	}

	@And("^I click on next button at modal welcome$")
	public void clickOnNextButtonModalWelcome() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.clickOnNextButtonModalWelcome();

	}

	@And("^I click on yes button$")
	public void clickOnYesButton() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.clickOnYesButton();

	}

	@When("^I click on I agree button$")
	public void clickOnIAgreeButton() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.clickOnIAgreeButton();

	}

	@Then("^I should see a welcome message$")
	public void confirmMessage() {
		HomeLtdPage homeLtrPage = new HomeLtdPage();
		homeLtrPage.confirmMessage();

	}

}
