package com.automationexercise.steps;

import com.automationexercise.browserfactory.ManageBrowser;
import com.automationexercise.pages.AccountCreatedPage;
import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.NewUserSignUpPAge;
import com.automationexercise.pages.RegisterAccountPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.List;

public class AccountRegAndDeletion {
    private static final Logger log = LogManager.getLogger(ManageBrowser.class);


    @Given("Launch browser")
    public void launchBrowser() {

        new HomePage().launchBrowser();
    }

    @Then("verify that homepage is visible successfully")
    public void verifyThatHomepageIsVisibleSuccessfully() {
        Assert.assertTrue(new HomePage().isHomePageVisible(), "User is not on the home page");

    }
    @When("User clicks on Signup\\/Login button")
    public void userClicksOnSignupLoginButton() {
        new HomePage().clickOnSignupLoginLink();

    }
    @Then("verify {string}is visible")
    public void verifyIsVisible(String newUser) {
        Assert.assertEquals(new HomePage().verifyNewUserText(),newUser,"User is not on the login page");
    }



    @When("User enter{string}in name field")
    public void userEnterInNameField(String name) {
        new NewUserSignUpPAge().enterName(name);

    }

    @And("User enter{string} in the emailField")
    public void userEnterInTheEmailField(String email) {
        new NewUserSignUpPAge().enterEmailAddress(email);
    }

    @And("User clicks on Signup button")
    public void userClicksOnSignupButton() {
        new NewUserSignUpPAge().clickOnSignupButton();
    }

    @Then("Verify {string} is visible")
    public void verify_IsVisible(String title) {
        Assert.assertEquals(new RegisterAccountPage().verifyEnterAccountInformation(),title,"User is not on Account Reg. page");

    }


    @When("fill the details")
    public void fillTheDetails(DataTable table) {
        List<String> registerInfo = table.asList( String.class);
        new RegisterAccountPage().selectTitle(registerInfo.get(0));
        new RegisterAccountPage().enterPassword(registerInfo.get(1));
        new RegisterAccountPage().selectDayFromDateOfBirth(registerInfo.get(2));
        new RegisterAccountPage().selectMonthFromDateOfBirth(registerInfo.get(3));
        new RegisterAccountPage().selectYearFromDateOfBirth(registerInfo.get(4));

    }
    @And("select checkbox signUP for news letter box")
    public void selectCheckboxSignUPForNewsLetterBox() {
        new RegisterAccountPage().selectSignUpForOurNewsLetter();
    }

    @And("select checkbox receive special offers from our partner!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartner() {
        new RegisterAccountPage().selectReceiveASpecialOfferFromOurPartners();
    }

    @When("User fill below details")
    public void userFillBelowDetails(DataTable dataTable) {
        List<String> addressInfo = dataTable.asList(String.class);
        new RegisterAccountPage().enterFirstName(addressInfo.get(0));
        new RegisterAccountPage().enterLastName(addressInfo.get(1));
        new RegisterAccountPage().enterCompanyName(addressInfo.get(2));
        new RegisterAccountPage().enterFirstLineAddress(addressInfo.get(3));
        new RegisterAccountPage().enterSecondLineAddress(addressInfo.get(4));
        new RegisterAccountPage().selectCountryFromDropDown(addressInfo.get(5));
        new RegisterAccountPage().enterStateName(addressInfo.get(6));
        new RegisterAccountPage().enterCityName(addressInfo.get(7));
        new RegisterAccountPage().enterZipcode(addressInfo.get(8));
        new RegisterAccountPage().enterMobileNumber(addressInfo.get(9));

    }

    @And("User clicks on Create Account button")
    public void userClicksOnCreateAccountButton() {
        new RegisterAccountPage().clickOnCreateAccountBtn();

    }


    @Then("verify that {string}is visible")
    public void verifyThatIsVisible(String account) {
      Assert.assertEquals(new AccountCreatedPage().verifyTextAccountCreated(),account,"Account has not been created");
    }

    @And("User click on continue button")
    public void userClickOnContinueButton() {
        new AccountCreatedPage().clickOnContinueButton();
    }
    @Then("verify that {string}")
    public void verifyThatUserLoggedIN(String userLogged) {
        Assert.assertEquals(new HomePage().verifyThatUserLoggedIN(),userLogged,"User is not logged in");

    }

    @When("click on delete account button")
    public void clickOnDeleteAccountButton() {
        new HomePage().clickOnDeleteAccountButton();

    }

    @Then("verify that {string}heading")
    public void verifyThatHeading(String acDeleted) {
        Assert.assertEquals(new HomePage().verifyAccountDeleted(),acDeleted,"account is not deleted");
    }

    @And("Clcik on continueButton")
    public void clcikOnContinueButton() {
        new HomePage().clickOnContinueBtnAfterAccountDeleted();
    }


}





