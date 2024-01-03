package com.automationexercise.steps;

import com.automationexercise.pages.HomeProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test13_AddProductAndVerifyTheQuantity {
    @When("Click on view products from any product on homepage")
    public void clickOnViewProductsFromAnyProductOnHomepage() {
        new HomeProductPage().clickAnyViewProductOnHomePage();
    }

    @And("User increases the quantity to {string}")
    public void userIncreasesTheQuantityTo(String quantity) {
        new HomeProductPage().changeQuantity();
        new HomeProductPage().sendNewQuantity(quantity);
    }

    @And("User clicks on add to cart button")
    public void userClicksOnAddToCartButtonAndViewCart() throws InterruptedException {
        new HomeProductPage().clickOnAddToCartButton();
        Thread.sleep(3000);
        new HomeProductPage().clickOnViewCartLink();

    }

    @Then("User should verify that the product is displayed with quantity{string}")
    public void userShouldVerifyThatTheProductIsDisplayedWithQuantity(String newQuantity) {
        Assert.assertEquals(new HomeProductPage().verifyCartWithNewQuantity(),newQuantity,"Incorrect quantity");

    }


}
