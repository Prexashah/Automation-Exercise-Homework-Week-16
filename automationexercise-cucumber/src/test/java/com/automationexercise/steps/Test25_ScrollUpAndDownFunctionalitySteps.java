package com.automationexercise.steps;

import com.automationexercise.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import static com.automationexercise.browserfactory.ManageBrowser.driver;

public class Test25_ScrollUpAndDownFunctionalitySteps {
    @And("User click on arrow at bottom right and move upward")
    public void userClickOnArrowAtBottomRightAndMoveUpward() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Long scrollPosition = (Long) js.executeScript("return window.pageYOffset;");
        if (scrollPosition == 0) {
            System.out.println("Page is scrolled up");
        } else {
            System.out.println("Page is not scrolled up");
        }

    }

    @Then("verify that{string} is visible")
    public void verifyThatIsVisible(String text) {
        Assert.assertEquals(new HomePage().verifyTextAutomationEngineers(), text);
    }
}
