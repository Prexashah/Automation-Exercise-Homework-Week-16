package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.TestCasesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Test7_TestcasePage {
    @When("click on Testcase button")
    public void clickOnTestcaseButton() {
        new HomePage().clickOnTestCasesLink();
    }

    @Then("verify that user is on test case page and text is{string} visible")
    public void verifyThatUserIsOnTestCasePageAndTextIsVisible(String testCaseTxt) {
        Assert.assertEquals(new TestCasesPage().verifyTextTestCases(),testCaseTxt,"user is not on testcases page");
    }
}
