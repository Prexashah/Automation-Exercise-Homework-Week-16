package com.automationexercise.steps;

import com.automationexercise.pages.ContactusPage;
import com.automationexercise.pages.HomePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;

public class Test6_ContactusFormSteps {
    @When("User click on contact us button")
    public void userClickOnContactUsButton() {
        new HomePage().clickOnContactusButton();
    }

    @Then("verify that {string} text is visible")
    public void verifyThatTextIsVisible(String getINTouchText) {
        Assert.assertEquals(new ContactusPage().verifyGetInTouchText(),getINTouchText,"user is not on contactus page");
    }

    @When("user enters name,email,subject and message")
    public void userEntersNameEmailSubjectAndMessage(DataTable dataTable) {
        List<String> contactInfo = dataTable.asList(String.class);
        new ContactusPage().enterName(contactInfo.get(0));
        new ContactusPage().enterEmail(contactInfo.get(1));
        new ContactusPage().enterSubject(contactInfo.get(2));
        new ContactusPage().enterMessage(contactInfo.get(3));
    }
    @And("User upload a file from {string}")
    public void userUploadAFileFrom(String filePath) {
        new ContactusPage().clickOnUploadFile(filePath);
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        new ContactusPage().clickOnSubmitButton();
    }

    @And("User should see alert and click on ok button")
    public void userShouldSeeAlertAndClickOnOkButton() {
        new ContactusPage().handlePopUPAfterSubmit();
    }

    @Then("verify the message{string}")
    public void verifyTheMessage(String successMessage) {
        Assert.assertEquals(new ContactusPage().verifyYourDetailsHaveBeenSubmittedSuccessfully(),successMessage,"user has not succesfullu submited contact us form");

    }

    @And("click on home button")
    public void clickOnHomeButton() {
        new ContactusPage().clickOnHomeButton();
    }

    @Then("Verify that user is on the homepage")
    public void verifyThatUserIsOnTheHomepage() {
        Assert.assertTrue(new HomePage().isHomePageVisible(), "User is not on the home page");

    }


}
