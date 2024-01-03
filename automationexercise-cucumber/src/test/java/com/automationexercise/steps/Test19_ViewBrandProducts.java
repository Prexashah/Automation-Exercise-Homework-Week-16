package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test19_ViewBrandProducts {
    @Then("Products Brand are visible as {string} on left side of bar")
    public void productsBrandAreVisibleAsOnLeftSideOfBar(String brandsText) {
        Assert.assertEquals(new HomePage().verifyBrandTextIsDisplayed(),brandsText);
    }

    @And("click on any brand name")
    public void clickOnAnyBrandName() {
        new HomePage().clickOnAnyBrandUnderBrands();

    }

    @Then("User should see the brand text {string}")
    public void userShouldSeeTheBrandText(String brandPageTitle) {
        Assert.assertEquals(new ProductsPage().verifyPoloBrandText(),brandPageTitle);
    }

    @And("verify that all products are displayed")
    public void verifyThatAllProductsAreDisplayed() {
        new ProductsPage().areProductsDisplayed();

    }

    @When("User click on brand link from the left side bar")
    public void userClickOnBrandLinkFromTheLeftSideBar() {
        new ProductsPage().clickOnAnotherBrandBiba();

    }

    @Then("User should verify text {string}")
    public void userShouldVerifyText(String bibaBranTitle) {
        Assert.assertEquals(new ProductsPage().verifyBibaBrandText(),bibaBranTitle);
    }

    @And("User can see all the products on the page")
    public void userCanSeeAllTheProductsOnThePage() {
        new ProductsPage().areProductsDisplayed();


    }
}
