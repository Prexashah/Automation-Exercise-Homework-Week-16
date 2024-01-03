package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class Test8_ProductDetailsVerification {
    @When("User click on product button")
    public void userClickOnProductButton() {
        new HomePage().clickOnProductButton();
    }

    @Then("user should navigate to{string} is visible")
    public void userShouldNavigateToIsVisible(String allProductText) throws InterruptedException {
        Assert.assertEquals(new ProductsPage().verifyTextAllProducts(), allProductText, "user is not on the product page");
        Thread.sleep(5000);
    }

    @When("user clicks on view product of the first product")
    public void userClicksOnViewProductOfTheFirstProduct() {
        new ProductsPage().clickOnFirstViewProduct();
    }

    @Then("user should verify the products name,category,price,availability,condition,brand")
    public void userShouldVerifyTheProductsNameCategoryPriceAvailabilityConditionBrand(DataTable dataTable) {
        List<String> verifyProductDetails = dataTable.asList(String.class);
      //  Assert.assertEquals(new ProductsPage().getProductName(),verifyProductDetails.get(0));
        Assert.assertTrue(new ProductsPage().verifyFirstProductName(verifyProductDetails.get(0)));
        Assert.assertTrue(new ProductsPage().verifyFirstProductCategory(verifyProductDetails.get(1)));
        Assert.assertTrue(new ProductsPage().verifyFirstProductPrice(verifyProductDetails.get(2)));
        Assert.assertTrue(new ProductsPage().verifyFirstProductAvailability(verifyProductDetails.get(3)));
        Assert.assertTrue(new ProductsPage().verifyFirstProductCondition(verifyProductDetails.get(4)));
        Assert.assertTrue(new ProductsPage().verifyFirstProductBrand(verifyProductDetails.get(5)));


    }
}
