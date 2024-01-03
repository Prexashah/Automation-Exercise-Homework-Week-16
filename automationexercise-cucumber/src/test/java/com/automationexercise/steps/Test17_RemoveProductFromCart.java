package com.automationexercise.steps;

import com.automationexercise.pages.ShoppingCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test17_RemoveProductFromCart {
    @When("User click on X button")
    public void userClickOnXButton() {
        new ShoppingCartPage().clickOnXButtonToRemoveProductFromCart();
    }


    @Then("verify that Product is removed from the cart{string}")
    public void verifyThatProductIsRemovedFromTheCart(String text) {
       Assert.assertEquals(new ShoppingCartPage().verifyThatCartIsEmptyText(),text,"your cart is not empty");
    }
}
