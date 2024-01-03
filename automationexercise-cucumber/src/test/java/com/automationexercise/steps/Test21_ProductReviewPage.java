package com.automationexercise.steps;

import com.automationexercise.pages.ProductsPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class Test21_ProductReviewPage {
    @Then("Verify that {string} text is visible")
    public void verifyThatTextIsVisible(String review) {
        Assert.assertEquals(new ProductsPage().verifyTextWriteYourReview(),review);
    }

    @When("User enter details and review")
    public void userEnterDetailsAndReview(DataTable dataTable) {
        List<String> reviewInfo = dataTable.asList(String.class);
        new ProductsPage().enterNameForReview(reviewInfo.get(0));
        new ProductsPage().enterEmailForReview(reviewInfo.get(1));
        new ProductsPage().enterTextForReview(reviewInfo.get(2));

    }

    @And("User submit review via submit button")
    public void userSubmitReviewViaSubmitButton() {
        new ProductsPage().clickOnSubmitBtnToSubmitReview();

    }

    @Then("verify The Text{string}")
    public void verifyTheText(String text) {
        Assert.assertEquals(new ProductsPage().verifyTheTextThankYouForYourReview(),text);
    }
}
