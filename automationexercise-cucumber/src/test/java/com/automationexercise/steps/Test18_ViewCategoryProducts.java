package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.MenPage;
import com.automationexercise.pages.WomenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test18_ViewCategoryProducts {
    @Then("Verify that {string} are visible on left side of bar")
    public void verifyThatAreVisibleOnLeftSideOfBar(String category) {
        Assert.assertEquals(new HomePage().verifyTextCategory(),category);
    }

    @And("Click on women category")
    public void clickOnWomenCategory() {
        new HomePage().clickOnWomenLink();

    }

    @And("User click on the link under the women category")
    public void userClickOnTheLinkUnderTheWomenCategory() {
        new HomePage().clickOnWomenSubLinkDress();

    }

    @Then("verify the text {string}")
    public void verifyTheText(String title) {
        Assert.assertEquals(new WomenPage().verifyTitleOnWomenPage(),title,"you are not on the women page");

    }

    @And("User click on MEN from category list")
    public void userClickOnMENFromCategoryList() {
        new WomenPage().clickOnMENLink();
    }

    @When("User clicks on subcategory of MEN")
    public void userClicksOnSubcategoryOfMEN() {
        new WomenPage().clickOnMenSubLink();

    }


    @Then("Verify the text {string} is visible")
    public void verifyTheTextIsVisible(String menTitle) throws InterruptedException {
        Thread.sleep(3000);

        Assert.assertEquals(new MenPage().verifyTheTitleOfMenCategory(),menTitle,"User is not on the men's page");
    }
}
