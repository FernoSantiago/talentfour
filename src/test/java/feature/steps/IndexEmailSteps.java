package feature.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.IndexEmailPage;
import test.ReportRules;

@CucumberOptions(features = "feature", glue = { "StepDefinition" })

public class IndexEmailSteps {

	@Given("^I have access in the page$")
	public void accessPage() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.accessPage();
		
	}

	@And("^I click on new acount button$")
	public void clickOnNewAcountButton() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.clickOnNewAcountButton();
	}

	@And("^I fill in the name field with \"([^\"]*)\"$")
	public void fillInTheFieldName(String name) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldName(name);

	}

	@And("^I fill in the last name field with \"([^\"]*)\"$")
	public void fillInTheFieldLastName(String lastName) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldLastName(lastName);

	}

	@And("^I fill in the user name field with \"([^\"]*)\"$")
	public void fillInTheFieldUserName(String userName) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldUserName(userName);

	}

	@And("^I fill in the password field with \"([^\"]*)\"$")
	public void fillInTheFieldPassword(String passwd) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldPassword(passwd);

	}

	@And("^I fill in the confirm password field with \"([^\"]*)\"$")
	public void fillInTheFieldConfirmPass(String confirmPasswd) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldConfirmPass(confirmPasswd);

	}

	@And("^I click on next button at modal create acount google$")
	public void clickOnNextButtonModalCreateAcountGoogle() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.clickOnNextButtonModalCreateAcountGoogle();

	}

	@And("^I fill in the phone field with \"([^\"]*)\"$")
	public void fillInTheFieldPhone(String phone) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldPhone(phone);

	}

	@And("^I click on next button at modal check phone$")
	public void clickOnNextButtonModalCheckPhone() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.clickOnNextButtonModalCheckPhone();

	}

	@And("^I fill in the verification code field with \"([^\"]*)\"$")
	public void fillInTheFieldVerificationCode(String code) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldVerificationCode(code);

	}

	@And("^I click on check button at motal of verification$")
	public void clickOnCheckButtonModalVerification() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.clickOnCheckButtonModalVerification();

	}

	@And("^I fill in the day field with \"([^\"]*)\"$")
	public void fillInTheFieldDay(String day) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldDay(day);

	}

	@And("^I select in the month field with \"([^\"]*)\"$")
	public void selectInTheFieldMonth(String month) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.selectInTheFieldMonth(month);

	}

	@And("^I fill in the year field with \"([^\"]*)\"$")
	public void fillInTheFieldYear(String year) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.fillInTheFieldYear(year);

	}

	@And("^I select in the genre field with \"([^\"]*)\"$")
	public void selectInTheFieldGenre(String genre) {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.selectInTheFieldGenre(genre);

	}

	@And("^I click on next button at modal welcome$")
	public void clickOnNextButtonModalWelcome() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.clickOnNextButtonModalWelcome();

	}

	@And("^I click on yes button$")
	public void clickOnYesButton() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.clickOnYesButton();

	}

	@When("^I click on I agree button$")
	public void clickOnIAgreeButton() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.clickOnIAgreeButton();

	}

	@Then("^I should see a welcome message$")
	public void confirmMessage() {
		IndexEmailPage homeLtrPage = new IndexEmailPage();
		homeLtrPage.confirmMessage();
		ReportRules.logPrint("Acount Gmail");

	}

}
