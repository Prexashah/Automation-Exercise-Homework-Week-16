package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.NewUserSignUpPAge;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test5_RegisterUserWithExistingEmailSteps {
    @Then("Verify that {string} is visible")
    public void verifyThatIsVisible(String newUser) {
        Assert.assertEquals(new HomePage().verifyNewUserText(), newUser, "User is not on the login page");
    }

    @When("User enter name{string}")
    public void userEnterName(String name) {
        new NewUserSignUpPAge().enterName(name);
    }

    @And("User enter existing email{string}")
    public void userEnterExistingEmail(String newUserEmail) {
        new NewUserSignUpPAge().enterEmailAddress(newUserEmail);
    }

    @And("clicks on signup button")
    public void clicksOnSignupButton() {
        new NewUserSignUpPAge().clickOnSignupButton();
    }

    @Then("verify the text{string}")
    public void verifyTheText(String emailExist) {
        Assert.assertEquals(new NewUserSignUpPAge().verifyEmailAlreadyExistText(),emailExist,"you are a new user");

    }
}
