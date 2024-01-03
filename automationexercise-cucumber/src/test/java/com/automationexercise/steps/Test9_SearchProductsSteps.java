package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test9_SearchProductsSteps {
    @When("user enter Product name{string} in search input and click search button")
    public void userEnterProductNameInSearchInputAndClickSearchButton(String searchTerm) {
        new ProductsPage().sendProductNameOnSearchbar(searchTerm);
        new ProductsPage().clickOnSearchBar();
    }

    @Then("verify {string} is visible")
    public void verifyIsVisible(String searchProducts) {
        Assert.assertEquals(new ProductsPage().verifyTitleSearchedProducts(),searchProducts,"not on the search product page");

    }

    @Then("Verify all the product related to search are visible")
    public void verifyAllTheProductRelatedToSearchAreVisible(){
        int numberOfProducts = new ProductsPage().areProductsDisplayed();
        Assert.assertTrue(numberOfProducts!= 0,"No products Displayed");


    }


}
