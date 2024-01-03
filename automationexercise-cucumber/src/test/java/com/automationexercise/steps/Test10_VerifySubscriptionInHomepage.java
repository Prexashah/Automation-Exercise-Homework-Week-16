package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test10_VerifySubscriptionInHomepage {
    @When("User scroll down to footer")
    public void userScrollDownToFooter() {
        new HomePage().scrollDownToBottom();
    }

    @Then("User should verify the text {string}")
    public void userShouldVerifyTheText(String textSubscription) {
        Assert.assertEquals(new HomePage().verifyTheTextSubscription(),textSubscription,"Bar has not scrolled down");

    }

    @When("User enters email {string}")
    public void userEntersEmail(String email) {
        new HomePage().enterEmailForSubscription(email);
        new HomePage().clickOnSubscriptionBtn();
    }


    @Then("user should see the text {string}")
    public void userShouldSeeTheText(String successMessage) {
        Assert.assertEquals(new HomePage().verifySuccessMessageAfterSubscription(),successMessage,"user is not subscribed");
    }
}
