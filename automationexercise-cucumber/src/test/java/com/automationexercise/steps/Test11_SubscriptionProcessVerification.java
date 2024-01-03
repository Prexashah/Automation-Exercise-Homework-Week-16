package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.When;

public class Test11_SubscriptionProcessVerification {
    @When("User click on cart button")
    public void userClickOnCartButton() {
        new HomePage().clickOnCartButton();
    }
}
