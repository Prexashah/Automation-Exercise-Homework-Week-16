package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Test12_AddProductInToTheCartAndVerifyDetails {
    @And("User hover over first product and clicks on add to cart")
    public void userHoverOverFirstProductAndClicksOnAddToCart() {

        new ProductsPage().addFirstProductToCart();
    }

    @And("Click on continue shopping button")
    public void clickOnContinueShoppingButton() throws InterruptedException {
        Thread.sleep(3000);
        new ProductsPage().clickOnContinueShoppingButton();
    }

    @And("User hover over the second product and clicks on add to cart")
    public void userHoverOverTheSecondProductAndClicksOnAddToCart() throws InterruptedException {
        new ProductsPage().addSecondProductToCart();
        Thread.sleep(3000);
        new ProductsPage().clickOnContinueShoppingButton();
    }

    @And("User click on view cart button")
    public void userClickOnViewCartButton() {
        new ProductsPage().clickOnViewCartButton();
    }

    @Then("user should verify both products are added to cart")
    public void userShouldVerifyBothProductsAreAddedToCart() {
    }

    @And("User verify their prices, quantity and total price")
    public void userVerifyTheirPricesQuantityAndTotalPrice() {
    }
}
