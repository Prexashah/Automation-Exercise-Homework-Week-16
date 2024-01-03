package com.automationexercise.steps;

import com.automationexercise.pages.NewUserSignUpPAge;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test3_LoginWithIncorrectCredentialSteps {
    @When("user enters incorrect email{string}")
    public void userEntersIncorrectEmail(String email) {
        new NewUserSignUpPAge().enterCorrectEmailToLoginYourAccount(email);
    }

    @And("user enters incorrect password{string}")
    public void userEntersIncorrectPassword(String password) {
        new NewUserSignUpPAge().enterCorrectPasswordToLoginYourAccount(password);

    }

    @And("clicks on login button")
    public void clicksOnLoginButton() {
        new NewUserSignUpPAge().clickOnLoginButtonToLoginYourAccount();

    }

    @Then("user verify the error message{string}")
    public void userVerifyTheErrorMessage(String verifyErrorMsg) {
        Assert.assertEquals(new NewUserSignUpPAge().verifyYourEmailAndPasswordIsIncorrect(),verifyErrorMsg,"user logged in successfully");

    }
}
