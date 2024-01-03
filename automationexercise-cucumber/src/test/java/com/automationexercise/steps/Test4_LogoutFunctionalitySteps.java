package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test4_LogoutFunctionalitySteps {
    @When("user click on logout button")
    public void userClickOnLogoutButton() {
        new HomePage().clickOnLogoutButton();
    }

    @Then("verify that user is navigate to {string}")
    public void verifyThatUserIsNavigateTo(String newUser) {
        Assert.assertEquals(new HomePage().verifyNewUserText(), newUser, "User is not on the login page");
    }
}
