package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class Test22_AddRecommendedItemsToCart {
    @Then("verify that {string} text is there")
    public void verifyThatTextIsThere(String text) {
        Assert.assertEquals(new HomePage().verifyTextRecommendedItems(), text);


    }

    @And("click on add to cart button")
    public void clickOnAddToCartButton() {
        new HomePage().clickOnAddToCartFromRecommendedItems();
    }


}
