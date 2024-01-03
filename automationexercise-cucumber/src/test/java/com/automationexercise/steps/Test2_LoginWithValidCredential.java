package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.NewUserSignUpPAge;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test2_LoginWithValidCredential {
    @Then("Verify that homepage is visible successfully")
    public void verifyThatHomepageIsVisibleSuccessfully() {
        Assert.assertTrue(new HomePage().isHomePageVisible(), "User is not on the home page");
    }

    @When("User clicks on SignupLogin button")
    public void userClicksOnSignupLoginButton() {
        new HomePage().clickOnSignupLoginLink();
    }

    @Then("verify that {string} is visible")
    public void verifyThatIsVisible(String loginHeading) {

    Assert.assertTrue(new NewUserSignUpPAge().verifyLoginToYourAccountText().contains(loginHeading),"User is not on the login page" );
       // Assert.assertEquals(new NewUserSignUpPAge().verifyLoginToYourAccountText(), loginHeading, "user is not on the login page");
    }


    @When("User enter correct email address{string}")
    public void userEnterCorrectEmailAddress(String email) {
        new NewUserSignUpPAge().enterCorrectEmailToLoginYourAccount(email);
    }

    @And("User enter correct password{string}")
    public void userEnterCorrectPassword(String password) {
        new NewUserSignUpPAge().enterCorrectPasswordToLoginYourAccount(password);
    }


    @And("Click on login button")
    public void clickOnLoginButton() {

        new NewUserSignUpPAge().clickOnLoginButtonToLoginYourAccount();
    }

    @When("User click on delete account")
    public void userClickOnDeleteAccount() {
        new HomePage().clickOnDeleteAccountButton();

    }

    @Then("verify that heading {string}")
    public void verifyThatHeading(String acDeleted) {
        Assert.assertEquals(new HomePage().verifyAccountDeleted(),acDeleted,"account is not deleted");

    }


}
